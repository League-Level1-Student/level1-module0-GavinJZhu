package _01_methods._1_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	static Robot rob = new Robot();
	public static void main(String[] args) {
		rob.setSpeed(25);
		rob.penDown();
		rob.setPenWidth(5);
		run();
		for(int i = 0; i<7; i++) {
			Random ran = new Random();
			hou(ran.nextInt(101)+100);
		}
		hou("small",255,0,0);
		hou("medium",0,255,0);
		hou("large",0,0,255);
	}

		public static void run () {
			// Check the recipe to find out what code to put here
			rob.setX(25);
			rob.setY(450);
		}
		public static void hou(int height) {
			rob.setPenColor(0,0,0);
			rob.move(height);
			rob.turn(90);
			rob.move(50);
			rob.turn(90);
			rob.move(height);
			rob.turn(-90);
			rob.setPenColor(0,255,0);
			rob.move(40);
			rob.turn(-90);
		}
		public static void hou(String height, int r, int g, int b) {
			int size = 60;
			if (height.equalsIgnoreCase("medium")) {
				size = 120;
			}
			else if (height.equalsIgnoreCase("large")) {
				size = 250;
			}
			rob.setPenColor(r,g,b);
			
			
			
			
			rob.move(size);
			rob.turn(90);
			rob.move(50);
			rob.turn(90);
			rob.move(size);
			rob.turn(-90);
			rob.setPenColor(0,255,0);
			rob.move(40);
			rob.turn(-90);
		}
}

