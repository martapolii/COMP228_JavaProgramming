package Arrays;

public class PassingArraysToMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] myarray = {1,2,3,4,5};
		
		System.out.printf("The values of the original Array:%n");
		//original array
		
		for (int value: myarray)
			System.out.printf("%4d", value);
		
		modifyArray(myarray); //pass array reference
		
		System.out.printf("%nThe values of the modified array:%n");
		
		for (int value: myarray)
			System.out.printf("%4d", value);
		
		//Trying to change value of specific element:
		System.out.printf("%nThe values of the array element:%d%n", myarray[2]);
		
		modifyElement(myarray[2]);
		
		System.out.printf("%nThe values of the array element after modifying:%d%n", myarray[2]);
		
		JOption.Pane.s
		
		
	}
		
		private static void modifyElement(int element) // we are changing the local variable. when the method terminates this changed value is destroyed = means the value isnt diff in the output
		{
			element = element * 10;
			// value will change if you print here
			System.out.printf("%nThe values of the array element after modifying:%d%n", element);
		}
	
	
	
		private static void modifyArray(int[] array2)
		{
			for (int i = 0; i < array2.length ; i++)
				array2[i] *= 2; //or array2[i] = array2[i] * 2;
		}
		
		//for (int i=0; i < myarray.length; i++)
			//System.out.printf("%4d", myarray[i]); // 4 spaces between each 'd' (integer)
		
		
		// or foreach loop:
		//for (int value: myarray )
		//	System.out.printf("%4d",value);
		
		
		
	

}
