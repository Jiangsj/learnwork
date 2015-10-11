package com.eight.copy;

/***
 * @author woody
 * @function 
 * @times 2014-11
 * **/
public class Dollar extends Money {

	private String currency;

	public Dollar(int amount) {
		super(amount);
		this.currency = "USD";
	}

	public Dollar(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	@Override
	public Money times(int multi) {
		// TODO Auto-generated method stub
		return new Dollar(amount * multi);
	}

	@Override
	public boolean equals(Object o) {
		Dollar Dollar = (Dollar) o;
		return Dollar.amount == this.amount;
	}

	@Override
	String currency() {
		// TODO Auto-generated method stub
		return currency;
	}
}
