package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
	
 speak("Spell mandlebrot");

String input = JOptionPane.showInputDialog("Spell");
		
if(input.equals("mandlebrot")) {
	speak("Correct");
	
}
else {
	speak("Incorrect");
	
}
speak("Spell quincunx");

	 String word = JOptionPane.showInputDialog("Spell");
	 		
	 if(word.equals("quincunx")) {
	 	speak("Correct");
	 	
	 }
	 else {
	 	speak("Incorrect");


	
	 }
	 speak("Spell bewildering");

	 String vocab = JOptionPane.showInputDialog("Spell");
	 		
	 if(vocab.equals("bewildering")) {
	 	speak("Correct");
	 	
	 }
	 else {
	 	speak("Incorrect"); 
	 	}
	 speak("Spell bratwurst");

	 String drow = JOptionPane.showInputDialog("Spell");
	 		
	 if(drow.equals("bratwurst")) {
	 	speak("Correct");
	 	
	 }
	 else {
	 	speak("Incorrect");
	 }
	 speak("Spell beguile");

	 String person = JOptionPane.showInputDialog("Spell");
	 		
	 if(person.equals("beguile")) {
	 	speak("Correct");
	 	
	 }
	 else {
	 	speak("Incorrect");
	 }


	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


