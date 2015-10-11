package com.forth;
/***
 * 
 * @
 * **/
public abstract class Money {
	protected String currencyString;
	protected int amount;
	public Money(int amount){
		this.amount=amount;
		
	}
	public abstract  Money times(int multipay);
	@Override
	public boolean equals(Object o){
		Money Money=(Money)o;
		return (this.amount==Money.amount)&&(this.getClass()==o.getClass());
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
	abstract String currency();
}
