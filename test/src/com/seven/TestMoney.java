package com.seven;



/***
 * @author Ranger
 * @function 
 * 1����Ǯ������������������α�����
 * 2�����˵���times����һ������Ҷ����������ǰ�Ķ���ֵ�����仯
 * @times 2014-10-18
 * **/
import org.junit.*;
public class TestMoney {

    /***
     * 1�������ࣺbank.addRate("CNY","USD"2)
     * 2��Money��Ľ�reduce����
     * 3��Bank��Ľ�reduce����
     * 4��Expression�ӿڼ���reduce����
     * 5��Sum��Ľ�reduce����
     * 6��Money����reduce����
     * 7��Bank�����rate����
     * 8��Money������bank����ȥ����
     * 1��Pair�����װ����2��Pair��Ա�����ͼ��빹�췽��3��Pair��дequals����
     * 4��Bank�����addRate����5��Bank������ȡrate���ʷ���6�����Ի���
     */
	 @Test
	 public void testRduceMoney(){
		 Bank bank=new Bank();
		 bank.addRate("CNY", "USD", 2);
		 Money result=bank.reduce(new Money(2, "CNY"), "USD");
		 Assert.assertEquals(new Money(1,"USD"), result);
	 }
     
}