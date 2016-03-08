package com.sushil.myapp;

public class Rectangle implements Shape {

	float length;
	float width;
	String data;
	String message;
	
	public Rectangle() {
		super();System.out.println(toString());
	}

	public Rectangle(float length, float width) {
		super();
		this.length = length;
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String getShape() {
		// TODO Auto-generated method stub
		return "Rectangle";
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*width;
	}

	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getData() {
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", data=" + data + ", message=" + message
				+ ", getLength()=" + getLength() + ", getWidth()=" + getWidth() + ", getShape()=" + getShape()
				+ ", getArea()=" + getArea() + ", getId()=" + getId() + ", getData()=" + getData() + ", getMessage()="
				+ getMessage() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
