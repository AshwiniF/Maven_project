package com.J_unit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCases {

	@BeforeClass
	public static void runbeforeclass() {
		System.out.println("before class");
	}

	@Before
	public void runBefore() {
		System.out.println("Before");
	}

	@AfterClass
	public static void runAfterClass() {
		System.out.println("After class");
	}

	@After
	public void runAfter() {
		System.out.println("After");
	}

	@Test
	public void test1() {
Calulator cc=new Calulator();
		
		assertEquals(5, cc.Addition(3, 2));
		System.out.println("test1");
	}

	@Test
	public void test2() {
		System.out.println("test 2");
	}
}
