import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		// getting input from user
		Scanner scan = new Scanner(System.in);
		
		// play again
		String playAgain = "";
		
		//game loop (do loop)
		do {
			// create a random number from 1-100
			int theNumber = (int)(Math.random()*100 + 1);
			
			int guess = 0;
			
			while ( guess != theNumber ) {
				System.out.println("Guess a number between 1 and 100: ");
				
				// get the user's guess
				guess = scan.nextInt();
				
				if (guess < theNumber) {
					System.out.println(guess + " is too low, try again!");
				}else if (guess > theNumber){
					System.out.println(guess + " is too high, try again!");
				}else{
					System.out.println(guess + " is correct...you win!");
				}
			}
			
			// ask user to play again
			System.out.println("Would you like to play again (y/n)? ");
			playAgain = scan.next();		
			
		} while (playAgain.equalsIgnoreCase("y"));
		// thank user for playing
		System.out.println("Thanks for playing, goodbye!");

	}

}
