package Lecture1;

import java.util.Scanner;

public class nodeUse {

	public static void printLL(Node<Integer> head) {
		//dont loose your head, store in temp and move that
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
		//temp comes to head
		//temp = head
	}

	public static Node<Integer> takeInput(){
		Node <Integer> head = null  , tail=null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
//		System.out.println(data);
		while(data != -1) {
			Node<Integer> newNode1 = new Node<Integer> (data);

			if(head == null) {
				head = newNode1;
//				System.out.println(head);
				tail = newNode1;
//				System.out.println(tail);
			}else {
				//Node<Integer> temp = head;
				//				
				//while(temp.next != null) {
				//temp = temp.next;
				//}
				//temp.next = newNode1;
							tail.next = newNode1;
//							System.out.println(tail.next);
							tail = tail.next;
//							System.out.println(tail);// or  tail = newNode1;
			}
			data = s.nextInt();
//			System.out.println(data);
		}

		return head;
	}

	public static void main(String[] args) {
		//it is of generic type, write only non primitive here
		Node<Integer> node1 = new Node<Integer> (10);
		Node<Integer> node2 = new Node<Integer> (20);
		System.out.println(node1.data);
		System.out.println(node2.data);

		//combine these two LL
		node1.next = node2;
		System.out.println(node1.next);
		System.out.println(node2);

		//lets have seperate function for take input
		Node <Integer> head = takeInput();
		printLL(head);
	}

}
