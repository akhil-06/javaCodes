package Lecture1;

import java.util.Scanner;

public class lengthOfLLRecursive {
	
	public static Node<Integer> takeInput(){
		Node<Integer> head = null,tail=null;
		Scanner s = new Scanner(System.in);
		int data  = s.nextInt();
		
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			
			if(head == null) {
				head = newNode;
				tail= newNode;
			}else {
				tail.next = newNode;
				tail = tail.next;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static int lengthOfllRecursive(Node<Integer> head) {
		if(head == null) {
			return 0;
		}
		return 1+lengthOfllRecursive(head.next);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		int length = lengthOfllRecursive(head);
		System.out.println(length);
	}

}
