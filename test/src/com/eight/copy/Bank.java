package com.eight.copy;

import java.util.Hashtable;

//
public class Bank {
	private static Hashtable rates = new Hashtable();

	// sum �ͻ���
	public Money reduce(Expression source, String currency) {
		// ���sourceֻ��һ�����󣨲��뻻�㣩��ֱ�ӷ����Լ�����
		if (source instanceof Money) {
			return (Money) source.reduce(this, currency);
		}
		Sum sum = (Sum) source;
		// ������͵Ĵ���ŵ�Sum���������ͽ����޸���չ
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
