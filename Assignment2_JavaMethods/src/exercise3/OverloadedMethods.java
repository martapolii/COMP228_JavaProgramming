
//Marta Polishchuk
//301432299
//COMP228 (Sec 403) 
//Lab 2
//Oct 4, 2024 

package exercise3;
//Q: Write a Java class that implements a set of three overloaded static methods. The methods should have different set of parameters and perform similar functionalities. Call the methods within main method and display the results.

public class OverloadedMethods {
	// methods will all add integers, but take a different number of integers as arguments 

	// first overloaded method
	public static int add(int a, int b) // accepts 2
	{
		return a + b;
	}
	//second overloaded method
	public static int add(int a, int b, int c) //3
	{
		return a + b + c;
	}
	
	//third overloaded method
	public static double add(int a, int b, int c, int d) //4
	{
		return a + b + c + d;
	}
	
	//main method
	public static void main(String[] args) {
		int method1 = add(5, 10);
		 System.out.println("result of adding two integers: " + method1);
			
		int method2 = add(2, 3, 4);
		 System.out.println("result of adding three integers: " + method2);
			
		double method3 = add(5, 3 ,8 ,1);
		 System.out.println("result of adding 4 integers: " + method3);
				   
		}
	
}
