package fundamentalsa;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 2;
		
		//increment decrement operator
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(--b);
		System.out.println(b--);
		
		//bitwise
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~b);   //NOT operator
		System.out.println(a<<2);
		System.out.println(a>>3);
		
//		assigment operator
		System.out.println(a>=b);
		System.out.println(a^=1);
		System.out.println(a);

	}

}
