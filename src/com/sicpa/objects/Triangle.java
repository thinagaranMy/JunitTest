package com.sicpa.objects;

/**
 * Dummy test for triangle
 * @author tkharidass
 *
 */
public class Triangle {
	
	private int a;
	private int b;
	private int c;
	private int base;
	private int height;
	
	

	public Triangle(int a, int b, int c, int base, int height) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.base = base;
		this.height = height;
	}



	public int getA() {
		return a;
	}



	public void setA(int a) {
		this.a = a;
	}



	public int getB() {
		return b;
	}



	public void setB(int b) {
		this.b = b;
	}



	public int getC() {
		return c;
	}



	public void setC(int c) {
		this.c = c;
	}



	public int getBase() {
		return base;
	}



	public void setBase(int base) {
		this.base = base;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	public int area(){
		return (base * height)/2;
	}
	
	public int circumference(){
		return a + b + c;
	}
}
