import javax.swing.*;
import java.awt.Dimension;
import java.util.Scanner;

public class RandomWalk {
	
	public static void main(String args[]) {
		
		JFrame frame = new JFrame("Frame");
		Scanner userInput = new Scanner(System.in);
		int maxSize = 800;
		int minSize = 200;
		int userChoice;
		
		System.out.print("Enter a # between 200 and 800 for the Window Size: ");
		userChoice = userInput.nextInt();
		
		if (userChoice < 200 || userChoice > 800) {
			System.out.println("Please Enter a Value between 200 and 800.");
			System.exit(0);
		}
		
	    // set the frame size and location, and make it visible (Got from this link https://bit.ly/2OfSzqA)
	    frame.setPreferredSize(new Dimension(userChoice, userChoice));
	    frame.pack();
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Closes Program if they close window
	}

}
