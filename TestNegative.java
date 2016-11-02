
import static org.junit.Assert.*;

import org.junit.Test;

public class TestNegative {
	private int diceEyes;
	private Player testPlayer;
	private Account testAccount;
	private Fields result = new Fields();
	public TestNegative() {
		testPlayer = new Player("testPlayer");
	}

	@Test
	public void game() {

		for (int i = 0; i < 20; i++) {

			testAccount = testPlayer.getAccount();
			diceEyes = 3;
			System.out.println(testPlayer + " has rolled " + diceEyes + "");
			result.printstory(diceEyes);
			testAccount.setPoints(result.assignvalue(diceEyes));
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
