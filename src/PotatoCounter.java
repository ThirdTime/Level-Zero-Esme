import javax.swing.JOptionPane;

public class PotatoCounter {
public static void main(String[] args) {
	
	int hotPotato = 1;
	String yesno = JOptionPane.showInputDialog("Do you want to run this code? Type 'yes' or 'no'.");
	
	if(yesno.equalsIgnoreCase ("yes")){
		
		String count = JOptionPane.showInputDialog("What do you want to count?");
		
		while (hotPotato <= 7){
			if (hotPotato ==4){
				System.out.print(hotPotato + ", ");
				hotPotato = hotPotato+1;
			}
		else
			{
			System.out.print(hotPotato+" "+ count + ", ");
			hotPotato = hotPotato+1;
			}
		}
		System.out.print("More!");
	}
		else
		{
			System.out.println("(ఠ్ఠ ˓̭ ఠ్ఠ)");
		}

}
}