public class Player 
{
	// These instance variables shall only be accessible from within the class scope. 
	// Making variables private helps us prevent that they will be tampered with from an external source.
	
	private String name;			// a reference to String called name.
	private Account account;		// a reference to Account called account. 
	
	// the class constructor
	public Player(String name) 		// to create an object of Player, a string argument is needed. This is used to assign a name to each real-life player.
	{
		this.name = name;			// the instance variable "name" is equal to the argument in the Player constructor.
		account = new Account();	// the Account reference now points at a new object of Account. Every time a new 
									// object of Player is created, the object creates a new object of Account. This means, that each Player object holds an Account object.
	}
	
	//setPoints, getPoints and setZero are all duplicates of the Account's class methods.
	//Creating these methods in the Player class makes it easier to set/get information to/from the Player's account.
	//e.g. this makes it possible to call Player.setPoints instead of Player.getAccount.setPoints, making the overall code more direct in terms of the Low Coupling principle.
	
	//setPoints(int value) assigns a value to the Player's account.
	public void setPoints(int value)	
	{
		this.account.setPoints(value);	// the Account reference "account" calls upon its class method setPoints(). (see class Account, line 17)
	}
	
	//getPoints() gets the Player's current account balance.
	public int getPoints()
	{
		return this.account.getPoints(); // the Account reference "account" calls upon its class method getPoints(). (see class Account, line 12)
	}
	
	//setZero() resets the Player's account balance.
	public void setZero() 
	{
		
		this.account.setZero(); // the Account reference "account" calls upon it's class method setZero(). (see class Account, line 23)
	}
	
	// toString() returns the name of the Player.
	public String toString() 
	{
		
		return name;
	}
}
