

public class Player {
	
	private String name;
	private Account account;
	
	public Player(String name) {
		this.name = name;
		account = new Account();
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account tempAccount) {
		account = tempAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		
		return name;
		
	}
}
