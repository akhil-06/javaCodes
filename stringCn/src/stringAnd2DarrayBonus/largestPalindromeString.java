package stringAnd2DarrayBonus;

import java.util.Scanner;

public class largestPalindromeString {

//	A string is said to be palindrome if the reverse of the string is same as that of the given string.
//	Then to make this string largest palindrome, we can traverse the string from both sides that is
//	from the start(s) and from the end(e), by using two pointers and check whether the digits at “s”
//	and “e” are equal or not; if they are equal then we will move to the next digits from start as well
//	as from end as they are satisfying the condition of a palindrome string, but if they are not equal
//	then you have to make them equal by replacing one of those digits. Now we have to make the
//	largest possible string then replace it with the maximum of those characters. As we have changed
//	a digit, so we have to decrement the value of K by 1.
//	We will stop traversing the string when string finishes i.e, both start and end pointers cross each
//	other. Now after stopping if the value of K is negative, this means we have replaced more digits
//	than the given value of K, then it is not possible to make string palindrome using K changes, but
//	if the value of K is positive, then we can further maximize the string by traversing the string once
//	again from left and right and replacing both the digits with 9. Now, if none of them was changed
//	in the previous traversal then we will decrement the value of K by 2, but if one of them was
//	changed in the previous traversal, then we will decrement the value of K by 1.
//	Now, in the end, if the value of K remains 1 and the length of the string is odd then we will
//	replace the middle character by 9, to maximize the string.
	

	public static void largestPalindromeString(String str, int k) {
		char[] newString = str.toCharArray();
		int start = 0;
		int end = str.length()-1;
		int count= 0;
		while(start < end) {
			if(str.charAt(start) != str.charAt(end)) {
				char max;
				if(str.charAt(start) > str.charAt(end)) {
					max = str.charAt(start);
				}else {
					max = str.charAt(end);
				}
				newString[start] = newString[end] = max;
				k--;
			}
			start++;
			end--;
		}

		if(k < 0) {
			System.out.println("Not possible to make palindrome");
		}
		start =0;
		end = str.length()-1;
		while(start<=end) {
			if(start==end) {
				if(k>0) {
					newString[start] = '9';
				}
			}
			if(newString[start] < '9') {
				if(k>=2 && str.charAt(start) != newString[start] && newString[end] != str.charAt(end)) {
					newString[end] = newString[start] = '9';
					k = k-2;
				}else if(k >= 1 && ((newString[start]!= str.charAt(start)) || (newString[end] != str.charAt(end)))) {
					//newString.length / 2 != 0
					newString[start] = newString[end] = '9';
					k--;
				}
			}
			start++;
			end--;
		}
		System.out.println(newString);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int k =s.nextInt();
		largestPalindromeString(str,k);
	}

}
