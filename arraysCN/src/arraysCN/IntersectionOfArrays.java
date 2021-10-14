package arraysCN;

import java.util.Scanner;

public class IntersectionOfArrays {
	
	public static void IntersectionOfarrays(int [] arr, int [] arr1) {
		int n=arr.length;
		int n1=arr1.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n1;j++) {
				if(arr[i] == arr1[j]) {
					System.out.println(arr[i]);
					arr1[j]= Integer.MIN_VALUE;
					break;
				}
			}
		}
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
		int [] arr1 = takeInput();
		//		printArray(arr);
		IntersectionOfarrays(arr,arr1);

	}

}
