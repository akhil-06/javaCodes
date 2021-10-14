package classes_and_objects;

import java.util.Scanner;

public class studentUse {
	

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
	//	student s1 = new student("Ankush", 123);
		student s1 = new student("Ankush");
		s1.print();
		
		student s2 = new student("Manisha", 121);
		s2.print();
		
//		s1.name = "Ankush";
//		s1.setRollNo(223);
//		
//		s2.name = "Manisha";
//		s2.setRollNo(332);
		
//		System.out.println(s1.name);
//		System.out.println(s2.name);
//		System.out.println(s1.getRollNo());
//		System.out.println(s2.getRollNo());

	}

}
 