package stacks;


public class stackUsingLL<T> {

	private Node<T> head;
	private int size;

	public stackUsingLL() {
		head = null;
		size = 0;
	}


	//no issue of double capacity 
	//All functions have O(1) TC
	//and also generic in nature, so any type of value can be inserted
	//so stack with array and linked list is awsome......
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}

	public void push(T elem) {
		Node<T> newNode = new Node<T>(elem);
		if(head==null) {
			head=newNode;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
		size++;
	}

	public T top() throws stackEmptyException {
		if(isEmpty()) {
			//throw stackEmpty exception
			throw new stackEmptyException();
		}
		return head.data;
	}

	public T pop() throws stackEmptyException {
		if(isEmpty()) {
			//throw stackEmpty exception
			throw new stackEmptyException();
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
}
