package Recursion1;

import java.util.Scanner;

public class lastIndexOfNumber {
	
	private static int lastIndexNumber(int[] arr,int SI,int x) {
		if(arr.length==SI) {
			return -1;
		}
		
		int sa = lastIndexNumber(arr,SI+1,x);
		if(sa!=-1) {
			return sa;
		}
		
		if(arr[SI] == x) {
			return SI;
		}else{
			return -1;
		}
	}
	
	public static int lastIndexNumber(int[] arr,int num) {
		int si = 0;
		return lastIndexNumber(arr,si,num);
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
		System.out.println("Element to searched = ");
		int num = s.nextInt();
		int lastIndex = lastIndexNumber(arr,num);
		System.out.println(lastIndex);
	}

}
