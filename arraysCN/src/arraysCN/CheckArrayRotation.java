package arraysCN;

import java.util.Scanner;

public class CheckArrayRotation {
	
	public static int arrayRotationStart(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > arr[i+1]) {
				return (i+1);
			}
		}
		return 0;
	}
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int []arr = new int[num];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the " + i + "th element of array = ");
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = takeInput();
		int index  = arrayRotationStart(arr);
		System.out.println(index);
	}

}
