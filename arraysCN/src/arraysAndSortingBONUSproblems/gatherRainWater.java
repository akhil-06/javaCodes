package arraysAndSortingBONUSproblems;

import java.util.Scanner;

//1. With the help of a tower of height h, we can store water only when there are few towers
//with heights less than h and a supporting tower of height greater than or equal to h.
//2. Since, we have established that we need a supporting tower of height greater than or
//equal to height h, therefore, we will need two traversals. First traversal will be left to right,
//from the 0th index to index of tower of maximum height. We will traverse till tower of
//maximum height because there is no supporting tower for tower with maximum height, in
//left to right direction.
//Second traversal will be from rightmost index to left, from array.length-1 to index of tower
//of maximum height. We will traverse till tower of maximum height because there is no
//supporting tower for tower with maximum height, in right to left direction.
//3. We will sum up water collected by each column to get the total collected rain water


public class gatherRainWater {
	
	public static void gatherRainWater(int[] arr) {
//		int ans = 0;
		int maxPeak = Integer.MIN_VALUE;
		int maxPeakIndx = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > maxPeak) {
				maxPeak = arr[i];
				maxPeakIndx = i;
			}
		}
		
//		left to right
//		int left = 0;
		int sumArea = 0;
		int peakSofar = Integer.MIN_VALUE;
//		int subMergedArea = 0;
//		int countSubmerged =0;
		for(int i=0;i<=maxPeakIndx;i++) {
			if(arr[i] >= peakSofar) {
//				sumArea += peakSofar * countSubmerged - subMergedArea; 
				peakSofar = arr[i];
//				subMergedArea = 0;
//				countSubmerged =0;
			}else {
//				countSubmerged++;
//				subMergedArea += arr[i] * 1;
				sumArea += (peakSofar-arr[i]);
			}
		}
		
//		right to left
		peakSofar = Integer.MIN_VALUE;
//		subMergedArea = 0;
//		countSubmerged =0;
		for(int i=arr.length-1;i>=maxPeakIndx;i--) {
			if(arr[i] >= peakSofar) {
//				sumArea += peakSofar * countSubmerged - subMergedArea; 
				peakSofar = arr[i];
//				subMergedArea = 0;
//				countSubmerged =0;
			}else {
//				countSubmerged++;
//				subMergedArea += arr[i] * 1;
				sumArea += (peakSofar-arr[i]);
			}
		}   
		
		System.out.println(sumArea);
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
		gatherRainWater(arr);

	}

}
