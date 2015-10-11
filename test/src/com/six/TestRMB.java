package com.six;

import java.util.Currency;

/***
 * @author Ranger
 * @function 
 * 1����Ǯ������������������α�����
 * 2�����˵���times����һ������Ҷ����������ǰ�Ķ���ֵ�����仯
 * @times 2014-10-18
 * **/
import org.junit.*;
public class TestRMB {
//	@Test
//	public void test1(){
//		RMB erYuan=new RMB(2);//�½�һ������Ҷ���
//		//System.out.println("eryuan="+erYuan.amount);
////		RMB siyuanRMB=(RMB) erYuan.times(2);
//		//erYuan.times(2);//��������ҷ���
////		Assert.assertEquals(4, erYuan.amount);
//		Assert.assertEquals(new RMB(2), erYuan);
//		//Assert.assertEquals(erYuan.times(2).times(10), new RMB(40));
//		Dollar erDollar =new Dollar(2);
//		Assert.assertEquals(new Dollar(2), erDollar);
//		//Money erMoney=new Money(2);
//		//Assert.assertEquals(new Money(2), erMoney);
//		//Assert.assertEquals(new RMB(2), new Dollar(2));
//		Assert.assertEquals(Money.rmb(2), new RMB(2));
//		Assert.assertEquals(Money.rmb(2).currency(), "CNY");
//		Assert.assertEquals(Money.dollar(2).currency(), "USD");
//		Assert.assertEquals(Money.rmb(2), Money.rmb(2));
//}
	@Test
	public void testPlus(){
//		Money fiveRMB=Money.rmb(5);
//		Money tenRMB=Money.rmb(10);
//		Money sum=fiveRMB.plus(fiveRMB);
//		Assert.assertEquals(tenRMB, sum);
//		Expression sum=fiveRMB.plus(fiveRMB);
//		Bank bank=new Bank();
//		Money reduced=bank.reduce(sum,"CNY"); 
//		Assert.assertEquals(tenRMB, reduced);
		Money fiveRMB=Money.rmb(5);
		Money teMoney=Money.rmb(10);
		Expression result=fiveRMB.plus(fiveRMB);
		Sum sum=(Sum)result;
		Assert.assertEquals(fiveRMB, sum.addend);
		Assert.assertEquals(fiveRMB, sum.augend);
	}
	/***
	 * 1.Bank�����reduce��ʼʵ��
	 * 2.��reduce����д��Money����
	 * 3.���Լ�����sum����reduce�������ᱨ��
	 * 4.�Ժ��reduceд�뵽���ʽ�ӿ�
	 */
	 
	 @Test
	 public  void testReduceSum(){
		 //�½�2������Ҷ���
		 Money fiveRMB=Money.rmb(5);
		 Money tenRMB=Money.rmb(20);
		 //����Ҷ�����ͣ�����һ��Expression �ӿ�
		 Expression sum=new Sum(fiveRMB,tenRMB);
		 Bank bank=new Bank();//��ʼ�������࣬ȥʵ�ֻ��㷽����reduce��
		 Money result= bank.reduce(sum, "CNY");
		 Assert.assertEquals(new RMB(25), result); 
		 
		 Money resMoney=bank.reduce(Money.rmb(2), "CNY");
		 Assert.assertEquals(new RMB(2), resMoney);
	 }
}