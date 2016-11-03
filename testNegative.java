import static org.junit.Assert.*;

import org.junit.Test;

public class testNegative { 
	private Player testPlayer; //Reserves memory for a reference to an object.
	private int field1; //Reserves memory for the variable.
	public testNegative() { //Makes the reference refer to an instance of the object Player.
		testPlayer = new Player("testPlayer");
	}

	@Test
	public void testgame() {

		for (int i = 0; i < 20; i++) { //Loops makes certain that the score will eventually go below 0. 
			field1 = (int) ((Math.random()*(-10000))-1); //The variable field1 will be a random number between -1 and -10000. 
			System.out.println("Attempted to withdraw " + field1 + "credit."); 
			testPlayer.setPoints(field1); //the amount of points get added equal to the amount of field.
			avoidNegative(); //checks if the amount of points is below 0, and if this is true, it will adjust the points to be 0 instead.
			System.out.println(testPlayer + " now has " + testPlayer.getPoints() + " credit. "); 
			assertTrue(testPlayer.getPoints() >= 0); //This is the test that checks if the amount of points is getting below 0. 

		}

	}
	public void avoidNegative() {
		if (testPlayer.getPoints() < 0)
			testPlayer.setZero();

	}

}