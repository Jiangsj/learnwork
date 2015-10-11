package com.eight;

public class Sum implements Expression{
	Expression addend,augend;

	public Sum(Expression addend, Expression augend) {
		super();
		this.addend = addend;
		this.augend = augend;
	}
	@Override
	public Money reduce(Bank bank,String currency) {
//		int amount=addend.amount+augend.amount;
		int amount=augend.reduce(bank, currency).amount+addend.reduce(bank, currency).amount;
		// TODO Auto-generated method stub
		return new Money(amount,currency);
	}

	
	public Money reduce(String currency) {
		// TODO Auto-generated method stub
		int amount=augend.reduce(currency).amount+addend.reduce(currency).amount;
		return new RMB(amount,currency);
	}
	@Override
	public Expression plus(Expression addend) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
