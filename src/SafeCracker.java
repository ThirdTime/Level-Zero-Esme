import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Random;


import javax.swing.JApplet;
import javax.swing.JOptionPane;


public class SafeCracker {


	public static void main(String[] args) {
		/* Your mission: use the tryCode method to crack the safe by trying all possible combinations */
//use some sort of counter for tryCode, for loop?
		
		for (int testing = 1; testing <= 99999; testing++){
		

		tryCode(testing);
	
		}
		
		
	}

	static void tryCode(int guess) {
		System.out.println("trying " + guess);


		int secretCode = 99999 - randomnum;


		if (guess == secretCode) {
			JOptionPane.showMessageDialog(null, "Congratulations! You cracked the safe with " + guess);
			playTheSoundOfSuccess();
			System.exit(0);
		}
	}


	private static void playTheSoundOfSuccess() {
		AudioClip sound;
		try {
			sound = JApplet.newAudioClip(new File("/Users/League/Google Drive/league-sounds/me-gusta.wav").toURI().toURL());
			sound.play();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}


	final static int randomnum = new Random().nextInt(100);
	}

