package arraysAndSortingBONUSproblems;

import java.util.Arrays;
import java.util.Scanner;

//1. The question wants you to distribute m chocolates boxes out of n chocolate boxes, to m
//students. You have to choose m chocolate boxes out of n, such that the difference
//between the highest and lowest number of chocolates in those m boxes is minimum.
//2. To solve this question, you should sort the array, representing the number of chocolates
//in ith box, in increasing order of number of chocolates in ith box.
//3. After sorting, you should traverse the subarrays of size m. For each subarray, you
//should check the difference between the highest and lowest number of chocolates in a
//box.
//4. You choose the subarray or window with minimum difference in the highest and lowest
//number of chocolates in a box

public class distributionProblem {

	public static void distributionProblem(int[] arr, int m) {
		Arrays.sort(arr);
		//		System.out.print(arr);
		//		int len = arr.length;
		int i=0;
		int j=i+m-1;
		int mindiff = Integer.MAX_VALUE;
		while(j<arr.length) {
			int cdiff = arr[j] - arr[i];
			if(cdiff < mindiff) {
				mindiff = cdiff;
			}
			i++;
			j++;
		}
		
		System.out.println("Ans is = " + mindiff);
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
		//		printArray(arr);
		Scanner s = new Scanner(System.in);
		System.out.print("Enter num = ");
		int num = s.nextInt();
		distributionProblem(arr,num);
		String str = "abc";
		String str2= "abc";
		System.out.println(str.equals(str2));
	}

}
