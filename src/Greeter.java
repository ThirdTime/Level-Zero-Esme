import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {

	String answer= JOptionPane.showInputDialog(null, "What's your name?");
	if(answer.equalsIgnoreCase("Esme")){
		JOptionPane.showMessageDialog(null,"That's a nice name");
}
	
	else{
		JOptionPane.showMessageDialog(null, "Hello "+answer+"!");
}
}
}
