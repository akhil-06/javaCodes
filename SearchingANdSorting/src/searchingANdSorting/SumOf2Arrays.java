package searchingANdSorting;

import java.util.Scanner;

public class SumOf2Arrays {

	public static int[] sumOfarrays(int[] arr1, int[] arr2) {
		int []result = new int[Math.max(arr1.length,arr2.length) + 1];
		int carry =0;
		int k= Math.max(arr1.length,arr2.length);
		for(int i=arr1.length-1; i >= 0 ; i--) {
			for(int j=arr2.length-1; j >= 0 ;j--) {
				int num = arr1[i] + arr2[j] + carry;
				//				int length = String.valueOf(num).length();
				//				System.out.println("length of number is " + length);
//				int num1 = num%10;
//				int num2 = num/10;
				result[k] = num%10;
				carry = num/10;
				k--;
			}
		}
		for(int i=arr1.length-1;i >= 0 ;i--){
			int num = arr1[i] + carry;
			result[k] = num%10;
			carry = num/10;
			k--;
		}
		for(int j=arr2.length-1;j >= 0 ;j--){
			int num = arr2[j] + carry;
			result[k] = num%10;
			carry = num/10;
			k--;
		}
		result[0] = carry;
		return result;
	}

	public static void printArray(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
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
		int arr1[] = takeInput();
		int []arr2 = takeInput();
		int[] ans = sumOfarrays(arr1,arr2);
		printArray(ans);
	}

}
