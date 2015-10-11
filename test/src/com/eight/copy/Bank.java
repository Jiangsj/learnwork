package com.eight.copy;

import java.util.Hashtable;

//
public class Bank {
	private static Hashtable rates = new Hashtable();

	// sum 和汇率
	public Money reduce(Expression source, String currency) {
		// 如果source只有一个对象（不想换算），直接返回自己对象
		if (source instanceof Money) {
			return (Money) source.reduce(this, currency);
		}
		Sum sum = (Sum) source;
		// 具体求和的代码放到Sum更容易理解和将来修改扩展
		return sum.reduce(this, currency);
	}



	void addRate(String from, String to, int rate) {
		rates.put(new Pair(from, to), new Integer(rate));
	}

	public int rate(String from, String to) {
		if (from.equals(to)) {
			return 1;
		}
		Integer rateInteger = (Integer) rates.get(new Pair(from, to));
		return rateInteger.intValue();
	}

}
