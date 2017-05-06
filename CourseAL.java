package Project3;

import java.util.ArrayList;

public class CourseAL {

	// instance data variable
	private String courseName;
	private int max;
	// declare and initialize an array for rosterAL
	private ArrayList <String> roster = new ArrayList <String> () ;

	// constructor
	public CourseAL(String initialCourseName, int initialMax, ArrayList <String> initialRoster) {
		courseName = initialCourseName;
		max = initialMax;
		roster = initialRoster;
	}
	
	// getter 
	public String getCourseName() {
		return courseName;
	}
	public int getMax() {
		return max;
	}
		
	// setter
	public void setCourseName(String newCourseName) {
		courseName = newCourseName;
	}
	public void setmax(int newMax) {
		if(newMax > 0) {
			max = newMax;
		} else {
			System.out.println("The maximum students that can be enrolled in the course must be greater than 0.");
		}
	}

	// toString 
	public String toString() {
		return "Couse name: " + courseName + " (Student capacity: " + max + ")"; 
	}
	
	// course methods
	// addStudents
	public boolean addStudent(Student s) {
		boolean paid = s.getPaid();		
		int classMax = max;
		if (roster.size() < classMax && paid == true) {
			roster.add(s.getName() + " (" + s.getId() + ")");
			return true;
		} else if (paid != true) {
			System.out.println(s.getName() + " (" + s.getId() + ") cound not be added because s/he hasn't paid the tuition.");
			return false;
		} else {
			System.out.println("The class is full already.");
			System.out.println(s.getName() + " (" + s.getId() + ") cound not be added.");
			return false;
		}
	}
	
	// dropStudents
	public boolean dropStudent(Student s) {
		int index = -1;
		for (int i = 0; i < roster.size(); i ++) {
			if (roster.get(i).contains(s.getName())) {
				index = i;
			}
		}
		if (index >= 0) {
			roster.remove(index);
			return true;
		} else {
			System.out.println(s.getName() + " (" + s.getId() + ") is not on the roster.");
			return false;
		}
	}
	
	// printRoster
	public void printRoster() {
		int length = 0;
		for (int i = 0; i < roster.size(); i ++) {
			if (roster.get(i) != null) {
		    	length += 1;
		    }
		}
		if (length <= 0) {
			System.out.println("-- No students enrolled. --");
		} else {	
			System.out.println("Enrollment: " + length);
				for (int i = 0; i < roster.size(); i ++) {
				    if (roster.get(i) != null) {
				    	System.out.println(roster.get(i));
				    }
				}
		}
	}

}


