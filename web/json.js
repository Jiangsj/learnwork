var xiaoming={
	name:'小明'，
	age：14，
	gender:true,
	height:1.65,
	grade:null,
	'middle-school': '\"W3C\"Middle School',
	skills:['JavaScript','Java','Python','Lisp']
	toJSON: function(){
		return{
			'Name':this.name,
			'Age':this.age,
		};
 }
};
function convert(key,value){
	if(typeof value=== 'string'){
		return value.toUpperCase()
	}
	return value;
}
JSON.stringify(xiaoming,convert,' ');
JSON.parse('{"name":"小明"，"age":"14"}',function(key,value){
	if (key==='name'){
		return value+'同学';
	}
	return value;
});
