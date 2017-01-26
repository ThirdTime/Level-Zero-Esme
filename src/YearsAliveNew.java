import javax.swing.JOptionPane;

public class YearsAliveNew {
	public static void main(String[] args) {
		
		String years = JOptionPane.showInputDialog("How old are you?");
		int yearstheint = Integer.parseInt(years);
		int thisyear = 2017;

		for(int run= 2017; run>=2017-yearstheint; run--){
		
			System.out.println(run);
			
		}

		System.out.println("You were born on the year "+ (thisyear-yearstheint));
		System.out.println("Well, give or take a year. We're not always perfect.");
	}
}

