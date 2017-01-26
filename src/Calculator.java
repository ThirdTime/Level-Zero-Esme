import javax.swing.JOptionPane;

public class Calculator {
	public static void main(String[] args) {
		String ans1 = JOptionPane.showInputDialog("Enter a number.");
		
		String symbol = JOptionPane.showInputDialog("+,-,*,/");
		String ans2 = JOptionPane.showInputDialog("Enter another number.");
		int numone = Integer.parseInt(ans1);
		int numtwo = Integer.parseInt(ans2);
	
		if (symbol.equals ("+")){
			JOptionPane.showMessageDialog(null,numone+numtwo);
			 
			}
		else {
			if (symbol.equals("-")){
				JOptionPane.showMessageDialog(null,numone-numtwo);
			} else{
				if (symbol.equals("*")){
					JOptionPane.showMessageDialog(null,numone*numtwo);
				} else{
					if (symbol.equals("/")){
						JOptionPane.showMessageDialog(null,numone/numtwo);
						 
				} else{
						JOptionPane.showMessageDialog(null,"error");
						 
				}
					
				
			}
			
		}
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
}
