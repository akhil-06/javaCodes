package Recursion1;

import java.util.Scanner;

public class checkNumberInArray {
	
	private static int checkNumber(int[] arr,int SI,int x) {
		if(SI == arr.length) {
			return 0;
		}
		if(arr[SI] == x) {
			return arr[SI];
		}
		int sa = checkNumber(arr, SI+1, x);
		return sa;
	}
	
	public static int checkNumber(int[] arr,int num) {
		int si = 0;
		return checkNumber(arr,si,num);
	}
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int []arr = new int[num];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the " + i + "th element of array = ");
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = takeInput();
		Scanner s = new Scanner(System.in);
		System.out.print("number to find out = ");
		int num = s.nextInt();
		int index = checkNumber(arr,num);
		System.out.println(index);
	}

}
