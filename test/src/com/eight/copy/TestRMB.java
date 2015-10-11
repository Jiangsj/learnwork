package com.eight.copy;

/***
 * @author woody
 * @function 
 *   1、
 *   2、
 * @times 2014-12-06
 * **/
import org.junit.Assert;
import org.junit.Test;

public class TestRMB {
	// @Test
	// public void test1() {
	// RMB erYuan = new RMB(2);//新建立一个人民币对象
	// //RMB siyuanRmb = erYuan.times(2);//调用人民币翻倍的方法
	// //System.out.print("eryuan="+erYuan.amount +"siyuan= "+siyuanRmb.amount);
	// //Assert.assertEquals(4, erYuan.amount);//2元翻倍的值是4，和4比较是否相等
	// Assert.assertEquals(new RMB(2), erYuan);//新new2元对象和以前new的2元对象比较
	// //Assert.assertEquals(new RMB(2), new RMB(2));//新new2元对象和以前new的2元对象比较
	// //Assert.assertEquals(erYuan, erYuan);
	// //Assert.assertEquals(erYuan.times(2).times(10), new RMB(40));
	// //erYuan.amount = 12;
	// Dollar erDollar = new Dollar(2);
	// // Money erMoney = new Money(2);
	// // Assert.assertEquals(new Money(2), erMoney);
	// Assert.assertEquals(new RMB(4), erYuan.times(2));
	// //Assert.assertEquals(new RMB(2), new Dollar(2));//不等
	// Assert.assertEquals(Money.rmb(2),new RMB(2));
	//
	// Assert.assertEquals(Money.rmb(2).currency(),"CNY");
	// Assert.assertEquals(Money.dollar(2).currency(),"USD");
	// //Assert.assertEquals(Money.rmb(2),Money.dollar(2));
	// }

	/***
	 * @times 2014-12-06 1.解决加和被加数（谁加谁） 2.创建一个Sum，然后在Money表达式里面实现plus,return new
	 *        Sum(this, addend); 3.把sum 加数addend和被加数augend初始化
	 * 
	 */
	@Test
	public void testPlus() {
		// 初始化5元和10元人民币
		// Money fiveRMB = Money.rmb(5);
		// Money tenRMB = Money.rmb(10);
		// 在返回的一个Money接口对象里面做加法运算
		// Expression sum = fiveRMB.plus(fiveRMB);
		// //新建银行类
		// Bank bank = new Bank();
		// //换算操作
		// Money reduced =bank.reduce(sum,"CNY");
		// //断言
		// Assert.assertEquals(tenRMB,reduced);
		Money fiveRMB = Money.rmb(5);
		Money tenRMB = Money.rmb(10);
		Expression result = fiveRMB.plus(fiveRMB);
		Sum sum = (Sum) result;
		Assert.assertEquals(fiveRMB, sum.addend);
		Assert.assertEquals(fiveRMB, sum.augend);
		//
	}

	/***
	 * 1.Bank里面的reduce开始实现 2.把reduce方法写到Money里面 3.把自己传入sum里面reduce方法，会报错
	 * 4.最后把reduce写入到表达式接口
	 */
	@Test
	public void testReduceSum() {
		// 新建2个人民币对象
		Money fiveRMB = Money.rmb(5);
		Bank bank = new Bank();
		bank.addRate("CNY", "USD", 2);
		// Money result = bank.reduce(new Dollar(1), "USD");
		// Assert.assertEquals(new Dollar(1), result);
		Assert.assertEquals(2, new Bank().rate("CNY", "USD"));
	}

	@Test
	public void testMixedAdd() {
//		1、修正Money里面getCurrency（）方法写错了
//		2、pair 方法里面 return from.equals(pair.from) &&to.equals(pair.to); 写错
		Money fiveBucks = Money.dollar(5);
		System.out.println(fiveBucks);
		Money tenRMB = Money.rmb(10);
		System.out.println(tenRMB);
		Bank bank = new Bank();
		bank.addRate("CNY", "USD", 2);
		Money result = bank.reduce(fiveBucks.plus(tenRMB), "USD");
		
		System.out.print("result= "+result.amount+"curr ="+result.currency() +"obj="+result);
		Assert.assertEquals(1, new Bank().rate("USD", "USD"));
		Assert.assertEquals(new Money(10,"USD"), result);
		//Assert.assertEquals(new Dollar(10,"USD"), result);
	}
	
	@Test
	public void testMixedAdd2() {
//		1、expression
//		
		Expression fiveBucks = Money.dollar(5);
		Expression tenRMB = Money.rmb(10);
		Bank bank = new Bank();
		bank.addRate("CNY", "USD", 2);
		Expression result = bank.reduce(fiveBucks.plus(tenRMB), "USD");
		
		System.out.print("result= "+result.reduce("USD").amount+"curr ="+result.reduce("USD").currency() +"obj="+result);
		
		Assert.assertEquals(new Money(10,"USD"), result);
	
	}
}
