package Lecture1;

import java.util.Scanner;

public class printRecursive {
	
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
	
	public static void printLLRecursive(Node<Integer> head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printLLRecursive(head.next);
	}
	
	
	public static void printLLFromLast(Node<Integer> head) {
		if(head == null) {
			return;
		}
		printLLFromLast(head.next);
		System.out.print(head.data + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		printLLRecursive(head);
		System.out.println();
		printLLFromLast(head);
	}

}
