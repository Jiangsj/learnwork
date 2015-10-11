package com.eight;

import java.util.Hashtable;

//
public class Bank {
	//sum和汇率
	private Hashtable rates=new Hashtable();
	
	public Money reduce(Expression source,String currency){
		//如果source只有一个对象（不想换算），直接返回自己的对象
		if(source instanceof Money){
			return (Money) source.reduce(this, currency);
		}
		Sum sum=(Sum) source;
		//具体求和的代码放到sum更容易理解和修改扩展
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
