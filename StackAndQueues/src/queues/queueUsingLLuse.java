package queues;

public class queueUsingLLuse {

	public static void main(String[] args) throws queueEmptyException {
		// TODO Auto-generated method stub
		queueUsingLL<Integer> queue = new queueUsingLL<Integer>();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
	
		System.out.println(queue.size());
		System.out.println(queue.front());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
	}

}
