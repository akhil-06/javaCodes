package Lecture1;

import java.util.Scanner;

public class insertNodeRecursively {
	
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
	
	public static Node<Integer> insertNodeR(Node<Integer> head,int data, int pos){
		Node<Integer> newNode = new Node<Integer> (data);
		if(pos == 0) {
			newNode.next = head;
			return newNode;
		}
		if(head == null) {
			return head;
		}
		
		Node<Integer> rCall = insertNodeR(head.next,data,pos-1);
		head.next = rCall;
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node <Integer> head = takeInput();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter data of node = ");
		int data  = s.nextInt();
		System.out.print("Enter position of node = ");
		int pos = s.nextInt();
		Node<Integer> newHead = insertNodeR(head,data,pos);
		printR(newHead);
	}

}
