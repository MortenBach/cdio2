
public class Main 
{
	// the public static void main(String[] args) method executes the program.
	public static void main(String[] args) 
	{
	
		Controller AdventureGame = new Controller();	// a reference to the Controller class called "AdventureGame" points at a new object of Controller.
		AdventureGame.game();							// AdventureGame calls upon the game() method to run the game.
		
	}
}
