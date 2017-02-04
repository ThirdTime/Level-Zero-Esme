import org.jointheleague.graphical.robot.Robot;

public class RobotFreestyle {
	public static void main(String[] args) {
		Robot zaira = new Robot("batman");

		zaira.miniaturize();
		zaira.setSpeed(10);
		zaira.penDown();
		zaira.setRandomPenColor();
		zaira.moveTo(300, 300);
		for (int i = 1; i <= 75; i++) {
			zaira.move(20);
			zaira.turn(i);
		}
		zaira.penUp();
		zaira.moveTo(300, 300);
		zaira.penDown();
		for(int l = 1;l<=75;l++){
			zaira.move(-20);
			zaira.turn(l);
		}
		zaira.penUp();
		zaira.moveTo(300, 300);
		zaira.penDown();
	}
}
