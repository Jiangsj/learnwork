package com.eight;
//这个接口是放运算表达式==以后存钱、取钱、定期、换货币都在里面
public interface Expression {

	Money reduce(Bank ban,String currency);

	Money reduce(String currency);
	Expression plus(Expression addend);
}
