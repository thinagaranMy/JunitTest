package com.sicpa.objecttest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sicpa.objects.Square;

public class SquareTest {

	@Test
	public void areaTest() {
		Square test = new Square(10, 10);
		System.out.println("[Square] Calculating the area of 10 x 10");
		assertEquals("Calculation of 10 x 10 square", 100, test.area());
	}
	
	@Test 
	public void circumferenceTest(){
		Square test = new Square(10 , 4);
		System.out.println("[Square] Calculating the circumference of 10 x 4");
		assertEquals("[Square] Calculating the circumference of 10 x 4", 28, test.circumference());
	}

}
