package com.forth;

import java.util.function.Supplier;

/***
 * 1����дRMB��ͼ���time����������RMB�Ķ�����testCaseͨ��
 * 2����дRMB���equal����
***/
public class RMB extends Money {
	//private int amount;
	public RMB(int amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void curr(){
		super.curr();
	}
	@Override
	public Money times(int muti){
		return new RMB(amount*muti);
		
	}
	@Override
	public boolean equals(Object o){
		RMB rmb=(RMB)o;
		return rmb.amount==this.amount;
	}
	@Override
	String currency() {
		// TODO Auto-generated method stub
		return "CNY";
	}
}
