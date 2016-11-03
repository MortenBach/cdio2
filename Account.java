
public class Account 
{
	private int points = 1000;
	
	public Account() 
	{
	}
	public int getPoints() 
	{
		return points;
	}
	public void setPoints(int points) 
	{
		
		this.points += points;
	}
	public void setZero() 
	{
		
		points = 0;
	}
}
