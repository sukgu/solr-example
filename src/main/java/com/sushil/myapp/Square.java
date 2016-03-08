package com.sushil.myapp;

public class Square implements Shape {

	float length;
	String data;
	String message;
	
	public Square() {
		super();System.out.println(toString());
	}

	public Square(float length) {
		super();
		this.length = length;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
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
		return "Square";
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*length;
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
		return "Square [length=" + length + ", data=" + data + ", message=" + message + ", getLength()=" + getLength()
				+ ", getShape()=" + getShape() + ", getArea()=" + getArea() + ", getId()=" + getId() + ", getData()="
				+ getData() + ", getMessage()=" + getMessage() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
