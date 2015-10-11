package com.eight.copy;

public class Sum implements Expression{
	Expression addend,augend;

	public Sum(Expression addend, Expression augend) {
		super();
		this.addend = addend;
		this.augend = augend;
	}

	public Money reduce(String currency) {
		int amount  = addend.reduce(currency).amount + augend.reduce(currency).amount;
		return new RMB(amount, currency);
	}

	@Override
	public Money reduce(Bank bank, String currency) {
		int amout  = augend.reduce(bank, currency).amount+addend.reduce(bank, currency).amount;
		return new Money(amout, currency);
	}

	@Override
	public Expression plus(Expression addend) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
