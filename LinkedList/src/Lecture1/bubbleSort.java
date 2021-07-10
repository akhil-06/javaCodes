package Lecture1;

import java.util.Scanner;

public class bubbleSort {
	
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
	
	public static void printLL(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static int listLength(Node<Integer> head) {
		int count = 0;
		while(head != null) {
			head = head.next;
			count++;
		}
		return count;
	}
	public static Node<Integer> bubbleSort(Node<Integer> head){
		int listLength = listLength(head);
		for(int i=0; i<(listLength-1); i++) {
			Node<Integer> prev = null;
			Node<Integer> curr = head;
			for(int j=0; j<(listLength-i-1); j++) {
				if(curr.data <= curr.next.data) {
					prev = curr;
					curr = curr.next;
				}else {
					if(prev == null) {
						Node<Integer> fwd = curr.next;
						head = head.next;
						curr.next = fwd.next;
						fwd.next = curr;
						prev = fwd;
					}else {
						Node<Integer> fwd = curr.next;
						prev.next = fwd;
						curr.next = fwd.next;
						fwd.next = curr;
						
						prev = fwd;
					}
				}
			}
		} 
		return head;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		Node<Integer> newHead = bubbleSort(head);
		printLL(newHead);
	}

}
