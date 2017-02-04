import javax.swing.JOptionPane;

public class MorningZombie {
	
	static void dayInstruct(String dayoweek){
		JOptionPane.showMessageDialog(null, "It's "+dayoweek+"! Time for school (:");
		JOptionPane.showMessageDialog(null, "Get dressed!");
		JOptionPane.showMessageDialog(null, "Eat breakfast!");
		JOptionPane.showMessageDialog(null, "Pack your backpack!");
	}
	
	public static void main(String[] args) {
		String date = JOptionPane.showInputDialog("What day is it?");
		if(date.equalsIgnoreCase("Monday")
				||date.equalsIgnoreCase("Tuesday")
				||date.equalsIgnoreCase("Wednesday")
				||date.equalsIgnoreCase("Thursday")
				||date.equalsIgnoreCase("Friday")){
			dayInstruct(date);
		}
		
		if(date.equalsIgnoreCase("Saturday")){
			JOptionPane.showMessageDialog(null, "It's Saturday!!!! Time to go to coding class :)");
			JOptionPane.showMessageDialog(null, "Get dressed!");
			JOptionPane.showMessageDialog(null, "Eat breakfast!");
			JOptionPane.showMessageDialog(null, "Pack your backpack!");
		}
	}
}
