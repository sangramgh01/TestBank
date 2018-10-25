package com.test.inheritance;

public class Vechicle {

	private String name;
	private String size;	
	private int currentVelocity;
	private int currentDirection;
	
	public Vechicle(String name, String size) {
		super();
		this.name = name;
		this.size = size;
		this.currentDirection = 0;
		this.currentVelocity = 0;
	}

	public void steer(int direction) {
		this.currentDirection = direction;
		System.out.println("Vechicle steer() :steering at" +currentDirection);
	}
	
	public void move(int velocity,int direction) {
		currentDirection = direction;
		currentVelocity = velocity;
		System.out.println("Vechicle move : moving at : " + currentVelocity + " in direction : "+ currentDirection);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getCurrentVelocity() {
		return currentVelocity;
	}

	public void setCurrentVelocity(int currentVelocity) {
		this.currentVelocity = currentVelocity;
	}

	public int getCurrentDirection() {
		return currentDirection;
	}

	public void setCurrentDirection(int currentDirection) {
		this.currentDirection = currentDirection;
	}
	
	public void stop() {
		this.currentVelocity = 0;
	}
	
}
