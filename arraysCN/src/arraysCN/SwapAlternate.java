package arraysCN;

import java.util.Scanner;

public class SwapAlternate {
	
	public static void SwapAlternate(int[] arr) {
		int num=arr.length;
//		int temp;

		for(int i=0;i<(num-1);i+=2) {
			
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				System.out.print(arr[i] + " " + arr[i+1] + " ");
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
//		printArray(arr);
		SwapAlternate(arr);
	}

}
