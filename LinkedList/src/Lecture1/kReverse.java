package Lecture1;

import java.util.Scanner;

public class kReverse {

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
	
	public static Node<Integer> kReverse(Node<Integer>head, int k){
		if(k == 0 || k == 1) {
			return head;
		}
		int count =0;
		Node<Integer>temp = head;
		Node<Integer>prev = null;
		Node<Integer>fwd = null;
		while(count < k && temp != null) {
			fwd = temp.next;
//			System.out.println("fwd data " + fwd.data);
			temp.next = prev;
			prev = temp;
//			System.out.println("prev data " + prev.data);
			temp = fwd;
//			System.out.println("temp data " + temp.data);
			count ++;
		}
		if(fwd != null) {
			head.next = kReverse(fwd,k);
//			System.out.println("head next data" + head.next.data);
		}
//		System.out.println("prev data" + prev.data);
		return prev;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of K = ");
		int k = s.nextInt();
		Node<Integer> kReverseResult = kReverse(head, k);
		printLL(kReverseResult);
	}

}
