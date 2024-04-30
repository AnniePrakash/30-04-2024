package org.sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MavenSample {
	
	@BeforeClass
	public static void tc3() {
		System.out.println("Before Class");

	}
	
	@Before
	public void tc1() {
		System.out.println("Before");

	}
	
	@Test
	public void tc2() {
		System.out.println("Test1");

	}
	
	@Test
	public void tc6() {
		System.out.println("Test2");

	}
	
	
	@After
	public  void tc4() {
		System.out.println("After");
		
	}
	
	@AfterClass
	public static void tc5() {
		
	System.out.println("After class");

	}

}
