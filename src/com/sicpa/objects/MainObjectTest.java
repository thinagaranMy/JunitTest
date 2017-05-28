package com.sicpa.objects;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import com.sicpa.objecttest.SquareTest;
import com.sicpa.objecttest.TriangleTest;

/**
 * Testing the cases 
 * @author tkharidass
 *
 */
public class MainObjectTest {

	public static void main(String[] args) {
		JUnitCore junitCore = new JUnitCore();
		Result result = junitCore.runClasses(SquareTest.class);
		if(result.wasSuccessful()){
			System.out.println("SquareTest was successful");
		}else{
			System.out.println("SquareTest was not successful");
		}
		
		 result = junitCore.runClasses(TriangleTest.class);
			if(result.wasSuccessful()){
				System.out.println("TriangleTest was successful");
			}else{
				System.out.println("TriangleTest was not successful");
			}

	}

}
