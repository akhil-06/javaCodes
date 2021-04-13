package searchingANdSorting;

import java.util.Scanner;

public class MergeTwoSortedArray {
	public static int[] MergeTwoSortedArray(int[] arr1, int[] arr2) {
		int[] ans = new int[arr1.length + arr2.length];
		int k=0;
		int i=0;
		int j=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				ans[k] = arr1[i];
				i++;
				k++;
			}else {
				ans[k] = arr2[j];
				j++;
			}
		}
		while(i<arr1.length) {
			ans[k] = arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		return ans;
	}
	
	public static void printArray(int arr[]){
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
//		System.out.println();
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
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		int[] ans = MergeTwoSortedArray(arr1,arr2);
		System.out.println("After Merging Two Sorted array");
		printArray(ans);
		
	}

}
