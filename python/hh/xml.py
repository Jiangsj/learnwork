'''
Created on 2015��10��15��

@author: admin
'''
from xml.sax.handler import ContentHandler
from xml.sax import parse
import os
from sys import prefix
from test.test_inspect import attrs_wo_objs
from os import name
from ast import parse
class Dispatcher(object):
    '''
    ����xml����webҳ
    '''


#     def __init__(self, params):
#         '''
#         Constructor
#         '''
    def dispatch(self,prefix,name,attrs=None):
        mname=prefix+name.capitalize()
        dname='default'+prefix.capitalize()
        method=getattr(self, mname,None)
        if callable(method): args=()
        else:
            method=getattr(self, dname,None)
            args=name,
        if prefix =='start':args +=attrs,
        if callable(method):method(*args)
    def startElement(self,name,attrs):
        self.dispatch('start',name,attrs)
    def endElement(self,name):
        self.dispatch('end',name)

class websiteConstructor(Dispatcher,ContentHandler):
        passthrough=False
        def __init__(self,directroy):
                self.directory=[directroy]
                self.ensureDirectory()
        def ensureDirectory(self):
                path=os.path.join(*self.directory)
                print(path)
                print('----')
                if not os.path.isdir(path):
                    os.mkdir(path)
        def characters(self, chars):
                if self.passthrough:
                    self.out.write(chars)
        def defaultStart(self,name,attrs):
                if self.passthrough:
                        self.out.write('<'+name)
                        for key,val in attrs.items():
                                self.out.write('%s=%s' %(key,val))
                        self.out.write('>')
        def defaultEnd(self,name):
                if self.passthrough:
                    self.out.write('</%s>' % name)
        def startDirectory(self,attrs):
                self.directory.append(attrs['name'])
                self.ensureDirectory()
        def endDirectory(self):
                print('endDirectory')
                self.directory.pop()
        def startPage(self,attrs):
                print('startPage')
                filename=os.path.join(*self.directory+[attrs['name']+'.html'])
                self.out=open(filename,'W')
                self.writeHeader(attrs['title'])
                self.passthrough=True
        def endPage(self):
                print('endPage')
                self.passthrough=False
                self.writeFooter()
                self.out.close()
        def writeHeader(self,title):
                self.out.write('<html>\n <head>\n  <title>')
                self.out.write(title)
                self.out.write('</title>\n </head>\n <body>\n')
        def writeFooter(self):
                self.out.write('\n </body>\n</html>\n')
parse('website.xml',websiteConstructor('public_html'))
                
                    