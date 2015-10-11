package com.eight;

import java.util.Hashtable;

//
public class Bank {
	//sum�ͻ���
	private Hashtable rates=new Hashtable();
	
	public Money reduce(Expression source,String currency){
		//���sourceֻ��һ�����󣨲��뻻�㣩��ֱ�ӷ����Լ��Ķ���
		if(source instanceof Money){
			return (Money) source.reduce(this, currency);
		}
		Sum sum=(Sum) source;
		//������͵Ĵ���ŵ�sum�����������޸���չ
		return sum.reduce(this,currency);
	}
	int rate (String from,String to){
		if (from.equals(to)){
			return 1;
		}
		Integer rateInteger=(Integer) rates.get(new Pair(from, to));
		return rateInteger.intValue();
		
	}
	
	public void addRate(String from, String to, int rate) {
		// TODO Auto-generated method stub
		rates.put(new Pair(from, to), new Integer(rate));
	}

}
