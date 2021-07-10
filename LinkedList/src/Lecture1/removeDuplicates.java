package Lecture1;

import java.util.Scanner;

public class removeDuplicates {

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

	public static void printR(Node<Integer> head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printR(head.next);
	}
	
	public static Node<Integer> removeDuplicates(Node<Integer> head){
		//iterative approach
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> currHead = head;
		while(currHead.next != null) {
			if(currHead.data.equals(currHead.next.data)) {
				currHead.next = currHead.next.next;
			}else {
				currHead = currHead.next;
			}
		}
		return head;
		
//		recursive approach
//		if(head == null || head.next == null) {
//			return head;
//		}
//		Node<Integer> removedDuplicateHead = removeDuplicates(head.next);
//		if(head.data == removedDuplicateHead.data) {
//			head.next = removedDuplicateHead.next;
//			return head;
//		}
//		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node <Integer> head = takeInput();
		Node<Integer> newHead = removeDuplicates(head);
		printR(newHead);
	}

}
