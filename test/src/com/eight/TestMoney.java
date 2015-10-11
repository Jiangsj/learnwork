package com.eight;



/***
 * @author Ranger
 * @function 
 * 1、用钱的数量相等来解决对象伪相等性
 * 2、用了调用times返回一个人民币对象来解决以前的对象值发生变化
 * @times 2014-10-18
 * **/
import org.junit.*;
public class TestMoney {
/**
 * 一、美元+人民币
 * 1、测试类：fiveBucks.plus(tenRMB)
 * 2、返回Money类
 * 3、修正Sum类里面reduce
 * 二、case返回为Expression
 * 1、Sum类augend和addend返回的Expression
 * 2、Sum类构造方法返回Expression
 * 3、Money里面Plus方法里面返回Expressoin
 * 4、Money里面time方法返回Expression
 * 5、修改测试case的monkey的返回Expression
 * 6、最后在Expression接口里面加入plus
 * */
   	 @Test
	 public void testPlusMoney(){
		 Money fivebucks=Money.dollar(5);
		 Money tenRMB=Money.rmb(10);
		 Bank bank=new Bank();
		 bank.addRate("CNY", "USD", 2);
		 Money result=bank.reduce(fivebucks.plus(tenRMB),"USD");
		 System.out.println(fivebucks);
		 System.out.println(tenRMB);
		 System.out.println("result="+result.amount+
				 "curr="+result.currency()+"obj="+result);
		 Assert.assertEquals("10rmb+5 dollar=10 dollar",new Money(10,"USD"), result);
		 
	 }
     
}