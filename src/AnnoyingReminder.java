import javax.swing.JOptionPane;

public class AnnoyingReminder {
public static void main(String[] args) {
	

	JOptionPane.showMessageDialog(null,"What do you want to be reminded of?");
	JOptionPane.showMessageDialog(null, "Your forgotten past? ");
	JOptionPane.showMessageDialog(null, "The sins you've commited?");
	String remind = JOptionPane.showInputDialog("That you have to do your homework?");
	
	String numastring = JOptionPane.showInputDialog("How many times do you want to be reminded?");
	
	int intnum = Integer.parseInt(numastring);
	
	for(int tinyboy = 1; tinyboy <= intnum-1; tinyboy = tinyboy+1){
		
		JOptionPane.showMessageDialog(null, remind);
		
		
		
	}
	JOptionPane.showMessageDialog(null, "You really should " + remind);
	
	
	
	
	
}
}
