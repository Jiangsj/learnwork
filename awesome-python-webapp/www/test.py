__author__ = 'Ranger'
# def myfunc():
#     print("myfunc() called.")
#
# myfunc()
# myfunc()
def deco(func):
    print("before myfunc() called.")
    func()
    return func

def myfunc():
    print("myfunce() called.")

myfunc=deco(myfunc)