import java.util.Random;

import javax.swing.JOptionPane;

public class RandomLottery {
	public static void main(String[] args) {
		Random generator= new Random();	
		
		int lotnum = generator.nextInt(100);
		String onelinelot = Integer.toString(lotnum)+" ";
		for(int repeat=1; repeat<=4;repeat= repeat+1){
			
			onelinelot=onelinelot+generator.nextInt(100) + " ";
		


		}
		JOptionPane.showMessageDialog(null,onelinelot);
	}
}
