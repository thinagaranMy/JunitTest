package com.sicpa.objects;

/**
 * dummy class Square
 * @author tkharidass
 *
 */
public class Square {

	private int width;
	private int length;
	
	public Square(int width, int length) {
		super();
		this.width = width;
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public int area(){
		return width * length;
	}
	
	public int circumference(){
		return (width + length) * 2;
	}
	
}
