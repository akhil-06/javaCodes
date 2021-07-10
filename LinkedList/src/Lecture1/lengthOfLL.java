package Lecture1;

import java.util.Scanner;

public class lengthOfLL {

	public static Node<Integer> takeInput(){
		Node<Integer> head = null, tail =null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();

		while(data != -1) {
			Node<Integer> newNode = new Node<Integer> (data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}else {
				tail.next = newNode;
				tail = tail.next;
			}
			data = s.nextInt();
		}
		return head;

	}
	
	public static int llLength(Node <Integer> head) {
		Node <Integer> temp = head;
		int length = 0;
		while(temp != null) {
			temp = temp.next;
			length++;
		}
		return length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node <Integer> head = takeInput();
		int length = llLength(head);
		System.out.println(length);
	}

}
