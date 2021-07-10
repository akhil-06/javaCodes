package Lecture1;

import java.util.Scanner;

public class mergeTwoSortedLL {
	
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

	public static Node<Integer> mergeTwoSortedLL(Node<Integer> head1, Node<Integer> head2){
		if(head1 == null) {
			return head2;
		}
		if(head2 == null) {
			return head1;
		}
		
		Node<Integer> head3 = null;
		Node<Integer> tail3 = null;
		Node<Integer> temp1 = head1;
		Node<Integer> temp2 = head2;

		//we have compared for 1 node and attach the head and tail respectively 
			if(temp1.data <= temp2.data) {
//				tail3.next = temp1;
				head3 = temp1;
				tail3= temp1;
				temp1 = temp1.next;
			}else {
				
				head3 = temp2;
				tail3= temp2;
				temp2 = temp2.next;
			}
//		}
			//for comparing every elemnt of LL
			//if temp1 is smaller attach that otherwise attach temp2
			while(temp1!=null && temp2!=null) {
				if(temp1.data <= temp2.data) {
					tail3.next = temp1;
					tail3 = temp1;
					temp1 =  temp1.next;
				}else {
					tail3.next = temp2;
					tail3 = temp2;
					temp2 =  temp2.next;
				}
			}
			
			//one list is over now
			
			if(temp1 != null) {
				//first list is remaining
				tail3.next = temp1;
			}else {
				//second list is remaining
				tail3.next = temp2;
			}
		return head3;
	}
	
	public static void printR(Node<Integer> head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printR(head.next);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> listL1 = takeInput();
		Node<Integer> listL2 = takeInput();
		Node<Integer> head = mergeTwoSortedLL(listL1, listL2);
		printR(head);
	}

}
