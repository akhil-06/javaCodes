  package Arrays;

public class selectionSort {

	public static void selectionsort(int input[]) {

		for (int i = 0; i < input.length - 1; i++) { // 0 to length -2
			int min = input[i];
			int minIndex = i;
			for(int j = i + 1; j < input.length; j++) {
				if(input[j] < min) {
					min = input[j];
					minIndex = j;
				}
			}
			if(minIndex != i) {
				input[minIndex] = input[i];
				input[i] = min;
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {2, 6, 9, 1, 5};
		selectionsort(input);
		for(int i = 0; i < input.length; i++) {
		System.out.println(input[i] + " ");
	}

	}
}
