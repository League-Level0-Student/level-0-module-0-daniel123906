package _01_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
Robot Daniel = new Robot();

        // 3. Put the robot's pen down
Daniel.penDown();

        // 6. Make the robot move as fast as possible
Daniel.setSpeed(1);

        // 5. Do everything below here 4 times


        //         2. Move your robot 200 pixels
Daniel.microMove(200);

        //         4. Turn the robot 90 degrees to the right (90 degrees)
Daniel.turn(90);

Daniel.microMove(200);
Daniel.turn(90);
Daniel.microMove(200);
Daniel.turn(90);
Daniel.microMove(200);
Daniel.turn(90);
    }
}
