package RecursionAndArrays;

public class checkSorted {

	public static boolean checkSorted2 (int arr[]) {
		if (arr.length <= 1) {
			return true;
		}
		if(arr[0] > arr[1]) {
			return false;
		}
		int smallarr[] = new int [arr.length - 1];
		for(int i =1; i < arr.length; i++) {
			smallarr[i - 1] = arr[i];
		}
		boolean smallans = checkSorted2(smallarr);
		return smallans;
	}

	//public static void main (String[] args) {
		//int input[] = {1,2   ,3};
		//System.out.println(checkSorted2(input));
//	}


// second approch in this array will remain same but start index will change

public static boolean checkSortedBetter (int input[], int startIndex) {
	if (startIndex >= input.length - 1 ) {
		return true;
	}
	if(input[startIndex] > input[startIndex + 1]) {
		return false;
	}

	boolean smallans = checkSortedBetter(input, startIndex + 1);
	return smallans;
}

public static void main (String[] args) {
	int input[] = {1,2,4,3};
	System.out.println(checkSortedBetter(input, 0));
}
}
