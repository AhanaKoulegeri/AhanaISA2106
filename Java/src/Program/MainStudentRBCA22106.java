package Program;

public class MainStudentRBCA22106 {
	
	    public static void main(String[] args) {
	        // Creating instances of Student class
	    	StudentRBCA22106  student1 = new StudentRBCA22106 ();
	    	StudentRBCA22106  student2 = new StudentRBCA22106 ();
	    	StudentRBCA22106  student3 = new StudentRBCA22106 ();

	        // Setting information for student1
	        student1.setInfo("John", 20);

	        // Setting information for student2
	        student2.setInfo("Alice", 22, "123 Main St");

	        // Setting information for student3
	        student3.setInfo("Bob", 21, "456 Oak Ave");

	        // Printing information of all students
	        System.out.println("Information of Student 1:");
	        student1.printInfo();

	        System.out.println("Information of Student 2:");
	        student2.printInfo();

	        System.out.println("Information of Student 3:");
	        student3.printInfo();
	    }
	}

	   