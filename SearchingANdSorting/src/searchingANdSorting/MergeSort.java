package searchingANdSorting;

import java.util.Scanner;

public class MergeSort {

	//merging arrays
	public static void merge(int []arr,int si, int ei) {
		int mid = (si+ei)/2;
		int[] ans = new int[ei-si+1];
		int k=0;
		int i=si;
		int j=mid+1;
		while(i<=mid && j<= ei) {
			if(arr[i] < arr[j]) {
				ans[k] = arr[i];
				i++;
				k++;
			}else {
				ans[k] = arr[j];
				j++;
				k++;
			}
		}
		while(i<=mid) {
			ans[k] = arr[i];
			i++;
			k++;
		}
		while(j<=ei) {
			ans[k] = arr[j];
			j++;
			k++;
		}
		
		//copying the ans array in arr
		int m = 0;
		for(int index=si;index<=ei;index++) {
			arr[index] = ans[m];
			m++;
		}
	}

	public static void Mergesort(int []arr,int si,int ei) {
		if(si>=ei) {
			return;
		}
		int mid = (si+ei)/2;
		Mergesort(arr,si,mid);
		Mergesort(arr,mid+1,ei);
		//merge the two sorted arrays
		merge(arr,si,ei);
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
		Mergesort(arr,0,arr.length-1);
		System.out.println("after merge sort array is ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
