package com.six;



//
public class Bank {
	//sum�ͻ���
	public Money reduce(Expression source,String currency){
		if(source instanceof Money){
			return (Money)source;
		}
		Sum sum=(Sum)source;
		//������͵Ĵ���ŵ�sum�����������޸���չ
		return sum.reduce(currency);
	}
}
