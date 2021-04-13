package Recursion3;

import java.util.Scanner;

public class binarySearchRecursive {
	
	public static int binarySearch(int[] arr, int start,int end,int x) {
		if(start>end) {
			return -1;
		}
		int mid = (start+end)/2;
		if(arr[mid] == x) {
			return mid;
		}
		else if(arr[mid] > x) {
		return binarySearch(arr,start,mid-1,x);
		}else if(arr[mid] < x) {
		return binarySearch(arr,mid+1,end,x);
		}
		return mid;
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
		int lastIndex = binarySearch(arr,0,arr.length-1,num);
		System.out.println(lastIndex);
	}

}
