// Marta Polishchuk
// 301432299
// COMP228 (Sec 403) 
// Lab 2
// Oct 4, 2024 

package exercise2;
// Q: Design a Lotto class with one array instance variable to hold three random integer values (from 1 to 9). Include a constructor that randomly populates the array for a lotto object. Also, include a method in the class to return the array...

//need: array instance variable to hold 3 random integers from 1-9
		import java.util.Random;
	// will use jOptionPane class to interact with user
			import javax.swing.JOptionPane;
	//constructor tht randomly populates the array
	// method to return the array

// game: user choses # from 3-27. can play 5 times max. if sum matches number chosen by user = win, else game ends 

public class Lotto {

	private int[] lottoNumbers;  // store 3 random numbers 
	private static Random random = new Random();  
	
	// constructor to randomly populate array
	public Lotto() 
		{
		lottoNumbers = new int[3];
		for (int i = 0; i < lottoNumbers.length; i++) {
		lottoNumbers[i] = random.nextInt(9) + 1;  
			        }
		}
	
	//method to return array of numbers
	public int[] getLottoNumbers() 
	{
		return lottoNumbers;
	}
	
	//method to calculate sum of the numbers
	public int getSum() {
		int sum = 0;
		for (int num : lottoNumbers) {
			sum += num;
			        }
			 return sum;
			    }
	
	// simulate lotto game
	 public static void main(String[] args) {
	// get user input (a number between 3 and 27)
		String input = JOptionPane.showInputDialog(null, "Enter a number between 3 and 27:");
		int userNumber = Integer.parseInt(input);
	
	boolean userWins = false;  // track whether the user wins
	for (int i = 0; i < 5; i++) 
		{  // Run up to 5 times
		Lotto lotto = new Lotto();  // create a new lotto object
		int[] numbers = lotto.getLottoNumbers();
		int sum = lotto.getSum();
			            
	//show generated numbers and their sum
	JOptionPane.showMessageDialog(null, "Lotto numbers: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2] +
		 "\nSum: " + sum);
			            
	//check if user's number matches sum
		if (sum == userNumber) {
			userWins = true;
			 JOptionPane.showMessageDialog(null, "Congratulations! You win!");
			 break;  // end game
			 }
			}
	
	//if the user hasn't won after 5 tries
		if (!userWins)
		{
		JOptionPane.showMessageDialog(null, "Sorry, the computer wins.");
		}
	 }
}

		



