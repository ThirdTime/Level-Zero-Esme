import javax.swing.JOptionPane;

public class secretMessage {
	public static void main(String[] args) {

		// ask user for their name
		// save name as a variable
		String userName = JOptionPane.showInputDialog("What is your name?");

		// ask user for the password
		// save password as a variable
		String userPass = JOptionPane.showInputDialog("What is your password?");
		// if both the password and the name match the values set,
		// show a pop-up with a secret message.
		if (userName.equals("Intruder") && userPass.equals("Let me in")) {
			JOptionPane.showMessageDialog(null, "u did it");
		} else{
			// if one of them doesn't match or both don't match,
			// show a pop-up saying "Intruder!"
			JOptionPane.showMessageDialog(null, "INTRUDER!");
		}
	

	}
}
