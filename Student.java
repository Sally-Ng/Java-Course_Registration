// Group memebers: Na (Vicky) Li, Man (Sally) Ng

package Project3;

public class Student {

	// instance data variable
	private String name;
	private String id;
	private boolean paid;
	
	// constructor
	public Student(String initialName, String initialId, boolean initialPaid) {
		name = initialName;
		id = initialId;
		paid = initialPaid;
	}
	
	// getter 
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public boolean getPaid() {
		return paid;
	}
	
	// setter
	public void setName(String newName) {
		name = newName;
	}
	public void setId(String newId) {
		id = newId;
	}
	public void setPaid(boolean newPaid) {
		paid = newPaid;
	}
	
	// toString 
	public String toString() {
		return "Name: " + name + "\n\tID: " + id + "\n\tPaid: " + paid; 
	}
}
