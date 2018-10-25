package com.test.inheritance;

public class Car extends Vechicle {
	
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	
	private int currentGear;

	public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}
	public void changeCurrentGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("Car setter current gear : " + this.currentGear + " gear:");
	}
	public void changeVelocity(int speed,int direction) {
		System.out.println("Car changeVelocity() : velocity: " + speed + " direction : " + direction);
		move(speed, direction);
	}
	
	
	
}