package com.eight;
//����ӿ��Ƿ�������ʽ==�Ժ��Ǯ��ȡǮ�����ڡ������Ҷ�������
public interface Expression {

	Money reduce(Bank ban,String currency);

	Money reduce(String currency);
	Expression plus(Expression addend);
}
