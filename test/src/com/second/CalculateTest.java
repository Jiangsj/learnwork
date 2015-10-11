package com.second;
import org.junit.*;
public class CalculateTest {
	Calculate calculation = new Calculate();
	
	    int sum = calculation.sum(2, 5);
	
	    int testSum = 7;
	
	 
	
	    @Test
	
	    public void testSum() {
	
	        System.out.println("@Test sum(): " + sum + " = " + testSum);
	
	        Assert.assertEquals(sum, testSum);
	
	    }

}
