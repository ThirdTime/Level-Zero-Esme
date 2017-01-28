import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {

		int rannum = new Random().nextInt(100)+1;
		//To see the randomly generated number, get rid of the // below.
		//System.out.println(rannum);

		for (int i = 1; i <= 10; i++) {

			String usernumstring = JOptionPane.showInputDialog("Pick a number from 1-100.");
			
			int usernumint = Integer.parseInt(usernumstring);
			
			if (usernumint == rannum) {
				JOptionPane.showMessageDialog(null, "You won!");
				System.exit(0);
			} else if (usernumint > 100) {
				JOptionPane.showMessageDialog(null, "Keep your numbers under 100.");
			} else if (usernumint < 1) {
				JOptionPane.showMessageDialog(null, "Keep your numbers above 0");
			}else if (usernumint > rannum) {
				JOptionPane.showMessageDialog(null, "Too high");
			}else if (usernumint < rannum) {
				JOptionPane.showMessageDialog(null, "Too low");

			} 
		}
		JOptionPane.showMessageDialog(null, "You lose!");
		
	}

}
