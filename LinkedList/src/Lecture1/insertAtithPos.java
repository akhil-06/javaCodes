package Lecture1;

import java.util.Scanner;

public class insertAtithPos {

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

	public static void printLL(Node <Integer> head) {
		Node <Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public static Node<Integer> insertAtPos(Node <Integer> head,int data, int pos){
		Node<Integer> nodeToInsert = new Node<Integer> (data);
		if(pos == 0) {
			nodeToInsert.next = head;
			return nodeToInsert;
		}
		Node<Integer> temp = head;
		int count = 0;
		while(count < pos-1) {
			temp = temp.next;
			count++;
		}
		nodeToInsert.next = temp.next;
		temp.next = nodeToInsert;
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter data of node = ");
		int data  = s.nextInt();
		System.out.print("Enter position of node = ");
		int pos = s.nextInt();
		Node <Integer> newHead = insertAtPos(head,data,pos);
		System.out.println();
		System.out.println("after insert we get  ");
		printLL(newHead);
	}

}
