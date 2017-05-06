package Project3;

public class CourseDriver {

	public static void main(String[] args) {
		// creates six students
		Student student1 = new Student("Sheldon Cooper", "S10001", true);
		Student student2 = new Student("Leonard Hofstadter", "S10002", true);
		Student student3 = new Student("Penny Hofstadter", "S10003", true);
		Student student4 = new Student("Howard Wolowitz", "S10004", true);
		Student student5 = new Student("Rajesh Koothrappali", "S10005", true);
		Student student6 = new Student("Bernadette Rostenkowski-Wolowitz", "S10006", true);
		
		// creates a course that can hold five students 
		Course java = new Course("Java", 5, new String[5]);
		
		// prints the course
		System.out.println("// prints the course");
		System.out.println(java);
		System.out.println();
		
		// print the roster
		System.out.println("// prints the roster");
		java.printRoster();
		System.out.println();
		
		// adds the first five students to the course
		java.addStudent(student1);
		java.addStudent(student2);
		java.addStudent(student3);
		java.addStudent(student4);
		java.addStudent(student5);
		
		// tries to add the sixth student and prints a message if the add fails
		System.out.println("// tries to add the another student when the class is full");
		java.addStudent(student6);
		System.out.println();
		
		// prints the roster
		System.out.println("// prints the roster");
		java.printRoster();
		System.out.println();
		
		// drops the third student from the course
		java.dropStudent(student3);
		
		// prints the roster
		System.out.println("// prints the roster");
		java.printRoster();
		System.out.println();
		
		// tries again to add the sixth student to the course
		java.addStudent(student6);
		
		// prints the roster
		System.out.println("// prints the roster");
		java.printRoster();
		
	}

}
