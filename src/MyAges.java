import javax.swing.JOptionPane;

public class MyAges {
	public static void main(String[] args) {
		String userage = JOptionPane.showInputDialog("What is your age?");
		int userageint = Integer.parseInt(userage);

		for (int i = 1; i <= userageint; i++) {
			if (userageint == 1) {
				System.out.println("You are now 1 year old.");
			} else if (i == 1) {
				System.out.println("You have been 1 year old.");
			} else if (i == userageint) {
				System.out.println("You are now " + userageint + " years old.");
			} else
				System.out.println("You have been " + i + " years old.");
		}

	}
}
