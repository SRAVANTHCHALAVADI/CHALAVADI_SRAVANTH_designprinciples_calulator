package com.epam;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {

	@Test
	public void test() {
		Calculate c=new Calculate();
		assertEquals(2,c.add(1, 1));
	}
	@Test
	public void test1() {
		Calculate c=new Calculate();
		assertEquals(0,c.sub(1, 1));
	}
	@Test
	public void test2() {
		Calculate c=new Calculate();
		assertEquals(5,c.mul(5, 1));
	}
	@Test
	public void test3() {
		Calculate c=new Calculate();
		assertEquals(5,c.div(15, 3));
	}

}
