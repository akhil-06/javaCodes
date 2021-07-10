package Arrays;

import java.util.Scanner;

public class linearSearch {
	
	public static int search(int arr[], int val) {
		 for(int i=0; i < arr.length; i++){
		        if(val == arr[i]){
		            return i;
		        }   
		    }

		return -1;
		
	}
	
	private static void printArray(int[] arr) {
		//print array
		for(int i=0;i<arr.length;i++) {
			System.out.print (arr[i] + " ");
		}

	}

	private static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		//take input
		int []arr = new int[num];
		for(int i=0;i<arr.length;i++) {
			//System.out.print(arr[i]);
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) { 
		int arr[] = takeInput();
		Scanner s = new Scanner(System.in);
		int val = s.nextInt();
//		printArray(arr);
		int Search = search(arr, val);
		System.out.println(Search);
	}
		

	}


