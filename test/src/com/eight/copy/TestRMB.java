package com.eight.copy;

/***
 * @author woody
 * @function 
 *   1��
 *   2��
 * @times 2014-12-06
 * **/
import org.junit.Assert;
import org.junit.Test;

public class TestRMB {
	// @Test
	// public void test1() {
	// RMB erYuan = new RMB(2);//�½���һ������Ҷ���
	// //RMB siyuanRmb = erYuan.times(2);//��������ҷ����ķ���
	// //System.out.print("eryuan="+erYuan.amount +"siyuan= "+siyuanRmb.amount);
	// //Assert.assertEquals(4, erYuan.amount);//2Ԫ������ֵ��4����4�Ƚ��Ƿ����
	// Assert.assertEquals(new RMB(2), erYuan);//��new2Ԫ�������ǰnew��2Ԫ����Ƚ�
	// //Assert.assertEquals(new RMB(2), new RMB(2));//��new2Ԫ�������ǰnew��2Ԫ����Ƚ�
	// //Assert.assertEquals(erYuan, erYuan);
	// //Assert.assertEquals(erYuan.times(2).times(10), new RMB(40));
	// //erYuan.amount = 12;
	// Dollar erDollar = new Dollar(2);
	// // Money erMoney = new Money(2);
	// // Assert.assertEquals(new Money(2), erMoney);
	// Assert.assertEquals(new RMB(4), erYuan.times(2));
	// //Assert.assertEquals(new RMB(2), new Dollar(2));//����
	// Assert.assertEquals(Money.rmb(2),new RMB(2));
	//
	// Assert.assertEquals(Money.rmb(2).currency(),"CNY");
	// Assert.assertEquals(Money.dollar(2).currency(),"USD");
	// //Assert.assertEquals(Money.rmb(2),Money.dollar(2));
	// }

	/***
	 * @times 2014-12-06 1.����Ӻͱ�������˭��˭�� 2.����һ��Sum��Ȼ����Money���ʽ����ʵ��plus,return new
	 *        Sum(this, addend); 3.��sum ����addend�ͱ�����augend��ʼ��
	 * 
	 */
	@Test
	public void testPlus() {
		// ��ʼ��5Ԫ��10Ԫ�����
		// Money fiveRMB = Money.rmb(5);
		// Money tenRMB = Money.rmb(10);
		// �ڷ��ص�һ��Money�ӿڶ����������ӷ�����
		// Expression sum = fiveRMB.plus(fiveRMB);
		// //�½�������
		// Bank bank = new Bank();
		// //�������
		// Money reduced =bank.reduce(sum,"CNY");
		// //����
		// Assert.assertEquals(tenRMB,reduced);
		Money fiveRMB = Money.rmb(5);
		Money tenRMB = Money.rmb(10);
		Expression result = fiveRMB.plus(fiveRMB);
		Sum sum = (Sum) result;
		Assert.assertEquals(fiveRMB, sum.addend);
		Assert.assertEquals(fiveRMB, sum.augend);
		//
	}

	/***
	 * 1.Bank�����reduce��ʼʵ�� 2.��reduce����д��Money���� 3.���Լ�����sum����reduce�������ᱨ��
	 * 4.����reduceд�뵽���ʽ�ӿ�
	 */
	@Test
	public void testReduceSum() {
		// �½�2������Ҷ���
		Money fiveRMB = Money.rmb(5);
		Bank bank = new Bank();
		bank.addRate("CNY", "USD", 2);
		// Money result = bank.reduce(new Dollar(1), "USD");
		// Assert.assertEquals(new Dollar(1), result);
		Assert.assertEquals(2, new Bank().rate("CNY", "USD"));
	}

	@Test
	public void testMixedAdd() {
//		1������Money����getCurrency��������д����
//		2��pair �������� return from.equals(pair.from) &&to.equals(pair.to); д��
		Money fiveBucks = Money.dollar(5);
		System.out.println(fiveBucks);
		Money tenRMB = Money.rmb(10);
		System.out.println(tenRMB);
		Bank bank = new Bank();
		bank.addRate("CNY", "USD", 2);
		Money result = bank.reduce(fiveBucks.plus(tenRMB), "USD");
		
		System.out.print("result= "+result.amount+"curr ="+result.currency() +"obj="+result);
		Assert.assertEquals(1, new Bank().rate("USD", "USD"));
		Assert.assertEquals(new Money(10,"USD"), result);
		//Assert.assertEquals(new Dollar(10,"USD"), result);
	}
	
	@Test
	public void testMixedAdd2() {
//		1��expression
//		
		Expression fiveBucks = Money.dollar(5);
		Expression tenRMB = Money.rmb(10);
		Bank bank = new Bank();
		bank.addRate("CNY", "USD", 2);
		Expression result = bank.reduce(fiveBucks.plus(tenRMB), "USD");
		
		System.out.print("result= "+result.reduce("USD").amount+"curr ="+result.reduce("USD").currency() +"obj="+result);
		
		Assert.assertEquals(new Money(10,"USD"), result);
	
	}
}
