package com.six;



//
public class Bank {
	//sum和汇率
	public Money reduce(Expression source,String currency){
		if(source instanceof Money){
			return (Money)source;
		}
		Sum sum=(Sum)source;
		//具体求和的代码放到sum更容易理解和修改扩展
		return sum.reduce(currency);
	}
}
