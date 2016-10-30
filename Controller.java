import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller 
{
	private static final int fieldNumber9  = 10;
	private static final int winCondition  = 3000;
	
	private Dice die = new Dice();
	private Fields field = new Fields();
	
	private int roll1 = 0;	 				
	private int roll2 = 0;					
	private int diceEyes, value;					
	
	private int currentPlayer = 0;											
	private List<Player> Players = new ArrayList<Player>(); 		
	private Player tempPlayer;
	
	private boolean win = false;
										
	public Controller() 
	{ 																
		Players.add(new Player("Player 1"));
		Players.add(new Player("Player 2"));
	}
		public void game() 
		{
		Scanner scan = new Scanner(System.in);											
		
		while (! win) 
		{																
			if (currentPlayer < Players.size())
			{													
				tempPlayer = Players.get(currentPlayer);											
				System.out.println("It's " + tempPlayer + "'s turn to roll the dice"); 	
																		
				roll1 = die.roll();													
				roll2 = die.roll();
				diceEyes = roll1 + roll2;												
				
				System.out.println(tempPlayer + " has rolled " + diceEyes +"" );
				scan.nextLine();
				
				value = field.FieldNumber(diceEyes);
				tempPlayer.setSum(value);
				
				extraTurn();													
				WinCondition();
				
					if(win) 
					{															
						break;	
					}
			
				System.out.println(tempPlayer + " has " + tempPlayer.getSum() + " points " );
				scan.nextLine();	
				
				currentPlayer++;
			}
			if (currentPlayer == Players.size()) 
			{													
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
				System.out.println(tempPlayer + " gets an extra turn and has " + tempPlayer.getSum() + " points " );	
			}
		}
		public void WinCondition() 
		{	
			if (tempPlayer.getSum() >= winCondition) 
			{
				win = true;
				System.out.println(tempPlayer + " has won the game with " + tempPlayer.getSum() + " points " );	
			}
		}
}

		
		

	
