//原型对象
var student={
	name:'Robot',
	height:1.2,
	run: function(){
		alert(this.name+'is runing ....');
	}
};
function createstudent(name)
{
	//基于sutdent原型创建一个新对象
	var s=Object.create(student);
	//初始化新对象
	s.name=name;
	return s;
}
var xiaoming=createstudent('小明');
xiaoming.run();


