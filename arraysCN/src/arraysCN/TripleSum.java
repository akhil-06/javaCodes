package arraysCN;

import java.util.Scanner;

public class TripleSum {
	
	public static int triplePair(int[] arr, int x) {
		int n = arr.length;
		int tripleSum = 0;
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n;j++) {
				for(int z=j+1;z<n;z++) {
					if((arr[i]+arr[j]+arr[z]) == x) {
						tripleSum = tripleSum + 1;
					}
				}
			}
		}
		return tripleSum;
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
		int sum = triplePair(arr,x);
		System.out.println(sum);
	}

}
