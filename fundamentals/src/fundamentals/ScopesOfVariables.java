package fundamentals;

public class ScopesOfVariables {

	public static void main(String[] args) {
	
		
		int i = 1;
		while(i <= 5) {
			int j = 10;
			System.out.println(j);
			i++;
		}
		System.out.println(i);
		// outside the scope so not calculated
		//System.out.println(j);
		
		
		
//		int a = 10;
//		a = 100;
//		
//		if(a >= 100) {
//			int b = 10;
//			System.out.println(b);
//		}else {
//			int b = 20;
//			System.out.println(b);
//		}
//		
//		//System.out.println(b);
//		System.out.println(a);
	}

}
