package stacks;

public class stackUsingArray {
	private int data[];
	private int topIndex;
	
	public stackUsingArray() {
		data = new int[2];
		topIndex = -1;
	}
	
	//one more constructor for fixed size capacity
	public stackUsingArray(int size) {
		data = new int[size];
		topIndex = -1;
	}
	
	//O(1)
	public int size() {
		return topIndex+1;
	}
	
	//O(1)
	public boolean isEmpty() {
//		if(topIndex == -1) {
//			return true;
//		}
//		return false;
		//OR
		return topIndex == -1;
	}
	
	private void doubleCapacity() {
		System.out.println("double capacity");
		int temp[] = data;
		data = new int[2*temp.length];
		
		for(int i=0;i<temp.length;i++) {
			data[i] = temp[i];
		}
	}
	
	//O(1)
	public void push(int elem) throws stackFullExeption {
		//if stack is full i will throw a stack full execption
		if(topIndex == data.length-1) {
			//throw execption
//			stackFullExeption e = new stackFullExeption();
//			throw e;
			//Alternate way to doing this
//			throw new stackFullExeption();
			//now if stack full double the size
			doubleCapacity();
		}
//		topIndex++;
		data[++topIndex] = elem;
	}
	
	//O(1)
	public int top() throws stackEmptyException {
		if(topIndex == -1) {
			//throw stackEmpty exception
			throw new stackEmptyException();
		}
		return data[topIndex];
	}
	
	//O(1)
	public int pop() throws stackEmptyException {
		if(topIndex == -1) {
			//throw stackEmpty exception
			throw new stackEmptyException();
		}
		int top = data[topIndex];
		topIndex--;
		return top;
	}

}
