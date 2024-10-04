/* COMP228 Section 403
 * Marta Polishchuk
 * 301432299
 * Lab01
 */

package exercise1;

public class Singers {
	//5 instance variables (a.k.a. attributes, must be private)
	private int id;
	private String name;
	private String address;
	private String dateOfBirth;
	private int albumsPublished; 
	
	//Constructors - must be public

	public Singers() {} // no arguments
	
	public Singers(int id) {
		this.id = id;
	}
	
	public Singers(int id, String name) { // 2 arguments
		this.id = id;
		this.name = name;
	}
	
	public Singers(int id, String name, String address) { // 3 arguments
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public Singers(int id, String name, String address, String dateOfBirth) { // 4 arguments
		this.id = id;
		this.name = name;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
	}
	
	public Singers(int id, String name, String address, String dateOfBirth, int albumsPublished) { // 5 arguments
		this.id = id;
		this.name = name;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.albumsPublished = albumsPublished;
	}
	
	
	// Getters and Setters for individual instance variables
	
		// id
	public int getId() { //getter allows us to retrieve the value of a private variable
		return id;
	}
	public void setId(int id) { // setter allows us to set the value of a private variable 
		this.id = id;
	}
	
		// name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
		// address
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
		// dateOfBirth
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
		//albumsPublished
	public int getAlbumsPublished() {
		return albumsPublished;
	}
	public void setAlbumsPublished(int albumsPublished) {
		this.albumsPublished = albumsPublished;
	}
	
	// Setter for all instance variables
	public void setAll(int id, String name, String address, String dateOfBirth, int albumsPublished) { //can use this method to set all values at once 
		this.id = id;
		this.name = name;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.albumsPublished = albumsPublished;
	}
	
	// a method to print the properties of Singers objects in a user-friendly fashion:
	public void printSingers() {
		System.out.println("Singers ID: " + id);
		System.out.println("Singers Name: " + name);
		System.out.println("Singers Address: " + address);
		System.out.println("Singers Date of Birth : " + dateOfBirth);
		System.out.println("Albums Published by Singer: " + albumsPublished);
		System.out.println("");
	}
	
}
