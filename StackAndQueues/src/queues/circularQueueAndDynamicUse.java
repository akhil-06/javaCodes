package queues;

public class circularQueueAndDynamicUse {

	public static void main(String[] args) throws queueFullException, queueEmptyException {
		// TODO Auto-generated method stub
		circularQueueAndDynamic queue = new circularQueueAndDynamic(2);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		queue.enqueue(40);
		queue.enqueue(80);
		queue.enqueue(90);
		System.out.println(queue.size());
		System.out.println(queue.front());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.size());
		System.out.println(queue.front());
		System.out.println(queue.deQueue());
		System.out.println(queue.size());
		System.out.println(queue.front());
	}

}
