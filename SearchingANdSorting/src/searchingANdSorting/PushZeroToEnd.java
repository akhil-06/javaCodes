package searchingANdSorting;

import java.util.Scanner;

public class PushZeroToEnd {

	public static int[] PushZeroToEnd(int[] arr) {
		int n= arr.length;
		int k= 0;
		int i=0;
		int[] ans = new int[arr.length];
		for(i=0;i<n;i++) {
			if(arr[i] != 0) {
				ans[k] = arr[i];
				i++;
				k++;
			}
		}
		while(i<n) {
			ans[k] = arr[i];
			i++;
			k++;
		}
		return ans;
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
		int[] ans= PushZeroToEnd(arr);
		System.out.println("Sorted array");
		printArray(ans);
	}

}
