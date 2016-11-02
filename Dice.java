
public class Dice {

	public Dice() {
		
	}

public int roll() {
	
	double die = ((Math.random()*6) + 1);
	return (int) die;
	
}
}