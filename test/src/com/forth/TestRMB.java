package com.forth;
/***
 * @author Ranger
 * @function 
 * 1����Ǯ������������������α�����
 * 2�����˵���times����һ������Ҷ����������ǰ�Ķ���ֵ�����仯
 * @times 2014-10-18
 * **/
import org.junit.*;
public class TestRMB {
	@Test
	public void test1(){
		RMB erYuan=new RMB(2);//�½�һ������Ҷ���
		//System.out.println("eryuan="+erYuan.amount);
//		RMB siyuanRMB=(RMB) erYuan.times(2);
		//erYuan.times(2);//��������ҷ���
//		Assert.assertEquals(4, erYuan.amount);
		Assert.assertEquals(new RMB(2), erYuan);
		//Assert.assertEquals(erYuan.times(2).times(10), new RMB(40));
		Dollar erDollar =new Dollar(2);
		Assert.assertEquals(new Dollar(2), erDollar);
		//Money erMoney=new Money(2);
		//Assert.assertEquals(new Money(2), erMoney);
		//Assert.assertEquals(new RMB(2), new Dollar(2));
		Assert.assertEquals(Money.rmb(2), new RMB(2));
		Assert.assertEquals(Money.rmb(2).currency(), "CNY");
		Assert.assertEquals(Money.dollar(2).currency(), "USD");
	}
}