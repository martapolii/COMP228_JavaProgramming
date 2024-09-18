package objectsAndClasses;

public class ReceptionistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// this is default constructor - will be deleted if you overload it
		Receptionist ob1 = new Receptionist();
		//ob1.ID = 120;
		
		// this is an overloaded constructor (default is deleted)
		// making new objects with overloaded constructor
		Receptionist ob2 =  new Receptionist(101, "Robert","00232334");
		Receptionist ob3 = new Receptionist(103, "Jane", "5988851100");
	}

}
