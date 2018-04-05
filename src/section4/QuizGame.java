package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
int score = 0;
		// 2.  Ask the user a question 
	String input = JOptionPane.showInputDialog("Is school educational?");
		
		// 3.  Use an if statement to check if their answer is correct
if (input.equals("Yes")) {
score= score+1;
}

else {
	score = score-1;
}
		
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String question = JOptionPane.showInputDialog("Would an avocado fall under the fruit food group?");
		
		if (question.equals("Yes")) {
			score = score + 1;
		}
		else {
			score = score-1;
		}

		
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "" + score);
		
	}
}
