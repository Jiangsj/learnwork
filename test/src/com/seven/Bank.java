package com.seven;

import java.util.Hashtable;

//
public class Bank {
	//sum和汇率
	private Hashtable rates=new Hashtable();
	
	public Money reduce(Expression source,String currency){
		if(source instanceof Money){
			return (Money)source.reduce(this, currency);
		}
		Sum sum=(Sum)source;
		//具体求和的代码放到sum更容易理解和修改扩展
		return sum.reduce(this,currency);
	}
	int rate (String currency1,String currency2){
		Integer rate=(Integer)rates.get(new Pair(currency1, currency2));
		return rate.intValue();
		
	}
	public void addRate(String currency1, String currency2, int rate) {
		// TODO Auto-generated method stub
		rates.put(new Pair(currency1, currency2), new Integer(rate));
	}
}
