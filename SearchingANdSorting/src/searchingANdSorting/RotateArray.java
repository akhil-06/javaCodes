package searchingANdSorting;

import java.util.Scanner;

public class RotateArray {
	
	public static void RotateArray(int[] arr, int num) {
		for(int i=0;i<num;i++) {
			int temp = arr[0];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
	}

	public static void printArray(int arr[]){
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] arr = new int[num];
		for(int i=0;i<num;i++) {
			System.out.println("index" + i);
			arr[i]=s.nextInt();		
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeInput();
		Scanner s = new Scanner(System.in);
		System.out.print("By how much you want to rotate = ");
		int num = s.nextInt();
		RotateArray(arr,num);
//		System.out.println("Sorted array");
		printArray(arr);
	}

}
