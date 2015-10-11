package com.six;

public class Sum implements Expression{
	Money addend,augend;

	public Sum(Money addend, Money augend) {
		super();
		this.addend = addend;
		this.augend = augend;
	}

	public Money reduce(String currency) {
		int amount=addend.amount+augend.amount;
		
		// TODO Auto-generated method stub
		return new RMB(amount,currency);
	}
	
}
