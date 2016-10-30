public class Player 
{
	private Account account = new Account();
	private String name;

	public Player(String name)
	{
		this.name = name;
	}
	
	public String toString() 
	{
		return name;
	}
	
	public String getName() 
	{
		return this.name;
	}

	public void setSum(int value)
	{
		this.account.setSum(value);
	}
	
	public int getSum()
	{
		return this.account.getSum();
	}
	
}
