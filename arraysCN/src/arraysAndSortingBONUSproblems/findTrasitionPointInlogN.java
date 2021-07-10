package arraysAndSortingBONUSproblems;

import java.util.Scanner;

public class findTrasitionPointInlogN {

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
	
	public static int findTraitionPoint(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		int mid = (start+end)/2;
		while(start<=end) {
			if(arr[mid] == 0) {
				start = mid+1;
			}else if(arr[mid] == 1) {
				if(arr[mid-1] == 0) {
					return mid;
				}
			}else {
				end = mid-1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = takeInput();
		int ans = findTraitionPoint(arr);
		System.out.println(ans);
	}

}
