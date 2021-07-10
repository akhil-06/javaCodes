package Lecture1;

import java.util.Scanner;

public class mergeSortLL {

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
	public static Node<Integer> midLL(Node<Integer>list){
		if(list==null || list.next == null) {
			return list;
		}
		Node<Integer>slow = list;
		Node<Integer> fast = list;
		while(fast.next!=null && fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public static Node<Integer> mergeTwoSortedLL(Node<Integer> head1, Node<Integer> head2){
		if(head1 == null) {
			return head2;
		}
		if(head2 == null) {
			return head1;
		}
		Node<Integer> t1 = head1;
		Node<Integer> t2 = head2;
		Node<Integer> head = null;
		Node<Integer> tail = null;
		
		if(t1.data <= t2.data) {
			head = t1;
			tail = t1;
			t1 = t1.next;
		}else {
			head = t2;
			tail = t2;
			t2 = t2.next;
		}
		
		while(t1!=null && t2!=null) {
			if(t1.data <= t2.data) {
				tail.next = t1;
				tail = t1;
				t1 = t1.next;
			}else {
				tail.next = t2;
				tail = t2;
				t2 = t2.next;			
			}
		}
		if(t1!=null) {
			tail.next = t1;
		}else {
			tail.next = t2;
		}
		return head;
	}
	
	public static Node<Integer> mergeSortLL(Node<Integer>list){
		if(list == null || list.next == null) {
			return list;
		}
		Node<Integer> mid = midLL(list);
		Node<Integer> head1 = list;
		Node<Integer> head2 = mid.next;
		
		mid.next = null;
		
		Node<Integer>list1Head = mergeSortLL(head1);
		Node<Integer>list2Head = mergeSortLL(head2);
		Node<Integer>listHead = mergeTwoSortedLL(list1Head,list2Head);
		return listHead;
	}
	
	public static void printLL(Node<Integer> head){
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> list = takeInput();
		Node<Integer>finalHead = mergeSortLL(list);
		printLL(finalHead);
	}

}
