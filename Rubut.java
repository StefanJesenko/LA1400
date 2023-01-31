package JesenkoStefan;
import robocode.*;

public class Rubut extends JuniorRobot
{

	public void run() {
		
		setColors(green, white, red, yellow, black);
		while(true) {
			crossMovement();
		}
	}
			
	public void onScannedRobot() {
		aimAtRobot();
	}
	
	public void onHitByBullet() {
		runAway();
	}
	
	public void onHitWall() {
		turnAround();
	}
	
	public void turnAround(){
		turnRight(180);
		runAway();
	}
	
	public void runAway(){
		ahead(100);
	}
	
	public void aimAtRobot(){
		//Estimates the position that the Robot will be at as close as possible.
		turnGunTo(estimateAim());
		fire(2.7);
	}
	
	public int estimateAim(){
		return scannedAngle + scannedVelocity/(5/2);
	}

	public void crossMovement(){
		ahead(175);
		turnRight(90);
		back(175);
		turnGunRight(200);
	}
}
