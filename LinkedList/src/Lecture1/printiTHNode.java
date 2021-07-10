package Lecture1;

import java.util.Scanner;

public class printiTHNode {
	
	public static Node<Integer> takeInput(){
		Node<Integer> head = null,tail=null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer> (data);
			
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
	
	
	
	public static void printiThNode(Node<Integer> head, int pos) {
		Node<Integer> temp = head;
		int i = 0;
		if(pos == 0) {
			System.out.print(temp.data);
		}
		while(temp != null) {
			temp = temp.next;
			i++;
			
			if(i == pos) {
				System.out.print(temp.data);
			}
		}
		if(pos > i) {
			System.out.println("no node here");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		System.out.print("Enter pos of element to print = ");
		Scanner s = new Scanner(System.in);
		int pos = s.nextInt();
		printiThNode(head, pos);

	}

}


