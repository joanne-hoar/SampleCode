public class SampleApp
{
	public static void main(String[] args)
	{
		MyClass theObject;
		theObject  = new MyClass();

		int inputNumber = 7;

        if (args.length > 1) {
            try {
                inputNumber = Integer.parseInt(args[1]);
			} catch (NumberFormatException e) {
                System.out.println("Invalid input. Using default secret number.");
            }
		}

		if(theObject.getSecretNumber() <= 5)
			theObject.setSecretNumber(inputNumber);
		
		theObject.PrintMessage();
	}
}