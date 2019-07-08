package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot daniel = new Robot();
	daniel.penDown();
	daniel.setSpeed(5);
	daniel.move(110);
	daniel.turn(90);
	for (int i = 0; i < 180; i++) {
		daniel.move(1);
		daniel.turn(1);
	}
	daniel.hide();
}
	
	
}
