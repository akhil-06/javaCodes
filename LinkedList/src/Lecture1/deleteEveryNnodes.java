package Lecture1;

import java.util.Scanner;

public class deleteEveryNnodes {

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
	
	public static Node<Integer> deleteEveryNnodes(Node<Integer> head,int m, int n){
		if(m==0 || head==null) {
			return null;
		}
		if(n == 0) {
			return head;
		}
		Node<Integer> temp = head;
		Node<Integer> curr = null;
		while(temp != null) {
			int count1 = 0;
			int count2 = 0;
			while(temp != null && count1 < m) {
				if(curr ==null) {
					curr = temp;
				}else {
					curr.next = temp;
					curr = temp;
				}
				temp = temp.next;
				count1++;
			}
			while(temp != null && count2 < n) {
				temp = temp.next;
				count2++;
			}
		}
		if(curr != null) {
			curr.next = null;
		}
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of print = ");
		int m = s.nextInt();
		System.out.print("Enter the value of delete = ");
		int n = s.nextInt();
		Node<Integer> ans = deleteEveryNnodes(head,m,n);
		printLL(ans);
	}

}
