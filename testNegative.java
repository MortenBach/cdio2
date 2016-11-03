import static org.junit.Assert.*;

import org.junit.Test;

public class testNegative {
	private Player testPlayer;
	private int field1;

	public testNegative() {
		testPlayer = new Player("testPlayer");
	}

	@Test
	public void testgame() {

		for (int i = 0; i < 20; i++) {
			field1 = (int) ((Math.random() * (-10000)) - 1);
			System.out.println("Attempted to regulate account by " + field1 + "credit.");
			testPlayer.setPoints(field1);
			avoidNegative();
			System.out.println(testPlayer + " now has " + testPlayer.getPoints() + " credit. ");
			assertTrue(testPlayer.getPoints() >= 0);

		}

	}

	public void avoidNegative() {
		if (testPlayer.getPoints() < 0)
			testPlayer.setZero();

	}

}
