package com.test;

public class AngleCalculation {

public void calculateAngle(double h, double m) {
		
		
	    // validate the input
	        if (h <0 || m < 0 || h >12 || m > 60)
	            System.out.println("Wrong input");
	 
	        if (h == 12)
	            h = 0;
	             if (m == 60)
	       {
	        m = 0;
	        h += 1;
	        if(h>12)
	          h = h-12;
	        } 
	 
	 
	        // Calculate the angles moved by hour and minute hands
	        // with reference to 12:00
	        int hour_angle = (int)(0.5 * (h*60 + m));
	        int minute_angle = (int)(6*m);
	 
	        // Find the difference between two angles
	        int angle = Math.abs(hour_angle - minute_angle);
	 
	        // smaller angle of two possible angles
	        angle = Math.min(360-angle, angle);
	 
	        //return angle;
	        System.out.println("angle between min and hour:"+Integer.toString(angle));
	    }
	     
}
