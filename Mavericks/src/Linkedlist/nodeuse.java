package Linkedlist;

import java.util.Scanner;

public class nodeuse {
	
	public static Node<Integer> takeInput(){
		Node<Integer> head = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null) {
				head = newNode;
			}else {
				Node<Integer> temp = head;
				while(temp.next !=null) {
					temp = temp.next;   //a++;
				}
				temp.next = newNode;
			}
			data = s.nextInt();
		}
		return head;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();

	}

}
