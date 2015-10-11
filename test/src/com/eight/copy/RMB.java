package com.eight.copy;

/***
 * @author woody
 * @function 1、统一RMB里面times方法，初始化Money
 * @times 2014-11
 * **/
public class RMB extends Money {

	private String currency;

	public RMB(int amount) {
		super(amount);
		this.currency = currency;
	}

	public RMB(int amount, String currency) {
		this.amount = amount;
		this.currency = "CNY";
	}

	@Override
	public Money times(int multi) {
		// TODO Auto-generated method stub
		return Money.rmb(amount * multi);
	}

	@Override
	public boolean equals(Object o) {
		RMB rmb = (RMB) o;
		return rmb.amount == this.amount;
	}

	@Override
	String currency() {
		// TODO Auto-generated method stub
		return currency;
	}
}
