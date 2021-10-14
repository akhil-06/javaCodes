package RecursionAndArrays;

public class removeX {

	public static String removeX(String str) {
		if(str.length() == 0) {
			return str;
	}
	String ans = "";
	
	if(str.charAt(0) != 'x') {
		ans = ans + str.charAt(0);
	}
	String smallans = removeX(str.substring(1));
	return ans + smallans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "baxx";
		System.out.println(removeX(str));

	}

}
