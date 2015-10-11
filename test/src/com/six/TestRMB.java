package com.six;

import java.util.Currency;

/***
 * @author Ranger
 * @function 
 * 1、用钱的数量相等来解决对象伪相等性
 * 2、用了调用times返回一个人民币对象来解决以前的对象值发生变化
 * @times 2014-10-18
 * **/
import org.junit.*;
public class TestRMB {
//	@Test
//	public void test1(){
//		RMB erYuan=new RMB(2);//新建一个人民币对象
//		//System.out.println("eryuan="+erYuan.amount);
////		RMB siyuanRMB=(RMB) erYuan.times(2);
//		//erYuan.times(2);//条用人民币方法
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
	 * 1.Bank里面的reduce开始实现
	 * 2.把reduce方法写到Money里面
	 * 3.把自己传入sum里面reduce方法，会报错
	 * 4.自后把reduce写入到表达式接口
	 */
	 
	 @Test
	 public  void testReduceSum(){
		 //新建2个人民币对象
		 Money fiveRMB=Money.rmb(5);
		 Money tenRMB=Money.rmb(20);
		 //人民币对象求和，返回一个Expression 接口
		 Expression sum=new Sum(fiveRMB,tenRMB);
		 Bank bank=new Bank();//初始化银行类，去实现换算方法（reduce）
		 Money result= bank.reduce(sum, "CNY");
		 Assert.assertEquals(new RMB(25), result); 
		 
		 Money resMoney=bank.reduce(Money.rmb(2), "CNY");
		 Assert.assertEquals(new RMB(2), resMoney);
	 }
}