package Lecture1;

import java.util.Scanner;

public class midPointLL {

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
	
	public static Node<Integer> midPointLL(Node<Integer> head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		Node<Integer> data = midPointLL(head);
		System.out.println(data.data);
	}

}
