package classwork;

public class AccountNumber {
	
	private int accountNumber;
	
	public AccountNumber() {
		this.accountNumber = 11111;
	}
	
	public boolean checkAccountNumber(int accountNumber) {
		if(this.accountNumber ==accountNumber) return true;
		return false;
	}
	
}
