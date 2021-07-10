package Lecture1;

import java.util.Scanner;

public class appendLastNtoFirst {

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

	public static Node<Integer> appendNtoFirst(Node<Integer> head, int pos){
		if(head == null || pos == 0) {
			return head;
		}
		int len = 0;

		Node<Integer> curr = head,trav=head;
		Node<Integer> head2 = null,trav2=null;
		while(trav != null){
			trav = trav.next;
			len++;
		}
//		System.out.println(len);
		int count = len-pos;
//		System.out.println(count);
		for(int i=0;i<count-1;i++){
			curr = curr.next;
			System.out.println("curr data loop " + curr.data);
		}
		System.out.println("curr data " + curr.data);
		System.out.println("curr next data " + curr.next.data);
		
		head2 = curr.next;
		System.out.println("head2 " + head2.data);
		curr.next=null;
		trav2 = head2;
		System.out.println("trav2 " + trav2.data);
		while(trav2.next!=null){
			trav2=trav2.next;
			System.out.println("trav2 data loop " + trav2.data);
		}
		trav2.next = head;
		System.out.println("trav2 next data " + trav2.data);
		head = head2;

		return head;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node <Integer> head = takeInput();
		Scanner s = new Scanner(System.in);
		int pos = s.nextInt();
		Node<Integer> newHead = appendNtoFirst(head,pos);
		System.out.println();
		System.out.println("ans is ");
		printR(newHead);
	}

}
