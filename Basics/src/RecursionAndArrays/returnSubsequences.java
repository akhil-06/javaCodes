package RecursionAndArrays;

public class returnSubsequences {

	public static String[] findSubsequences(String str) {

		if(str.length() == 0) {
			String ans[] = {" "};
			return ans;

		}
		String smallans[] = findSubsequences(str.substring(1));

		int k = 0;
		String ans[] = new String[2 * smallans.length];
		for(int i = 0; i < smallans.length; i++) {
			ans[i] = smallans[i];
			
		}

		for(int i = 0; i < smallans.length; i++) {
			ans[i + smallans.length] = str.charAt(0) + smallans[i];
			
		}
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "xyz";
		String ans[] = findSubsequences(str);
		for(int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

	}

}
