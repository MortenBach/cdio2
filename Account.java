
public class Account 
{
	private int sum = 1000;
	
	public int getSum() 
	{
		return sum;
	}

	public void setSum(int sum) 
	{
		this.sum += sum;
		
		if (this.sum < 0)
			this.sum = 0;
	}
}
