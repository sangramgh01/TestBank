package com.test.inheritance;

public class Maruti extends Car{

		private int roadService;
		
		public Maruti(int roadService) {
			super("Maruti","400",5, 4, 6, false);
			this.roadService = roadService;
		}
		
		public void accelerate(int rate) {
			int newVelocity = getCurrentVelocity()+rate;
			if(newVelocity == 0) {
				stop();
			    changeCurrentGear(1);
			}else if(newVelocity > 0 && newVelocity <=10){
				changeCurrentGear(1);
			}else if(newVelocity > 10 && newVelocity <=20){
				changeCurrentGear(2);
			}else if(newVelocity > 20 && newVelocity <=30){
				changeCurrentGear(3);
			}else {
				changeCurrentGear(4);
			}
			if(newVelocity > 0) {
				changeVelocity(newVelocity, getCurrentDirection());
			}
		}
		
		
		
}
