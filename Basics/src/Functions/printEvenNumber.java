package Functions;

public class printEvenNumber {

	public static void printNum(int start, int end) {
		
		if(start % 2 != 0)
			start++;
		for (int i = start; i<=end; i+=2) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {

		printNum(3 , 50);


	}

}
