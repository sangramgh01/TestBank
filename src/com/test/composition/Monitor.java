package com.test.composition;

public class Monitor {

	private String model;
	private String manufacture;
	private int size;
	private Resolution resolution;
	
	public Monitor(String model, String manufacture, int size, Resolution resolution) {
		super();
		this.model = model;
		this.manufacture = manufacture;
		this.size = size;
		this.resolution = resolution;
	}
	
	private void drawPixelAt(int x,int y,String color) {
		System.out.println("Drawing pixel at: "+ x +" ,"+ y + " is color " + color);
	}

	
}
