package twoDarray;

public class MoreOn2Darrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [][] arr = new int[3][4];
//		System.out.println(arr[0][0]);
//		
		int [][]arr1 = new int[4][];
//		System.out.println(arr1);
//		
//		for(int i=0;i<arr1.length;i++) {
//			System.out.println(arr1[i]);
//		}
//		
//		System.out.println(arr1[0][0]);
//		
		
//		for(int i=0;i<arr1.length;i++) {
//			arr1[i] = new int[5];
//		}
		
		
		
		
		
		//JAGGED ARRAYS
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = new int[i+2];
		}
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}

}
