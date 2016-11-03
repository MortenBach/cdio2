
public class Account {
	
	private int points = 1000; // int points is initialized to 1000.

	// the class constructor is empty
	public Account() { 
	}

	
	//getPoints() returns the value of points.
	public int getPoints() {
		return points;
	}
	
	//setPoints() adds points to the current amount of points in Account.
	public void setPoints(int points) {

		this.points += points;
	}
	
	//setZero() resets the balance of account by setting points to 0.
	public void setZero() {

		points = 0;
	}
}
