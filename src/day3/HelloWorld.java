package day3;

import javax.swing.JOptionPane;

public class HelloWorld {
public static void main(String[] args) {
	System.out.println("good morning");
	JOptionPane.showMessageDialog(null, "good morning");
	String name=JOptionPane.showInputDialog("good morning");
	JOptionPane.showMessageDialog(null, name);
	
}
}
