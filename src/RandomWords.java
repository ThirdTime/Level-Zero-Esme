import java.util.Random;

import javax.swing.JOptionPane;

public class RandomWords {
	public static void main(String[] args) {

		// Have random words print out to the console depending on what the user
		// types in.
		String ans = JOptionPane.showInputDialog("Enter a phrase.");
		
		int rannum=new Random().nextInt(3)+1;
		String randomword= "tiny tim!!!!!";
		if(rannum==1){
			randomword = "a small man";
		}else if(rannum==2){
			randomword = "a large dog";
		}else if(rannum==3){
			randomword = "several children";
		}
			
		
		if (ans.contains("weather")) {
			System.out.println("IT'S GONNA HAIL "+randomword+" LIKE YOU WOULDN'T BELIEVE!");
		} else if (ans.contains("a")) {
			System.out.print("garlic bread ");
		}
		if (ans.contains("e")) {
			System.out.print("Chipotle(tm) ");
		}
		if (ans.contains("o")) {
			System.out.print("spicy ");
		}
		if (ans.contains("i")) {
			System.out.print("tired ");
		}
		if (ans.contains("u")) {
			System.out.print("spaghetti ");
		}
	}
}
