// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz {
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String bananlike = JOptionPane.showInputDialog("do you like bananas?");
		//2. if they say no, 
		if(bananlike.equalsIgnoreCase("no")){
			JOptionPane.showMessageDialog(null, "You're crazy!");
		} else
			if(bananlike.equalsIgnoreCase("yes")){
				String hobby = JOptionPane.showInputDialog("What's your favorite hobby?");
				JOptionPane.showMessageDialog(null, hobby+ " is much, MUCH better with bananas!");
			
			} else{
				JOptionPane.showMessageDialog(null,"You're bananas!");
			}		
				
		
	}

}
