


import static org.junit.Assert.*;

import org.junit.Test;

public class TestRolls {
	
int numberOfRolls = 100000, result; //Thomasdad
	
	@Test
	public void DiceIntervalTest() {
		
		Dice a = new Dice(); 
		
		for (int roll = 0; roll <= numberOfRolls;)
		{
			roll += 1;
			result = a.roll();
			
			if ( result > 12 || result < 2)
				break;
			
		}
		assertTrue(result >= 1 && result <= 6);
	}

	int dice2, dice3, dice4, dice5, dice6, dice7, dice8, dice9, dice10, dice11, dice12, counter;
	
	
	@Test
	public void valueOccur() {
				
		Dice b = new Dice();
		Dice c = new Dice();
		
		for (int i = 1; i < numberOfRolls; i++)	{
			
			counter = b.roll() + c.roll();
			
			switch (counter){
			
			case 2:
				dice2 += 1;
				break;
			case 3:
				dice3 += 1;
				break;
			case 4:
				dice4 += 1;
				break;
			case 5:
				dice5 += 1;
				break;
			case 6:
				dice6 += 1;
				break;
			case 7:
				dice7 += 1;
				break;
			case 8:
				dice8 += 1;
				break;
			case 9:
				dice9 += 1;
				break;
			case 10:
				dice10 += 1;
				break;
			case 11:
				dice11 += 1;
				break;
			case 12:
				dice12 += 1;
				break;
		}
		}
		System.out.print("Number of 2`s: " + dice2 + "\tNumber of 3`s: " + dice3 + "\tNumber of 4`s: " + dice4 + "\tNumber of 5`s: " + dice5 + "\tNumber of 6`s: " + dice6 + "\tNumber of 7`s: " + dice7 + "\n \tNumber of 8`s: " + dice8 + "\tNumber of 9`s: " + dice9 + "\tNumber of 10`s: " + dice10 + "\tNumber of 11`s: " + dice11 + "\tNumber of 12`s: " + dice12);
		
		
		assertTrue(dice2 >= (2780-500) && dice2 <= (2780+500));
		assertTrue(dice3 >= (5560-500) && dice3 <= (5560+500));
		assertTrue(dice4 >= (8330-500) && dice4 <= (8330+500));
		assertTrue(dice5 >= (11110-500) && dice5 <= (11110+500));
		assertTrue(dice6 >= (13890-500) && dice6 <= (13890+500));
		assertTrue(dice7 >= (16670-500) && dice7 <= (16670+500));
		assertTrue(dice8 >= (13890-500) && dice8 <= (13890+500));
		assertTrue(dice9 >= (11110-500) && dice9 <= (11110+500));
		assertTrue(dice10 >= (8330-500) && dice10 <= (8330+500));
		assertTrue(dice11 >= (5560-500) && dice11 <= (5560+500));
		assertTrue(dice12 >= (2780-500) && dice12 <= (2780+500));
	}
}