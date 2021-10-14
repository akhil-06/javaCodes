package classes_and_objects;

public class student {
	
	String name;
	int rollno;
	
	//constructor that is name is there then also we can make student
	public student(String n) {
		
		name = n;
	}
	
	// costumised constructor now for student name and rollno is necessary
	public student (String n, int rn) {
		
		name = n;
		rollno = rn;
	}
	
	
	public void setRollNo(int rn) {
		
		rollno = rn;
	}
	
	public int getRollNo() {
		
		return rollno;
	}
	
	// property or unctionality to avoid writing syso everytime
	
	public void print() {
		
		System.out.println(name + " : " + rollno);
	}
	
	
}


