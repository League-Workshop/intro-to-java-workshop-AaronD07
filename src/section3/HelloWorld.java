package section3;

import javax.swing.JOptionPane;

public class HelloWorld {
public static void main(String[] args) {
	System.out.println("Hello World!");
	JOptionPane.showMessageDialog(null, "Hello Child");
	String input = JOptionPane.showInputDialog("How are you today?");
}
}
