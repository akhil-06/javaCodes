package queues;

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
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if(size==0) {
			return true;
		}
		return false;
	}
	
	public void enqueue(T data) {
		Node<T> newNode = new Node<T>(data);
		if(front == null) {
			front = newNode;
			rear = newNode;
		}
		size++;
		rear.next = newNode;
		rear = newNode;
	}
	
	public T dequeue() throws queueEmptyException {
		if(isEmpty()) {
			throw new queueEmptyException();
		}
		T data = front.data;
		front = front.next;
		size--;
		return data;
	}
	
	public T front() throws queueEmptyException {
		if(isEmpty()) {
			throw new queueEmptyException();
		}
		return front.data;
	}
}
