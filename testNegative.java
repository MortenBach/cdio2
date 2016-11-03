import static org.junit.Assert.*;

import org.junit.Test;

public class testNegative { 
	private Player testPlayer; //Reserverer plads til en reference 
	private int field1; //reserverer plads til variablen field
	public testNegative() { //Referencen refererer til objektet Player
		testPlayer = new Player("testPlayer");
	}

	@Test
	public void testgame() {

		for (int i = 0; i < 20; i++) { //Løkken anvendes så scoren med sikkerhed går i 0.
			field1 = (int) ((Math.random()*(-10000))-1); //field1 sættes til at være en vilkårlig værdi mellem -1 og -10000, og cases til en int. 
			testPlayer = testPlayer.getPlayer(); //Objektet testPlayer modtager værdien af points.
			System.out.println("Attempted to withdraw " + field1 + "credit."); 
			testPlayer.setPoints(field1); //Points justeres ud fra værdien af field1. 
			avoidNegative(); //Ser om antallet point nu er under 0, og sætter til 0, hvis dette er sandt.
			System.out.println(testPlayer + " now has " + testPlayer.getPoints() + " credit. "); 
			assertTrue(testPlayer.getPoints() >= 0); //Tester om værdien af points kommer under 0.

		}

	}
	public void avoidNegative() {
		if (testPlayer.getPoints() <= 0)
			testPlayer.setZero();

	}

}
