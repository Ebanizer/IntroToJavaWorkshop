package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE
		Robot jimmy = new Robot("batman");
		jimmy.penDown();
		jimmy.setSpeed(15);
		int sides = 0;
		while (sides < 4) {
			jimmy.move(100);
			jimmy.turn(90);
			sides = sides + 1;

		}
	}
}
