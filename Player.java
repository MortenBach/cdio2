public class Player 
{
	
	private String name;
	private Account account;
	
	public Player(String name) 
	{
		this.name = name;
		account = new Account();
	}

	public void setPoints(int value)
	{
		this.account.setPoints(value);
	}
	
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
