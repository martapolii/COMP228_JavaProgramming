package Arrays;
import java.util.Scanner;


public class Arrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//int[] marks; // declare the array variable
		
		//marks = new int[5]; // need to specify size of the array when creating 
		
		int[]marks = {34, 29, 24, 25, 20}; // initializing + declaring array and values
		int total = 0;
		//accepting the values for the array via keyboard input
		//for (int i = 0; 1 < marks.length; i++)
		//{
		//	System.out.println("Enter the value" + (i+1) );
		//	marks[i] = sc.nextInt();
		//}
		
		//can create several arrays in one declaration:
		String[] names = new String[100], addresses = new String[50];
		
		//Printing the array
		System.out.printf("%s%8s%n", "Index", "Value"); //heading
		//printf = format output. %s = first char will be a string. %8 = 8 spaces in output and then new variable. %n = new line
		
		//accessing the elements of the array -- printing
		for(int counter = 0; counter < marks.length; counter++)
		{
			System.out.printf("%5d%8d%n", counter, marks[counter]); // 5d= 5 spaces, integer; then 8 spaces, then integer; then move cursor to the next line 
			//total += marks[counter]
		}
		
		
		try {
		      System.out.println(marks[5]); // this gives out of bounds error
		}
		catch(ArrayIndexOutOfBoundsException ec) //this is a pre-defined class
		{
			//ec.getMessage(); // getMessage() prints a pre-defined error message 
			//System.out.println("You are trying to access a wrong index...");
			System.out.println(ec.getMessage());
		}
		//System.out.println("Total of the array" + total);
	
	}
}
