package arraysAndSortingBONUSproblems;

import java.util.Scanner;

public class identicalArrayInminSwaps {

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
	
	public static void swap(int []arr,int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static int minSwaps(int[] arr1, int []arr2) {
		int count = 0;
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				int j=i;
				while(arr2[j]!=arr1[i]) {
					j++;
					if(j>arr2.length) {
						return 0;
					}
				}
				swap(arr2,i,j);
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = takeInput();
		System.out.println("2nd Array elements ");
		int[] arr2 = takeInput();
		int ans = minSwaps(arr1,arr2);
		System.out.println(ans);
	}

}
