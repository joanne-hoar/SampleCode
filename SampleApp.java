public class SampleApp
{
	public static void main(String[] args)
	{
		MyClass theObject;
		theObject  = new MyClass();

		int inputNumber = Integer.parseInt(args[1]);
 
		if(theObject.getSecretNumber() <= 5)
			theObject.setSecretNumber(inputNumber);
		
		theObject.PrintMessage();
	}
}