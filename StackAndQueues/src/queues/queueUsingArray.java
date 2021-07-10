package queues;

public class queueUsingArray {
	private int data[];
	private int front; // index of element at front
	private int rear;  // index of element at rear
	private int size;

	public queueUsingArray() {
		data = new int[10];
		front = -1;
		rear = -1;
	}

	public queueUsingArray(int capacity) {
		data = new int[capacity];
		front = -1;
		rear = -1;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}

	public void enqueue(int elem) throws queueFullException {
		if(size == data.length) {
			throw new queueFullException();
		} 
		if(size == 0) {
			front = 0; // or front++
		}
		rear++;
		data[rear] = elem;
		size++;
	}

	
	public int front() throws queueEmptyException {
		if(front == -1) {
			throw new queueEmptyException();
		}
		return data[front];
	}

	public int deQueue() throws queueEmptyException {
		if(size == 0) {
			throw new queueEmptyException();
		}

		int temp = data[front];
		front++;
		size--;

		if(size == 0) {
			front = -1;
			rear = -1;
		}
		return temp;
	}
}


