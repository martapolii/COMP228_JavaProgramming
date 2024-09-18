package student;

public class StudentProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create Object
		Student s1 = new Student(); 
		s1.printMarks();
		
		Student s2 = new Student();
		s2.printMarks(); 
		
		Student s3 = new Student(100, "John", 90.5, 70.8, 99.9);
		s3.printMarks();
		
		Student s4 = new Student(101, "Dylan", 80.0,75,100);
		s4.printMarks(); 
		
		s1.calculateAvg();
		s2.calculateAvg();
		s3.calculateAvg();
		s4.calculateAvg();
		
		s1.Display();
		s2.Display();
		s3.Display();
		s4.Display();
	}

}
