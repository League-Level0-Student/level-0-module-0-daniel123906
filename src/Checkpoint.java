import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("What is your favourite color?");
	JOptionPane.showMessageDialog(null, input+ " is also my favourite color!"); 
	Robot Daniel = new Robot();
	Daniel.penDown();
	Daniel.setSpeed(100);
	Daniel.move(100);
	Daniel.turn(120);
	Daniel.move(100);
	Daniel.turn(120);
	Daniel.move(100);
	
}
}

	
 