package stacks;

public class stackArrayUse {

	public static void main(String[] args) throws stackFullExeption, stackEmptyException {
		// TODO Auto-generated method stub
		stackUsingArray stack = new stackUsingArray();
		
		int arr[] = {1,2,3,4,5,6,7};
		
		for(int i=0;i<arr.length;i++) {
			stack.push(arr[i]);
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
//		stack.push(10);
//		stack.push(20);
//		System.out.println(stack.top());
//		System.out.println(stack.size());
//		stack.pop();
//		System.out.println(stack.isEmpty());
	}

}
