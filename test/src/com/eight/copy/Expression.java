package com.eight.copy;
//����ӿ��Ƿ�������ʽ==�Ժ��Ǯ��ȡǮ�����ڡ������Ҷ�������
public interface Expression {
  Money reduce(String currency);
  Money reduce(Bank bank, String currency);
Expression plus(Expression addend);
}
