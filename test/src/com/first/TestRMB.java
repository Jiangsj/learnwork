package com.first;
/***
 * @author Ranger
 * @function ��������Ҷ���ĵ�Ԫ��������
 * @times 2014-10-18
 * **/
import org.junit.*;
public class TestRMB {
	@Test
	public void test1(){
		RMB erYuan=new RMB(2);//�½�һ������Ҷ���
		int a;
		erYuan.times(2);//��������ҷ���
		Assert.assertEquals(4, erYuan.amount);
}
}