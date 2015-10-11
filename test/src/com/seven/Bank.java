package com.seven;

import java.util.Hashtable;

//
public class Bank {
	//sum�ͻ���
	private Hashtable rates=new Hashtable();
	
	public Money reduce(Expression source,String currency){
		if(source instanceof Money){
			return (Money)source.reduce(this, currency);
		}
		Sum sum=(Sum)source;
		//������͵Ĵ���ŵ�sum�����������޸���չ
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
