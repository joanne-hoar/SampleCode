/**
 * this class demonstrates the main point of entry for the program
 * 
 * it creates an instance object of type MyClass
 * it shows command line arg parsing and try/catch mechanism
 */

public class SampleApp
{
	public static void main(String[] args)
	{
		MyClass theObject; //declaration of object
		theObject  = new MyClass(); // instantiation of object

		int inputNumber = 7;

		// read integer from command line argument if provided
        if(args.length > 1){
            try {
                inputNumber = Integer.parseInt(args[1]);
			} 
			catch (NumberFormatException e){
                System.out.println("Invalid input. Using default secret number.");
            }
		}

		// accessor methods
		if(theObject.getSecretNumber() <= 5)
			theObject.setSecretNumber(inputNumber);
		
		// public function
		theObject.PrintMessage();
	}
}