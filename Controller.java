import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
	
	//Instance variabler skal være private
	
	private static final int fieldNumber9 = 10;
	private Dice die = new Dice();			// Laver et nyt objekt af klassen Dice
	private int roll1 = 0;	 				// Laver to lokale variable, der indeholder to separate værdier
	private int roll2 = 0;					// af die.roll();
	private int diceEyes;					// Laver en diceEyes variabel, vi bruger i game() metoden.
	
	private int currentPlayer = 0;											// Reserverer plads til int i og initialiserer til 0.			
	private List<Player> Players = new ArrayList<Player>(); 		//Laver en Arrayliste, der kan indeholde referencer til objekter af Player
	private Player tempPlayer;
	
	private boolean win = false;
										
	public Controller() 
	{ 																// Laver et objekt af klassen layer og sætter Player 1/2 ind som string i constructore
		Players.add(new Player("Player 1"));						// Tiføjer spillere til listen Players
		Players.add(new Player("Player 2"));
	}
	
		public void game() 
		{
		Scanner scan = new Scanner(System.in);											// Laver en scanner
		
		while (! win) 
		{																	// Laver en while løkke, der kører forevigt da while (true)
			if (currentPlayer < Players.size())
			{													// Laver et if-statement til index i, i arraylisten Players
				tempPlayer = Players.get(currentPlayer);											// Laver en reference til klassen Player, vi kalder for tempPlayer. tempPlayer refererer til index i, i arrayListen Players														
				System.out.println("It's " + tempPlayer + "'s turn to roll the dice"); 	// Printer
				scan.nextLine();														// Venter på nextLine for at komme videre
				
				roll1 = die.roll();														// Sætter roll1 og roll2 lig die.roll(), men på hver sin linie, så de får hver sin værdi
				roll2 = die.roll();
				diceEyes = roll1 + roll2;												// Initialiserer diceEyes til roll1 + roll2
				//tempPlayer.fieldnumber(diceEyes);//  ---*Dette skal bruges til klassen fields og er et eksempel*---
				
				extraturn();													
				WinCondition();
			
					if(win) 
					{															// Hvis win er true, stopper den while loopet
						break;	
					}
					
				
				
				System.out.println("" + tempPlayer + " has rolled " + diceEyes +"" ); 	// Printer
				scan.nextLine();	
				
				currentPlayer++;
			}
			
			if (currentPlayer == Players.size()) 
			{													// if-statement, der resetter i når den bliver lig længden af Players listen
				currentPlayer = 0;
			}
		}
		
		scan.close();
		}
		public void extraTurn()
		{
			if (diceEyes == fieldNumber9) 
			{
				currentPlayer--;
			}
		}
		public void WinCondition() 
		{
			if (tempPlayer.points () >= 3000) //Dette er bare et eksempel, metoden skal tilpasses efter klassen konto//
			{
				win = true;
			}
		}

}

		
		

	
