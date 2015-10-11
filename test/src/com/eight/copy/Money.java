package com.eight.copy;

/***
 * @author woody
 * @function 
 * 1、equals方法里面判断class变为currency 
 * 2、把money里面getClass判断金钱类型变为currency 
 * 3、把Money抽象方法去掉
 * 4、增加一个加法测试（用户存钱）
 * 5、增加接口表达式、增加Bank银行类
 * @times 2014-11-16
 * **/
//3 把Money抽象abstract方法去掉,可以去初始化它
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
		//1 2equals方法里面判断class变为currency
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
	//4增加一个加法测试（用户存钱）
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
