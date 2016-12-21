package day3;

import javax.swing.JOptionPane;

public class Complimentor {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("Enter your Name");
	JOptionPane.showMessageDialog(null, "Hi "+name+" That is a great name");
	JOptionPane.showMessageDialog(null, "You have a very nice shirt " +name);
	JOptionPane.showMessageDialog(null, "I was hoping you could tell me where you got it");
	JOptionPane.showMessageDialog(null, name+ " sounds like a name you would find in the hall of fame");
}
}
