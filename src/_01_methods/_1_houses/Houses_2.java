package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;

import java.awt.*;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses_2 {
    private Robot rob = new Robot();

    public static void main(String[] args) {
        Houses_2 houses = new Houses_2();
        houses.run();
    }

    // Constructor.  Initialization Method
    public Houses_2() {
        // initialization
        rob.setSpeed(25);
        rob.penDown();

        // Check the recipe to find out what code to put here
        setStartingCoordinates();

		/*
		for(int i = 0; i<7; i++) {
			Random ran = new Random();
			hou(ran.nextInt(101)+100);
		}
		hou("small",255,0,0);
		hou("medium",0,255,0);
		hou("large",0,0,255);
		*/
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
			drawFlatTop(getRandomHeight(i));
        }
		drawFlatTop("small");
		drawFlatTop(Color.MAGENTA, "medium");
    }

    // Step 1
    public void setStartingCoordinates() {
        rob.setX(25);
        rob.setY(450);
    }

    public void drawFlatTop(int height) {
        //rob.setPenColor(0, 0, 0);
        rob.move(height);
        rob.turn(90);
        rob.move(25);
        rob.turn(90);
        rob.move(height);
        rob.turn(-90);
        rob.setPenColor(0, 255, 0);
        rob.move(25);
        rob.turn(-90);
		rob.setPenColor(0,0,0);
    }
	//step 5
	public void drawFlatTop(String heightS){
		int heightValue = 0;
		if (heightS.equalsIgnoreCase("small")){
			heightValue =60;
		}
		else if (heightS.equalsIgnoreCase("medium")){
			heightValue =120;
		}
		else if (heightS.equalsIgnoreCase("large")){
			heightValue =250;
		}
		drawFlatTop(heightValue);
	}
	//step 6
	public void drawFlatTop(Color color, String height){
		rob.setPenColor(color);
		drawFlatTop(height);
	}
	//part of step 4
	public int getRandomHeight(int forLoopIndex){
		int height = 0;
		height = forLoopIndex*30;
		return height;
	}
    public void hou(String height, int r, int g, int b) {
        int size = 60;
        if (height.equalsIgnoreCase("medium")) {
            size = 120;
        } else if (height.equalsIgnoreCase("large")) {
            size = 250;
        }
        rob.setPenColor(r, g, b);


        rob.move(size);
        rob.turn(90);
        rob.move(50);
        rob.turn(90);
        rob.move(size);
        rob.turn(-90);
        rob.setPenColor(0, 255, 0);
        rob.move(40);
        rob.turn(-90);
    }
}
