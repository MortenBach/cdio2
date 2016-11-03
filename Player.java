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
	
	//setPoints(int value) makes it easier to assign values to the Player's account.
	//This makes it possible to call Player.setPoints() instead of Player.getAccount().setPoints(), making the overall code more direct.
	public void setPoints(int value)	
	{
		this.account.setPoints(value);	// the Account reference "account" calls upon it's class method setPoints(). (see class Account, line 17)
	}
	
	//
	public int getPoints()
	{
		return this.account.getPoints();
	}
	public void setZero() 
	{
		
		this.account.setZero();
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String toString() 
	{
		
		return name;
	}
}
