package arraysAndSortingBONUSproblems;

import java.util.Arrays;
import java.util.Scanner;

public class successorProblem {


	//code for converting number to array
	public static int[] intToArray(int num) {
		int j = 0;
		int len = Integer.toString(num).length(); 
		int[] arr = new int[len]; 
		while(num!=0) 
		{ 
			arr[len-j-1] = num%10; 
			num=num/10; 
			j++; 
		} 
		return arr;
	}

	//code for converting array to int num
	public static int arrayToInt(int []arr) {
		int n=0;
		for(int i=0;i<arr.length;i++) {
			n = n*10 + arr[i];
		}
		return n;

	}

	public static void successorProblem(int[] arr) {
		int length = arr.length;
		if(length == 1) {
			return;
		}
		int i = length-2;
		while(i>=0) {
			if(arr[i] < arr[i+1]) {
				break;
			}
			i--;
		}

		if(i!=-1) {
			int k = i+1;
			for(int j=i+1;j<length;j++) {
				if(arr[j] > arr[i] && arr[j] < arr[k]) {
					k = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[k];
			arr[k] = temp;
		}
		Arrays.sort(arr,i+1,length);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int arr[] = intToArray(num);
		successorProblem(arr);
		int ans = arrayToInt(arr);
		System.out.println(ans);
	}

}
