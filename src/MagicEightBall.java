import java.util.Random;

import javax.swing.JOptionPane;

public class MagicEightBall {
	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			// Ask user for a question (no need to save the answer)
		String weather=	JOptionPane.showInputDialog("Ask the Magic 8 ball!");
			
			// Get a random number from 1 to 3
			int rannum = new Random().nextInt(3) + 1;

			if(weather.contains("weather")){
				JOptionPane.showMessageDialog(null, "IT'S GONNA HAIL LIKE YOU WOULDN'T BELIEVE!");
			}else if (rannum == 1) {
				// Print out "yes" if the random number is 1
				JOptionPane.showMessageDialog(null, "Yes.");
			} else if (rannum == 2) {
				// Print out "no" if it is 2
				JOptionPane.showMessageDialog(null, "No.");
			} else if (rannum == 3) {
				// Print out "it depends" if it is 3
				JOptionPane.showMessageDialog(null, "It depends.");
			}
		}

	}
}
