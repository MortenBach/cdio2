
import static org.junit.Assert.*;

import org.junit.Test;

public class TestNegative {
	private Player testPlayer;
	private Account testAccount;
	private int field1;
	public TestNegative() {
		testPlayer = new Player("testPlayer");
	}

	@Test
	public void testgame() {

		for (int i = 0; i < 20; i++) {
			field1 = (int) ((Math.random()*(-10000))-1);
			testAccount = testPlayer.getAccount();
			System.out.println("Attempted to withdraw " + field1 + "credit.");
			testAccount.setPoints(field1);
			avoidNegative();
			System.out.println(testPlayer + " now has " + testAccount.getPoints() + " credit. ");
			assertTrue(testAccount.getPoints() >= 0);

		}

	}
	public void avoidNegative() {
		if (testAccount.getPoints() <= 0)
			testAccount.setZero();

	}

}
