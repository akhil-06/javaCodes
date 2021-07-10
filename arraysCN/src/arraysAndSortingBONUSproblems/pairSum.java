package arraysAndSortingBONUSproblems;

import java.util.Scanner;

public class pairSum {
	
	public static void paiSum(int[] arr, int num) {
		if(arr.length == 0) {
			return;
		}
		int pivot = findPivot(arr,0,arr.length-1);
		boolean ans = meetMiddle(arr,pivot,num);
		System.out.println(ans);
	}
	
	public static boolean meetMiddle(int[] arr,int pivot, int num) {
		int left = (pivot+1) % arr.length;
		int right = pivot % arr.length;
		
		while(true) {
			if(arr[left] + arr[right] < num) {
				left = (left + 1)% arr.length;
			}else if (arr[left] + arr[right] > num) {
				right = (right - 1 + arr.length) % arr.length;
			}else {
				return true;
			}
			
			
			if((left <= pivot && right <= pivot) || (left > pivot && right > pivot)) {
				if(left >= right) {
					break;
				}else {
					if(left <= right) {
						break;
					}
				}
			}
		}
		return false;
	}
	
	public static int findPivot(int[] arr, int start, int end) {
		if(start == end) {
			return start;
		}
		int mid = (start+end) / 2 ;
		int prev = (mid-1 + arr.length) % arr.length;
		int next = (mid+1) % arr.length;
		if(arr[mid] > arr[prev] && arr[mid] > arr[next]) {
			return mid;                        //pivot found
		}else if(arr[mid] < arr[start]) {
			return findPivot(arr,start,prev);  //pivot in 1st half
		}else {
			return findPivot(arr,next,end);    //pivot in 2nd half
		}
		//		return 0;
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
		Scanner s = new Scanner(System.in);
		System.out.print("Pair sum Element is = ");
		int num = s.nextInt();
		paiSum(arr,num);
//		System.out.print("Element Index At = ");
//		System.out.print(ans);
	}

}
