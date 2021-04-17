package Recursion3;

import java.util.Scanner;

public class printSubsetsSumK {

	public static void printSubsetsSumKHelpr(int[] arr,int SI, int k,int[] outputSofar) {
		if(arr.length == SI) {
			if(k == 0) {
				for(int i=0;i<outputSofar.length;i++) {
					System.out.print(outputSofar[i] + " ");
				}
				System.out.println();
				return;
			}else {
				return;
			}
		}

		//when 1st element not included
		printSubsetsSumKHelpr(arr,SI+1,k,outputSofar);
		
		
		//when 1st element is included
		int newoutput[] = new int[outputSofar.length+1];
		int i=0;
		for(;i<outputSofar.length;i++) {
			newoutput[i] = outputSofar[i];
		}
		newoutput[i] = arr[SI];
		printSubsetsSumKHelpr(arr,SI+1,k-arr[SI],newoutput);

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

	public static void printSubsetsSumK(int []arr, int k) {
		int outputSofar[] = new int[0];
		printSubsetsSumKHelpr(arr,0,k,outputSofar);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = takeInput();
		Scanner s = new Scanner(System.in);
		System.out.print("enter K =  ");
		int k = s.nextInt();
		printSubsetsSumK(arr,k);
	}

}
