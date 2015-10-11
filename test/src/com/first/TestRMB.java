package com.first;
/***
 * @author Ranger
 * @function 测试人民币对象的单元测试用例
 * @times 2014-10-18
 * **/
import org.junit.*;
public class TestRMB {
	@Test
	public void test1(){
		RMB erYuan=new RMB(2);//新建一个人民币对象
		int a;
		erYuan.times(2);//条用人民币方法
		Assert.assertEquals(4, erYuan.amount);
}
}