import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

	// These instance variables shall only be accessible from within the class scope. 
	// Making variables private helps us prevent that they will be tampered with from an external source.
	
	// "final" makes sure, that the value of the variable never changes.
	// "fieldNumber10" and "winCondition" are declared constants. 
	private final int fieldNumber10 = 10;	// initializing final int fieldNumber10 to 10, for use in the method extraTurn().
	private final int winCondition = 3000;	// initializing final int winCondition to 3000 for use in the method winCondition().

	private Dice die = new Dice();			// the reference "die" points at a new object of Dice.
	private int roll1 = 0;					// int roll1 is initialized to 0.

	private int roll2 = 0;					// int roll2 is initialized to 0.
	private int diceEyes, value;			// integer references diceEyes and value are created.

	private int currentPlayer = 0;			// int currentPlayer is set to 0. This integer will work as a counter to shuffle through an ArrayList of Player objects.

	private List<Player> Players = new ArrayList<Player>();	// an ArrayList of type Player called Players is created. This is used to store the amount of Player objects equivalent to the amount of real-life players.
	private Player tempPlayer;								// a reference to Player called tempPlayer is created.

	private Fields result = new Fields();	// the reference "result" points at a new object of Fields.

	private boolean win = false;			// boolean win is initialized to false.
	
	// Every time we create a new object of Controller, the code in the constructor is executed.
	// Two objects of Player is added to the ArrayList Players, making the total amount of real-life players equal to two.
	public Controller() {

		Players.add(new Player("Player 1"));	// a new object of Player(String name) is added to the ArrayList Players.
		Players.add(new Player("Player 2"));	// 						----- || ------
	}
	
	// the game() method contains the essential game mechanics.
	public void game() {
		Scanner scan = new Scanner(System.in);		// the reference scan points at a new object of Scanner. This is used to register user input.

		while (!win) {								// a while loop that runs as long as win is false.
			if (currentPlayer < Players.size()) {	// if-statement evaluating if the counter variable currentPlayer is smaller than the size of the ArrayList Players

				tempPlayer = Players.get(currentPlayer); // the Player reference tempPlayer now points at the currentPlayer index of the ArrayList Players.							
				System.out.println("It's " + tempPlayer + "'s turn to roll the dice"); 
				
				roll1 = die.roll();						// roll1 equals the value of die.roll().	
				roll2 = die.roll();						// roll2 equals the value of die.roll(). roll1 and roll2 are initialized to die.roll() on two separate lines to execute the roll() method twice for two separate values.
				diceEyes = roll1 + roll2;				// diceEyes equals the sum of roll1 and roll2.

				value = result.assignValue(diceEyes);	// value is equal to the returned value of result.assignValue(diceEyes). diceEyes dictates what value is returned by the assignValue(int x) method.
				tempPlayer.setPoints(value);			// tempPlayer's account is regulated by value.

				extraTurn();							// extraTurn() is a method that evaluates if the player is to get an extra turn. See line 83.

				System.out.println(tempPlayer + " has rolled " + diceEyes + "");	// prints line.

				result.printStory(diceEyes);			// prints the story for the returned value of assignValue(int x). the printStory(int x) method is called upon by the Fields reference "result", again dictated by diceEyes.

				avoidNegative();						// if tempPlayer's account is prone to go negative, avoidNegative() will reset the account to 0. See line 97.
				winCondition();							// winCondition() evaluates if tempPlayer has won by getting 3000 or more points. See line 89.

				if (win) {								// if the boolean expression "win" is true, the program stops.
					break;
				}
				
				//the following code is only executed if win is false after the evaluation above
				
				System.out.println(tempPlayer + " now has " + tempPlayer.getPoints() + " credit. ");	// prints line.

				scan.nextLine();						// awaits user input.
				
				currentPlayer++;						// increments the counter currentPlayer by 1.
			}

			if (currentPlayer == Players.size()) {		// if-statement evaluating if currentPlayer is equal to the size of the ArrayList Players.
				currentPlayer = 0;						// if so, currentPlayer is reset to get to the first index of Players.
			}
		}

		scan.close();	// closes the scanner if win = true and the while-loop has been broken out of.
	}
	
	// the extraTurn() method grants the player an extra turn if conditions are met.
	public void extraTurn() {
		if (diceEyes == fieldNumber10) {	// if-statement evaluating if diceEyes equals 10. Landing on fieldNumber10 grants the player an extra turn,
			currentPlayer--;				// which is done by decrementing the counter currentPlayer by 1. This way currentPlayer refers to the same index of Players as the last iteration of the while-loop in game().
		}
	}

	public void winCondition() {
		if (tempPlayer.getPoints() >= winCondition) {				// if-statement evaluating if tempPlayer's account contains 3000 (int winCondition = 3000;) or more points.
			System.out.println(tempPlayer + " has won the game.");	// if so: prints line.
			win = true;												// win is set to true. See line 64.
		}
	}
	
	// the avoidNegative() method makes sure that tempPlayer's account can not go negative. 
	public void avoidNegative() {
		if (tempPlayer.getPoints() < 0)	// if-statement evaluating if tempPlayer's account is less than 0.
			tempPlayer.setZero();		// if so, the set.Zero() method is called upon. This resets tempPlayer's account to 0.
	}
}
