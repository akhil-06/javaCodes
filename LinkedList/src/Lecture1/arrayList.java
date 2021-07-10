package Lecture1;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dynamic arrays
		//generic in nature can be of any type (string ,student but of nom premitive type here)
		ArrayList<Integer> list1 = new ArrayList <>();
		System.out.println(list1.size());
		list1.add(10);
		list1.add(20);
		list1.add(30);
		// to get the index of list and indexing is same as the arrays
		System.out.println(list1.get(2));
		//another way to add element
		list1.add(2, 100);
		
		//to replace the value noy to add
		list1.set(1, 50);
		
		//to print the array list
		for(int i=0;i<list1.size();i++) {
			System.out.print(list1.get(i) + " ");
		}
		System.out.println();
		
		//to remove the elements
		list1.remove(0);
		
		for(int i=0;i<list1.size();i++) {
			System.out.print(list1.get(i) + " ");
		}
		
		//another way of for loop called as for each loop
//		for(int ele : list1) {
//			System.out.println(ele + " ");
//		}
		
	}

}
