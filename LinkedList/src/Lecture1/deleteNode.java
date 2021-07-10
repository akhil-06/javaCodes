package Lecture1;

import java.util.Scanner;

public class deleteNode {

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
	
	public static void printLL(Node <Integer> newHead) {
		Node <Integer> temp = newHead;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public static Node<Integer> deleteNode(Node<Integer> head, int pos){
		if(head == null) {
			return head;
		}
		if(pos == 0) {
			return head.next;
		}
		
		int count = 0;
		Node <Integer> currHead = head;
		int currentPos = 0;
		while(currHead != null && count < (pos-1)) {
			currHead = currHead.next;
			count++;
		}
		if(currHead == null || currHead.next == null) {
			return head;
		}
		currHead.next = currHead.next.next;
		return head;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		Scanner s = new Scanner(System.in);
		int pos  = s.nextInt();
		Node <Integer> newHead = deleteNode(head,pos);
		printLL(newHead);
	}

}
