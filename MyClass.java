public class MyClass
{
	private int secretNumber = 5;

	public int getSecretNumber()
	{
		return secretNumber;
	}

	public void setSecretNumber(int secretNumber)
	{
		if(secretNumber < 10)
			this.secretNumber = secretNumber;
	}
	
	public void PrintMessage()
	{
		System.out.print("\nHello, Jo " + this.secretNumber + "\n");
	}
}