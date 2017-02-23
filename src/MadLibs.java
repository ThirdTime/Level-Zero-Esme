import javax.swing.JOptionPane;

public class MadLibs {
	public static void main(String[] args) {
String pname = JOptionPane.showInputDialog("Enter a proper name.");
String verb = JOptionPane.showInputDialog("Enter a verb.");
String verbtwo = JOptionPane.showInputDialog("Enter a second verb.");
String adjective = JOptionPane.showInputDialog("Enter an adjective.");

JOptionPane.showMessageDialog(null, pname+" is "+verb+" at their desk, "+verbtwo+". "+pname+" thinks "+verbtwo+ " is pretty "+adjective+".");

	}
}
