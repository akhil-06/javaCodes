package Lecture1;

import java.util.Scanner;

public class evenAfterOddLL {
	
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

	public static Node<Integer> evenAfterOdd(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> oddHead = null, oddTail = null, evenHead = null, evenTail = null, temp = head;
		while(temp != null) {
			if(temp.data % 2 != 0) {
				if(oddHead == null) {
					oddHead = temp;
					oddTail = temp;
				}else {
					oddTail.next = temp;
					oddTail = oddTail.next;
				}
			}else {
				if(evenHead == null) {
					evenHead = temp;
					evenTail = temp;
				}else {
					evenTail.next = temp;
					evenTail = evenTail.next;
				}
			}
			temp = temp.next;
		}
		
		//one way to do it
//		if(evenHead != null) {
//			evenTail.next = null;
//		}
//		if(oddHead == null) {
//			return evenHead;
//		}else {
//			oddTail.next = evenHead;
//		}
	
		if(evenHead== null) {
			return oddHead;
		}
		if(oddHead == null) {
			return evenHead;
		}
		
		evenTail.next = null;
		oddTail.next = evenHead;
		return oddHead;
	}
	
	public static void printLL(Node<Integer>head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		Node<Integer> result = evenAfterOdd(head);
		printLL(result);
	}

}
