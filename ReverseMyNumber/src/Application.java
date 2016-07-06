import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		int number = 0;
		// This receives the user input
		int reverseNumber = 0;
		// This becomes the output
		System.out.println("Type in an integer and press enter:");
		// This asks the user for input
		Scanner in = new Scanner(System.in);
		
		number = in.nextInt();
		
		while (number!=0) {
			
			reverseNumber = reverseNumber * 10 + number % 10;
			/* This takes the reverseNumber, which is initialized to 0 and adds
			 * the last digit of number to it until number = 0.
			 */
			number = number/10;
			/* Since number and 10 are both int values, the resulting number 
			 * is also an int and the decimal remainder is truncated. This gets
			 * rid of the last digit in number until number = 0.
			 */
		}
		System.out.println("Your number in reverse is:" + reverseNumber);
	}
	
}
