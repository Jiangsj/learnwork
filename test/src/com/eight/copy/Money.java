package com.eight.copy;

/***
 * @author woody
 * @function 
 * 1��equals���������ж�class��Ϊcurrency 
 * 2����money����getClass�жϽ�Ǯ���ͱ�Ϊcurrency 
 * 3����Money���󷽷�ȥ��
 * 4������һ���ӷ����ԣ��û���Ǯ��
 * 5�����ӽӿڱ��ʽ������Bank������
 * @times 2014-11-16
 * **/
//3 ��Money����abstract����ȥ��,����ȥ��ʼ����
public  class Money implements Expression{
	 int amount;
	private String currency;

	public Money(int amount) {
		this.amount = amount;
	}
	public Money(int amount,String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public Money() {
	}

	Expression times(int multi){
		 return new Money(amount*multi,currency);
	 }

	@Override
	public boolean equals(Object o) {
		Money money = (Money) o;
		//1 2equals���������ж�class��Ϊcurrency
		return (this.amount == money.amount)
				&& (this.currency() == money.currency);

	}

	String currency(){
		return currency;
	};

	static Money rmb(int amount) {
		return new RMB(amount, "CNY");
	}

	static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}
	//4����һ���ӷ����ԣ��û���Ǯ��
	public Expression plus(Expression addMoney){
		return new Sum(this,addMoney);
	}
	@Override
	public Money reduce(String currency) {
		int rate = (currency().equals("CNY")) &&( currency.equals("USD"))
				? 7:1;
		return new Money(amount/rate, currency);
	}
	@Override
	public Money reduce(Bank bank, String currency2) {
		int rate = bank.rate(currency(), currency2);
		return new Money(amount/rate, currency2);
	}
}
