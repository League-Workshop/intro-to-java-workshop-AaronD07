package section2;

import org.jointheleague.graphical.robot.Robot;

public class Initials {

	public static void main(String[] args) {
		Robot r2d2 = new Robot ();
		r2d2.setSpeed(100);
		r2d2.turn(35);
		r2d2.penDown();
		r2d2.setRandomPenColor();
		r2d2.move(200);
		r2d2.turn(110);
		r2d2.move(200);
		r2d2.turn(180);
		r2d2.move(100);
		r2d2.turn(-50);
		r2d2.move(100);
r2d2.hide();
	}

}
