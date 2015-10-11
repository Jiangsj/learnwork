package com.seven;



/***
 * @author Ranger
 * @function 
 * 1、用钱的数量相等来解决对象伪相等性
 * 2、用了调用times返回一个人民币对象来解决以前的对象值发生变化
 * @times 2014-10-18
 * **/
import org.junit.*;
public class TestMoney {

    /***
     * 1、测试类：bank.addRate("CNY","USD"2)
     * 2、Money类改进reduce方法
     * 3、Bank类改进reduce方法
     * 4、Expression接口加入reduce方法
     * 5、Sum类改进reduce方法
     * 6、Money重载reduce方法
     * 7、Bank类加入rate方法
     * 8、Money里面让bank里面去换算
     * 1、Pair类出现装汇率2、Pair成员变量和加入构造方法3、Pair复写equals方法
     * 4、Bank类加入addRate方法5、Bank类加入获取rate汇率方法6、测试汇率
     */
	 @Test
	 public void testRduceMoney(){
		 Bank bank=new Bank();
		 bank.addRate("CNY", "USD", 2);
		 Money result=bank.reduce(new Money(2, "CNY"), "USD");
		 Assert.assertEquals(new Money(1,"USD"), result);
	 }
     
}