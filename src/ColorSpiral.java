import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ColorSpiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot ken = new Robot("batman");
		// 5. Set your robot's pen to the down position
ken.penDown();
		// 3. Set the robot to go at max speed (10)
ken.setSpeed(10);
		// 4. Repeat the code below 75 times (you’ll need to move the mustache!)

String side = JOptionPane.showInputDialog("How many sides shoud the spiral have?");
int sidetheint = Integer.parseInt(side);
for(int rep =1; rep <= 75;rep++){
	

			// 7. Change the pen color to random
	ken.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
	ken.move(5*rep);
			// 2. Turn the robot 1/3 of 360 degrees to the right
	ken.turn(360/sidetheint);
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
	
			// 9. Set the pen width to i
	ken.setPenWidth(rep);
		}

	}
}



