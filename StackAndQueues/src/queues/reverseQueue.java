package queues;

import java.util.Queue;
import java.util.LinkedList;

public class reverseQueue {

	public static void reverseQueue(Queue<Integer> queue) {
		if(queue.isEmpty() || queue.size() == 1) {
			return;
		}
		int front = queue.poll();
		reverseQueue(queue);
		queue.add(front);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <Integer> queue = new LinkedList<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		reverseQueue(queue);
		while (!queue.isEmpty()) {
			System.out.print(queue.poll() + " ");
		}

	}

}
