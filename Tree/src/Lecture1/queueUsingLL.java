package Lecture1;

public class queueUsingLL<T> {
	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	public queueUsingLL(){
		front = null;
		rear = null;
		size = 0;
	}
	
	//all functions are in O(1)
	int size() {
		return size;
	}
	
	boolean isEmpty() {
		return size == 0;
	}
	
	void enqueue(T data) {
		Node<T> newNode = new Node<>(data);
		if(rear == null) {
			front = newNode;
			rear = newNode;
		}else {
			rear.next = newNode;
			rear = newNode;
		}
		size++;
	}
	
	T dequeue() throws queueEmptyException {
		if(size == 0) {
			throw new queueEmptyException();
		}
		T temp = front.data;
		front = front.next;
		if(size == 1) {
			rear = null;
		}
		size--;
		return temp;
	}
	
	 T front() throws queueEmptyException {
		if(isEmpty()) {
			throw new queueEmptyException();
		}
		return front.data;
	}
}
