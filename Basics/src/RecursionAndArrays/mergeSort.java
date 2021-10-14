package RecursionAndArrays;

public class mergeSort {

	public static void mergeSort(int input[], int SI, int EI) {
		if(SI >= EI) {
			return;
		}
		int mid = (SI + EI)/2;
		mergeSort(input, SI, mid);   //part 1
		mergeSort(input, mid + 1, EI);   //part 2
		merge(input, SI, EI);
	}
	public static void merge (int input[], int SI, int EI) {
		int mid = (SI + EI)/2;
		
		int ans[] = new int[EI - SI + 1];
		int i = SI;
		int j = mid + 1;
		int k = 0;
		
		while (i <= mid && j <= EI) {
			if(input[i] < input[j]) {
				ans[k] = input[i];
				i++;
				k++;
			}
			else {
				ans[k] = input[j];
				k++;
				j++;
			}
		}
		while(i <= mid) {
			ans[k] = input[i];
			i++;
			k++;
		}
		while (j <= EI) {
			ans[k] = input[j];
			k++;
			j++;
		}
		for (int index = 0; index < ans.length; index++) {
			input[SI + index] = ans[index];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,2,5,9,1};
		mergeSort(arr, 0, arr.length - 1);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
