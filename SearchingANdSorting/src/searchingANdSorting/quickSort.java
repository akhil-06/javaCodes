package searchingANdSorting;

import java.util.Scanner;

public class quickSort {
	
	public static int partition(int[] arr, int si, int ei) {
		int pivot = arr[si];
		int countSmaller = 0;
		for(int i=si + 1;i<=ei;i++) {
			if(arr[i] <= pivot) {
				countSmaller++;
			}
		}
		int pivotIndex = countSmaller + si;
		arr[si] = arr[pivotIndex];
		arr[pivotIndex] = pivot;
		
		int i = si;
		int j = ei;
		while(i < pivotIndex && j > pivotIndex) {
			if(arr[i] <= pivot) {
				i++;
			}else if(arr[j] > pivot) {
				j--;
			}else {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		return pivotIndex;
	}

	public static void quickSort(int []arr, int si,int ei) {
		if(si>=ei) {
			return;
		}
		int p = partition(arr,si,ei);
		quickSort(arr,si,p-1);
		quickSort(arr,p+1,ei);
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
		int arr[]  = takeInput();
		//		int si = 0;
		//		int ei = arr.length-1;
		quickSort(arr,0,arr.length-1);
		System.out.println("after quick sort array is ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
