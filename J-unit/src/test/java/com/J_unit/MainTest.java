package com.J_unit;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {

	
		// TODO Auto-generated method stub
	@Test
	public	void m1(){   
		Calulator cc=new Calulator();
		
		assertEquals(5, cc.Addition(3, 2));
		assertEquals(2,cc.Substraction(3, 1));
		assertEquals(3,cc.Multiplication(3, 1));
		assertEquals(2,cc.Divison(4, 2));
		
		
	}
	
		
	

}
