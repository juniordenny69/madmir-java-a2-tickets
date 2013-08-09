import java.util.Scanner;


public class TicketNumbers {

	public static void main(String[] args) {
		int ticketNumber, stem, checkDigit;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please enter a six digit ticket number: ");
		ticketNumber = sc.nextInt();
		stem = ticketNumber / 10;
		checkDigit = ticketNumber % 10;
		
		while (checkDigit != stem % 7)	{
			System.out.println(" That is NOT a valid ticket number, lad!");
			System.out.println("Try Again: ");
			ticketNumber = sc.nextInt();
			stem = ticketNumber / 10;
			checkDigit = ticketNumber % 10;
	
		}

		System.out.println("That is a valid ticket number, good job!");

	}

}
