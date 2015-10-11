package com.eight;
/***
 * @author Ranger
 * @function
 * 1��equals���������ж�class��Ϊcurrency
 * 2����Money����getClass�жϽ�Ǯ���ͱ�Ϊcurrency
 * 3����Money���󷽷�ȥ��
 * 4������һ���ӷ����ԣ��û���Ǯ��
 * 5�����ӽӿڱ��ʽ������Bank������
 * @times
 * **/
//��Money���󷽷�ȥ��������ȥ��ʼ����
public  class Money implements Expression{
	//protected String currencyString;
	protected int amount;
	private String currency;
	public Money(int amount){
		this.amount=amount;
		
	}
	public Money(int amount,String currecy){
		this.amount=amount;
		this.currency=currecy;
	}
	public Money(){
		
	}
	public   Expression times(int multipay){
		return new Money(amount*multipay,currency);
	};
	@Override
	public boolean equals(Object o){
		Money Money=(Money)o;
		//equals���������ж�class��Ϊcurren
		return (this.amount==Money.amount)&&(this.currency()==Money.currency);
	}
	public int add(int a){
		return this.amount=a;
	}
	public void curr(){
		
	}
	public static Money rmb(int amount){
		return new RMB(amount,"CNY");
	}
	public static Money dollar(int amount){
		return new Dollar(amount,"USD");
	}
	public  String currency(){
		return currency;
	}
	//����һ���ӷ������û���Ǯ
	Expression plus(Money addMoney){
		return new Sum(this,addMoney);
	}
	@Override
	public  Money reduce(String currency) {
		int rate=(currency().equals("CNY"))&&(currency.equals("USD"))
				?7:1;
		return new Money(amount/rate,currency );
		// TODO Auto-generated constructor stub
	}
	@Override
	public Money reduce(Bank bank,String currency2){
		int rate=bank.rate(currency(),currency2);
		return new Money(amount/rate,currency2);
	}
	//����һ�����Է������û���Ǯ
	public Expression plus(Expression addMoney) {
		// TODO Auto-generated method stub
		return new Sum(this,addMoney);
	}
}
