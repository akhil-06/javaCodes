package searchingANdSorting;

import java.util.Scanner;

public class SelectionSort {
	public static void SelectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min = arr[i];
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				//for finding the min element among j index
				if(arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			//swap element at minIndex with ith element
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
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
		SelectionSort(arr);
		System.out.println("Sorted array");
		printArray(arr);
	}
}
