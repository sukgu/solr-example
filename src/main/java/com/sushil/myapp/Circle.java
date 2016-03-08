package com.sushil.myapp;

public class Circle implements Shape {

	float radius;
	String message;
	String data;
	
	public Circle() {
		super();
		System.out.println(toString());
	}

	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String getShape() {
		// TODO Auto-generated method stub
		return "Circle";
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (22/7)*Math.pow(2, radius);
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
		return "Circle [radius=" + radius + ", message=" + message + ", data=" + data + ", getRadius()=" + getRadius()
				+ ", getShape()=" + getShape() + ", getArea()=" + getArea() + ", getId()=" + getId() + ", getData()="
				+ getData() + ", getMessage()=" + getMessage() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	

}
