package HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class removeDuplicatesFromArray {

	public static void removeDuplicates(int []arr) {
		int n = arr.length;
		 HashMap<Integer, Boolean> mp = new HashMap<>();
		 
		 for(int i=0; i < n;i++) {
			 if(mp.get(arr[i]) == null) {
				 System.out.println(arr[i] + " ");
				 mp.put(arr[i], true);
			 }
		 }
	}
	
	public static int highFrequncy(int arr[]) {
		int n = arr.length;
		int count=0;
		HashMap<Integer, Integer> mp = new HashMap<>();
		
		for(int i : arr) {
			if(mp.containsKey(i)) {
				mp.put(i, mp.get(i) + 1);
			}else {
				mp.put(i, 1);
			}
		}
		
		int maxFreq = -1, ans = Integer.MIN_VALUE;
		for(int i:arr) {
			if(mp.get(i) > maxFreq) {
				maxFreq = mp.get(i);
				ans = i;
			}
		}
		return ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,1,4,2,2,3,3,1,1,6,7,5,4,2,2,2,8};
		removeDuplicates(a);
		int highFrequency = highFrequncy(a);
		System.out.println("high freq = " + highFrequency);
	}

}
