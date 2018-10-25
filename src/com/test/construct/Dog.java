package com.test.construct;

public class Dog extends Animal {

	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	public Dog(String name, int size, int weight,int eyes,int legs,int tails,int teeth, int tail,String coat) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	private void chew() {
		System.out.println("Dog chew() called..");
	}
	
	@Override
	public void eat() {
	System.out.println("Dog.eat() called");
		chew();
		super.eat();
	}
	
	public void walk() {
		System.out.println("Dog.walk() called");
		move(5);
	}
	
	
/*	@Override
	public void move(int speed) {
		System.out.println("Dog move() called");
		moveLegs(speed);
		super.move(speed);
	}*/
	private void moveLegs(int i) {
		System.out.println("Dog movelegs() called");
		
	}
	public void run() {
		System.out.println("Dog.run() called");
		move(12);
	}
	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getTail() {
		return tail;
	}

	public void setTail(int tail) {
		this.tail = tail;
	}

	public int getTeeth() {
		return teeth;
	}

	public void setTeeth(int teeth) {
		this.teeth = teeth;
	}

	public String getCoat() {
		return coat;
	}

	public void setCoat(String coat) {
		this.coat = coat;
	}
	
	

}
