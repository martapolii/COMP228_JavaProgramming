/* COMP228 Section 403
 * Marta Polishchuk
 * 301432299
 * Lab01
 */

package exercise1;

public class Driver {

	public static void main(String[] args) {
		// create a Singer object with the no-argument constructor:
		Singers singer1 = new Singers();
		singer1.printSingers(); // created a method to neatly display all object properties
		// this will print all instance variables with default values (0, null, null, null, 0)

		// set the values of each instance variable with the help of setters:
		singer1.setId(1);
		singer1.setName("Lady Gaga");
		singer1.setAddress("123 Hollywood Blvd");
		singer1.setDateOfBirth("March 28, 1986");
		singer1.setAlbumsPublished(5);
		
		// display the object data with the new values:
		singer1.printSingers();
		
		// can also display object data by calling on the getters directly:
		System.out.println("Singers ID: " + singer1.getId());
		System.out.println("Singers Name: " + singer1.getName());
		System.out.println("Singers Address" + singer1.getAddress());
		System.out.println("Singers Date of Birth: " + singer1.getDateOfBirth());
		System.out.println("Albums Published by Singer: " + singer1.getAlbumsPublished());
		System.out.println("");
		
		//can also use the setAll() setter to set the values of each instance variable
		Singers singer2 = new Singers();
		singer2.setAll(2, "Madonna", "456 Hollywood Blvd", "August 16, 1958", 14);
		singer2.printSingers();
	}

}
