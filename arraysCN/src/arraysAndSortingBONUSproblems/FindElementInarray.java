package arraysAndSortingBONUSproblems;

import java.util.Arrays;
import java.util.Scanner;


//1. Take start=0 and end=array.length-1
//2. Loop till start <= end
//a. Calculate mid as (start+end)/2
//b. Check if the element at array[mid] is the greatest element or not. The greatest
//element will be greater than both prev (mid-1) element and next (mid+1) element.
//If the array[mid] is the greatest, then we have found the pivot element and its
//position. We must return this position.
//c. Compare array[mid] and array[start].
//i. if (array[mid]>arr[start]), then this means we have sorted array from start
//to mid index and the greatest element lies in the range [mid+1, end],
//hence, we will update start by mid+1
//ii. Otherwise, this means that pivot element lies in the first half and hence,
//we will update end by mid-1.
//3. After we have found the pivot element, we now have two ranges of sorted arrays: [0 to
//pivot position] and [pivot position + 1 to array.length-1].
//4. We will first search the given number in first half (0 to pivot position) and if it is not found
//in the first half, then we will search it in second half (pivot position + 1 to array.length-1).
//5. If the given number is not found in the second half as well, then we return -1.
 
public class FindElementInarray {

	public static int findElement(int[] arr, int num) {
		if(arr.length == 0) {
			return -1;
		}
		int pivot = findPivot(arr,0,arr.length-1);

		int firstHalf = Arrays.binarySearch(arr,0,pivot+1, num);
		if(firstHalf>=0) {
			return firstHalf;
		}else {
			int secondHalf = Arrays.binarySearch(arr,pivot+1,arr.length, num);
			if(secondHalf >= 0) {
				return secondHalf;
			}else {
				return -1;
			}

		}
	}

	public static int findPivot(int[] arr, int start, int end) {
		if(start == end) {
			return start;
		}
		int mid = (start+end) / 2 ;
		int prev = (mid-1 + arr.length) % arr.length;
		int next = (mid+1) % arr.length;

		if(arr[mid] > arr[prev] && arr[mid] > arr[next]) {
			return mid;
		}else if(arr[mid] < arr[start]) {
			return findPivot(arr,start,prev);
		}else {
			return findPivot(arr,next,end);
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
		//		array is sorted and rotated
		int[] arr = takeInput();
		Scanner s = new Scanner(System.in);
		System.out.print("Element to be searched = ");
		int num = s.nextInt();
		int ans = findElement(arr,num);
		System.out.print("Element Index At = ");
		System.out.print(ans);
	}

}


