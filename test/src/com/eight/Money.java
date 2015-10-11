package com.eight;
/***
 * @author Ranger
 * @function
 * 1、equals方法里面判断class变为currency
 * 2、把Money里面getClass判断金钱类型变为currency
 * 3、把Money抽象方法去掉
 * 4、增加一个加法测试（用户存钱）
 * 5、增加接口表达式，增加Bank银行类
 * @times
 * **/
//把Money抽象方法去掉，可以去初始化它
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
		//equals方法里面判断class变为curren
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
	//增加一个加法测试用户存钱
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
	//增加一个测试方法，用户存钱
	public Expression plus(Expression addMoney) {
		// TODO Auto-generated method stub
		return new Sum(this,addMoney);
	}
}
