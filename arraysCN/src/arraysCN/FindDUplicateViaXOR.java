package arraysCN;

import java.util.Scanner;

public class FindDUplicateViaXOR {
	
	public static int FindDuplicate(int [] arr) {
		int n= arr.length;
		int ans = 0;
		for(int i=0;i<n;i++) {
			ans = ans ^ arr[i];
		}
			for(int i=0;i<=n-2;i++) {
				ans=ans ^ i;
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
		System.out.println(FindDuplicate(arr));

	}

}
