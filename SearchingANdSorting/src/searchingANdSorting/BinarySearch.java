package searchingANdSorting;

import java.util.Scanner;

public class BinarySearch {
	
	public static int BinarySearch(int[] arr, int element) {
		int start = 0;
		int end = arr.length-1;
		int mid = 0;
		while(start<=end) {
			mid = (start+end)/2;
			if(arr[mid] > element) {
				end = mid-1;
			}else if(arr[mid] < element) {
				start = mid+1;
			}else {
				return mid;
			}
		}
		return -1;
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
		System.out.println("enter element to be searched ");
		int element = s.nextInt();
		int[] arr = takeInput();
		int index = BinarySearch(arr,element);
		System.out.println(index);
	}

} 
