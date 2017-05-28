package com.sicpa.objecttest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.sicpa.objects.Triangle;

public class TriangleTest {

	

	@Test
	public void areaTest() {
		Triangle testTriangle = new Triangle(4,5,6,4,5);
		System.out.println("[Triangle] Testing triangle area");
		assertEquals("[Triangle] Area test ", 10, testTriangle.area());
	}
	
	@Test
	public void circumferenceTriangle(){
		Triangle testTriangle = new Triangle(4,5,6,4,6);
		System.out.println("[Triangle] Testing triangle circumference");
		assertEquals("[Triangle] circumference test", 15, testTriangle.circumference());
		
	}
	
}
