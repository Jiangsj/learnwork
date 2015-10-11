package com.second;

public class RMB {
	int amount;
	public RMB(int amount){
		this.amount=amount;
		
	}
	public  RMB times(int multipay){
		//amount=amount*multipay;
		return new RMB(amount*multipay);
	}
	@Override
	public boolean equals(Object o){
		RMB rmb=(RMB)o;
		return this.amount==rmb.amount;
	}
	public int add(int a){
		return this.amount=a;
	}
}
