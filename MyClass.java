/** 
 * this class demonstrates the idea of a basic class
 * 
 * it shows: 
 * 		- data hiding (accessor methods)
 * 		- public method
 * */ 

public class MyClass
{
	// ---- private members ----
	private int secretNumber = 5;

	// ---- accessor methods ----
	public int getSecretNumber()
	{
		return secretNumber;
	}

	public void setSecretNumber(int secretNumber)
	{
		if(secretNumber < 10)
			this.secretNumber = secretNumber;
	}
	
	// ---- public methods ----
	/**
	 * this function prints a message including the value of secret number
	 */
	public void PrintMessage()
	{
		System.out.print("\nHello, Jo " + this.secretNumber + "\n");
	}
}