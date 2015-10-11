package com.five;
/***
 * 
 * @
 * **/
public  class Money implements Expression{
	protected String currencyString;
	protected int amount;
	protected String currency;
	public Money(int amount){
		this.amount=amount;
		
	}
	public Money(int amount,String currecy){
		this.amount=amount;
		this.currency=currecy;
	}
	public   Money times(int multipay){
		return new Money(amount*multipay);
	};
	@Override
	public boolean equals(Object o){
		Money Money=(Money)o;
		return (this.amount==Money.amount)&&(this.currency()==Money.currency());
	}
	public int add(int a){
		return this.amount=a;
	}
	public void curr(){
		
	}
	public static RMB rmb(int amount){
		return new RMB(amount);
	}
	public static Dollar dollar(int amount){
		return new Dollar(amount);
	}
	public  String currency(){
		return currency();
	};
	Money plus(Money addMoney){
		return new Money(this.amount+addMoney.amount,currency);
	}
}
