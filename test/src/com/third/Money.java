package com.third;
/***
 * 
 * @
 * **/
public class Money {
	private int amount;
	public Money(int amount){
		this.amount=amount;
		
	}
	public  Money times(int multipay){
		//amount=amount*multipay;
		return new Money(amount*multipay);
	}
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
}
