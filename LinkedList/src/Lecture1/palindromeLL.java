package Lecture1;

import java.util.Scanner;

public class palindromeLL {

	public static Node<Integer> takeInput(){
		Node <Integer> head = null, tail =null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();

		while(data != -1) {
			Node <Integer> newNode = new Node<Integer> (data);

			if(head == null) {
				head = newNode;
				tail = newNode;
			}else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static Node<Integer> reverse(Node<Integer>head){
		//iterative Approach
		Node<Integer> prev = null;
	    while(head!=null){
	       Node<Integer> next = head.next;
	        head.next = prev;
	        prev = head;
	        head = next;
	    }
	    return prev;
		
		//recursive Approach
//		if(head == null || head.next == null) {
//			return head;
//		}
//		Node<Integer> reversedHead = reverse(head.next);
//		Node<Integer> temp = reversedHead;
//		while(temp.next != null) {
//			temp = temp.next;
//		}
//		temp.next = head;
//		head.next = null;
//		return reversedHead;
	}
	
	public static boolean checkPalindrome(Node<Integer>head) {
		if(head == null || head.next == null) {
			return true;
		}
		 Node<Integer> fast = head, slow = head;
	        while(fast!=null && fast.next!=null){
	            fast = fast.next.next;
	            slow = slow.next;
	        }
	        slow = reverse(slow);
	        fast = head;
	        while(slow!=null){
	            if(slow.data!=fast.data){
	                return false;
	            }
	            slow = slow.next;
	            fast = fast.next;
	        }
	        return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		Boolean ans = checkPalindrome(head);
		System.out.println(ans);
	}

}
