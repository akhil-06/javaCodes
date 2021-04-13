package arraysCN;

import java.util.Scanner;

public class FindUnique {

//	public static void FindUnique(int[] arr) {
//		int n = arr.length;
//		for(int i=0;i<n;i++) {
//			int j;
//			for(j=0;j<n;j++) {
//				if(i != j) {
//					if(arr[i] == arr[j]) {
//						break;
//					}
//				}
//
//			}
//			if(j==n) {
//				System.out.println(arr[i]);
//			}
//		}
//	}
	
	
//	2nd ,method to do find unique
	public static int FindUnique(int[] arr) {
		int ans=arr[0];
		for(int i=1;i<(arr.length);i++) {
			ans = ans ^ arr[i];
		}
		return ans;
		
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
//		FindUnique(arr);
		System.out.println(FindUnique(arr));
	}

}
