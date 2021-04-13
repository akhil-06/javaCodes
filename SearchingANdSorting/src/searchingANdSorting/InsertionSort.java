package searchingANdSorting;
import java.util.Scanner;
public class InsertionSort {
	
	public static void InsertionSort(int[] arr) {
		int temp,j;
		//we have taken i=0 as the sorted element
		for(int i=1;i<arr.length;i++) {
			temp=arr[i];
			j=i;
			while(j>0 && arr[j-1]>temp) {
				arr[j]= arr[j-1];
				j=j-1;
			}
			arr[j] = temp;
		}
	}
	
		public static void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
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
		InsertionSort(arr);
		System.out.println("Sorted array");
		printArray(arr);
	}
}
