package Lecture1;

import java.util.Scanner;

public class findNodeRecursively {
	
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

	public static int findNodeRecursiveHelper(Node<Integer>head, int data, int index) {
		if(head == null) {
			return -1;
		}
		if(head.data == data) {
			return index;
		}
		int smallAns = findNodeRecursiveHelper(head.next,data,index+1);
		return smallAns;
	}
	
	public static int findNodeRecursive(Node<Integer>head, int pos) {
		return findNodeRecursiveHelper(head,pos,0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter data of node to find = ");
		int pos = s.nextInt();
		int indexOfNode = findNodeRecursive(head, pos);
		System.out.println(indexOfNode + 1);
	}

}
