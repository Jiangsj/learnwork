package com.eight;



/***
 * @author Ranger
 * @function 
 * 1����Ǯ������������������α�����
 * 2�����˵���times����һ������Ҷ����������ǰ�Ķ���ֵ�����仯
 * @times 2014-10-18
 * **/
import org.junit.*;
public class TestMoney {
/**
 * һ����Ԫ+�����
 * 1�������ࣺfiveBucks.plus(tenRMB)
 * 2������Money��
 * 3������Sum������reduce
 * ����case����ΪExpression
 * 1��Sum��augend��addend���ص�Expression
 * 2��Sum�๹�췽������Expression
 * 3��Money����Plus�������淵��Expressoin
 * 4��Money����time��������Expression
 * 5���޸Ĳ���case��monkey�ķ���Expression
 * 6�������Expression�ӿ��������plus
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