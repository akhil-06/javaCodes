package arraysCN;

import java.util.Scanner;

public class Sort01 {

	public static void Sort01(int [] arr) {
		int i=0,j=0;
		int n= arr.length;
		for(i=0;i<n;i++) {
			if(arr[i]==0) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
				System.out.println(arr[i]);
			}
		}
//		int n= arr.length;
//		int i=0,j=0;
//		while(i<j) {
//			for( i=0;i<n;i++) {
//				for(j=n-1;j>0;j--) {
//					if(arr[i]==1 || arr[j]==0) {
//						int temp = arr[i];
//						arr[i] = arr[j];
//						arr[j] = temp;
//					}
//				}
//			}
//			System.out.println(arr[i]);
//		}
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
		Sort01(arr);

	}

}
