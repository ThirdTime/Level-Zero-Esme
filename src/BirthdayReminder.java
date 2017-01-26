import javax.swing.JOptionPane;

public class BirthdayReminder {
	public static void main(String[] args) {
		String michiyoBirth = "July 12th";
		String esmeBirth = "August 26th";
		String ajBirth = "January 31st";
		String emilyBirth = "July 28th";
		String chrisBirth = "May 9th";
		String birth = JOptionPane.showInputDialog("Whose birthday do you want to know? Type in their name.");

		if (birth.equals("Michiyo")) {
			JOptionPane.showMessageDialog(null, "Michiyos' birthday is " + michiyoBirth);
		}
		else if (birth.equals("Esme")) {
			JOptionPane.showMessageDialog(null, "Esmés' birthday is " + esmeBirth);
		} 
		else if (birth.equals("AJ")) {
			JOptionPane.showMessageDialog(null, "AJs' birthday is " + ajBirth);
		} 
		else if (birth.equals("Emily")) {
			JOptionPane.showMessageDialog(null, "Emilys' birthday is " + emilyBirth);
		}
		else if(birth.equals("Chris")){
			JOptionPane.showMessageDialog(null, "Chris' birthday is "+ chrisBirth);	
		} 
		else{
			JOptionPane.showMessageDialog(null, "Sorry, I don't know their birthday. Try someone else!");
		}

	}
}
