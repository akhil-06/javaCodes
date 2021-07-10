package Lecture1;

import java.util.Scanner;

class DoubleNode{
	Node<Integer> head;
	Node<Integer> tail;

	DoubleNode(){

	}
	DoubleNode(Node<Integer> head, Node<Integer> tail){
		this.head = head;
		this.tail = tail;
	}
}

public class reverseRecursively {

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
	
	//doubleNode approach
	public static DoubleNode reverseBetter(Node<Integer> head) {
		DoubleNode ans;
		if(head == null || head.next == null) {
			ans = new DoubleNode();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		DoubleNode smallAns = reverseBetter(head.next);
		smallAns.tail.next = head;
		head.next = null;
		
		ans = new DoubleNode();
		ans.head = smallAns.head;
		ans.tail = head;
		return ans;
	}
	
	//best approach
	public static Node<Integer> reverseBest(Node<Integer>head){
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> reversedHead = reverseLLrecursive(head.next);
		Node <Integer> tail = head.next;
		tail.next = head;
		head.next = null;
		return reversedHead;
	}

	//TC is high O(n2)
	public static Node<Integer> reverseLLrecursive(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> reversedHead = reverseLLrecursive(head.next);
		Node<Integer> temp = reversedHead;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = head;
		head.next = null;
		return reversedHead;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node <Integer> head = takeInput();
		//		Node<Integer> newHead = reverseLLrecursive(head);
		DoubleNode ans = reverseBetter(head);
//		Node<Integer> better = reverseBest(head);
		printR(head);
	}

}
