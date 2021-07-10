package queues;

public class circularQueueAndDynamic {
	private int data[];
	private int front; // index of element at front
	private int rear;  // index of element at rear
	private int size;

	public circularQueueAndDynamic() {
		data = new int[10];
		front = -1;
		rear = -1;
	}

	public circularQueueAndDynamic(int capacity) {
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
//			throw new queueFullException();
			doubleCapacity();
		} 
		
//		rear++;
//		if(rear == data.length) {
//			rear = 0;
//		}
		if(size == 0) {
			front = 0; // or front++
		}
		
		rear = (rear+1)%data.length;
		data[rear] = elem;
		size++;
	}

	private void doubleCapacity() {
		int temp[] = data;
		data = new int[2*data.length];
		int index = 0;
		//copy from front to end
		for(int i=front;i<temp.length;i++) {
			data[index++] = temp[i];
		}
		//copy from 0 to front-1
		for(int i=0;i<front-1;i++) {
			data[index++] = temp[i];
		}
		front = 0;
		rear = temp.length-1;
	}
	
	public int front() throws queueEmptyException {
		if(front == -1) {
			throw new queueEmptyException();
		}
		return data[front];
	}

	//circular queue when it reach to last move to 0th index, and equeue bhi ase hi hoga
	public int deQueue() throws queueEmptyException {
		if(size == 0) {
			throw new queueEmptyException();
		}
		
//		if(front == data.length) {
//			front = 0;
//		}
		int temp = data[front];
		
		
		front = (front+1)%data.length;
		size--;

		if(size == 0) {
			front = -1;
			rear = -1;
		}
		return temp;
	}
}


