package Lecture1;

import java.util.ArrayList;

public class deleteDuplicatesArrayList {
	
	public static ArrayList<Integer> removeDulicates(int []arr){
		ArrayList<Integer> result = new ArrayList<>();
		// no matter we have to add 1st element in list
		result.add(arr[0]);
		
		//we check the array current element and previous one if they are not equal then push them in list
		//
		for(int i=1;i<arr.length;i++) {
			if(arr[i] != arr[i-1]) {
				result.add(arr[i]);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,10,20,20,20,20,30,30,30,30,40,40,40};
		ArrayList<Integer> result = removeDulicates(arr);
		
		for(int i=0;i<result.size();i++) {
			System.out.print(result.get(i) + " ");
		}
	}

}
