
public class Dice 
{
	//the class constructor is empty
	public Dice() 
	{
		
	}

	// roll() returns an integer value of a random double "die" between 1 and 6.
	public int roll() 
	{
	
	double die = ((Math.random()*6) + 1);
	return (int) die;	
	}
}
