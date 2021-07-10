package Lecture1;

import java.util.Scanner;

public class swapTwoNodes {
	
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
	
	public static void my_swap(Node<Integer> node1, Node<Integer> node2) {
		int temp = node1.data;
		node1.data = node2.data;
		node2.data = temp;
	}

	public static Node<Integer> swapwoNodes(Node<Integer> head, int i, int j){
		Node<Integer> swap1 = head;
		Node<Integer> swap2 = head;
		int i1 = 0;
		while(i1 < i) {
			swap1 = swap1.next;
			i1++;
		}
		
		int i2 =0;
		while(i2 < j) {
			swap2 = swap2.next;
			i2++;
		}
		my_swap (swap1 , swap2);
		return head;
		
//		if(head == null || head.next == null) {
//			return head;
//		}
//		if(i == 0 || j == 0 && (Math.abs(i-j) == 1)) {
//			Node<Integer> c1 = head,c2 = head.next, next = null;
//			if(head.next != null){
//				next = c1.next.next;
//				c2.next= c1;
//				c1.next =next;
//				return c2;
//			}else {
//				return head;
//			}
//		}
//		if(Math.abs(i-j) == 1) {
//			Node<Integer> c1 = head,c2=null,p=null,n=null;
//			int pos = (i<j)?i:j;
//			int count =0;
//			while(c1!=null && c1.next!=null && count<pos) {
//				p = c1;
//				c1 = c1.next;
////				System.out.println(c1.data);
//				c2  = c1.next;
////				System.out.println(c2.data);
//				n= c1.next.next;
//				count++;
//			}
//			p.next = c2;
//			c2.next = c1;
//			c1.next = n;
//			return head;
//			
//		}
//		
//		if(i==0||j==0){
//			int count = 0;
//            Node<Integer> c1=head, c2=head,n1=head.next,p2=null;
//            while(c2!=null && count<i+j){
//                p2=c2;
//                c2=c2.next;
//                count++;
//            }
//            p2.next = c1;
//            c1.next = c2.next;
//            c2.next = n1;
//            return c2;
//            }
//		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of i = ");
		int i = s.nextInt();
		System.out.print("Enter value of j = ");
		int j = s.nextInt();
		Node<Integer> swapResult = swapwoNodes(head, i , j);
		printLL(swapResult);
	}

}
