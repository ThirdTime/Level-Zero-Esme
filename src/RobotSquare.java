import org.jointheleague.graphical.robot.Robot;

public class RobotSquare {
	public static void main(String[] args) {
		//just a friendly lil bot
		Robot rob= new Robot("batman");
		rob.setSpeed(15);
		rob.penDown();
		//this one's the square
		for(int robgo=1;robgo<=4;robgo++){
			rob.setRandomPenColor();
			rob.move(200);
			rob.turn(-90);
		}
		//moving the robot
		rob.penUp();
		rob.moveTo(1100, 650);
		rob.penDown();
		//drawing the circle
		for(int colorchange=1;colorchange<=4;colorchange++){
			rob.setRandomPenColor();
			for(int circle=1;circle<=91;circle++){
				rob.move(4);
				rob.turn(-1);
			}
		}
	}
}
