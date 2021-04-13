package arraysCN;

import java.util.Scanner;

public class PairSUm {

	public static int PrintAllPairs(int[] arr, int x) {
		int n=arr.length;
		int pairSum = 0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if((arr[i] + arr[j]) == x) {
					pairSum = pairSum + 1;
				}
			}	
			
		}
		return pairSum;

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
		Scanner s = new Scanner(System.in);
		int[] arr = takeInput();
		int x = s.nextInt();
		//		printArray(arr);
		int sum = PrintAllPairs(arr,x);
		System.out.println(sum);
	}

}
