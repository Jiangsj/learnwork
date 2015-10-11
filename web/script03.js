
//由于函数无法保存状态，故需要一个全局变量current_id来保存数字。

//不用闭包，试用generator改写：

//'use strict';
function* next_id() {     
    var  a = 1;
       
    while (true) {
        yield a;
        a=a+1;
    }
    return a;
}


// 测试:
var
    x,
    pass = true,
    g = next_id();
for (x = 1; x < 100; x ++) {
    if (g.next().value !== x) {
        pass = false;
        alert('测试失败!');
        break;
    }
}
if (pass) {
    alert('测试通过!');
}