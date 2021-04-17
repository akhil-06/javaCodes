package Functions;

//public class passByValue {
//	
//	public static void increment(int n) {
//		n++;
//		System.out.println("increment" + n);
//	}
//
//	public static void main(String[] args) {
//		int n = 10;
//		increment(n);
//		System.out.println("main" + n);
//
//	}
//
//}

// updating by value

public class passByValue {
	
	public static int increment(int n) {
		n++;
		System.out.println("increment" + n);
		return n;
	}

	public static void main(String[] args) {
		int n = 10;
		n = increment(n);
		System.out.println("main" + n);

	}

}