public class SampleApp
{
	public static void main(String[] args)
	{
		MyClass theObject;
		theObject  = new MyClass();

		if(theObject.getSecretNumber() <= 5)
		theObject.setSecretNumber(7);
		
		theObject.PrintMessage();
	}
}