package Lecture1;

import java.util.Scanner;

public class deleteRecursively {

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

	public static Node<Integer> deleteNodeR(Node<Integer> head, int pos){
		if(pos == 0) {
			return head.next;
		}
		
		if(head == null) {
			return head;
		}

		Node<Integer> rCall = deleteNodeR(head.next , pos-1);
		head.next = rCall;
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node <Integer> head = takeInput();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter position of node = ");
		int pos = s.nextInt();
		Node<Integer> newHead = deleteNodeR(head,pos);
		printR(newHead);
	}

}
