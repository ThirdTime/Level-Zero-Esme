import java.util.Random;

import javax.swing.JOptionPane;

public class RandomWords {
	public static void main(String[] args) {

		// Have random words print out to the console depending on what the user
		// types in.
		String ans = JOptionPane.showInputDialog("Enter a phrase.");

		int rannum = new Random().nextInt(3) + 1;
		String randomword = "tiny tim!!!!!";
		if (rannum == 1) {
			randomword = "burning fire, cutting deep into the flesh of all who behold it";
		} else if (rannum == 2) {
			randomword = "cats and dogs. Literal cats and literal dogs";
		} else if (rannum == 3) {
			randomword = "H2O, suspended in a frozen state";
		}

		if (ans.contains("weather")) {
			System.out.println("IT'S GONNA HAIL " + randomword + " LIKE YOU WOULDN'T BELIEVE!");
		} else if (ans.contains("?")) {
			System.out.print("What do I look like, Siri?");
		}

	}
//aaaaaaaaaaaaaaaaaah
	/*String lettersMethod(String letter) {
		if (letter.equals("a")) {
			return "garlic bread ";
		} else if (letter.equals("e")) {
			return "fire";
		} else if (letter.equals("o")) {
			return "trees";
		}
		if (letter.equals("i")) {
			return "stars";
		}
		if (letter.equals("u")) {
			return "spaghetti";
		}
	}
	*/

}
