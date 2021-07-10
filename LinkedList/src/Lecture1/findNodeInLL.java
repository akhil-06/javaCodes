package Lecture1;

import java.util.Scanner;

public class findNodeInLL {

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
	
	public static int findiThNode(Node<Integer> head, int data) {
		if(head == null) {
			return -1;
		}
		int i=0;
		while(head != null) {
			if(head.data.equals(data)) {
				return i;
			}
			head = head.next;
			i++;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		System.out.print("Enter the element to print = ");
		Scanner s = new Scanner(System.in);
		int pos = s.nextInt();
		int index = findiThNode(head, pos);
		System.out.println(index);
	}

}
