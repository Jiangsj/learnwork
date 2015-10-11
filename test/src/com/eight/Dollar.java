package com.eight;

public class Dollar extends Money {
	public String currency;
	public Dollar(int amount){
	
			super(amount);
			this.currency="USD";
			
		}
	public Dollar(int amount,String currency)
	{
		this.amount=amount;
		this.currency=currency;
	}
	@Override
	public Money times(int multi) {
		// TODO Auto-generated method stub
		return new Dollar(amount * multi);
	}
	@Override
	public boolean equals(Object o){
		Dollar Dollar=(Dollar)o;
		return Dollar.amount==this.amount;
	}

	}

