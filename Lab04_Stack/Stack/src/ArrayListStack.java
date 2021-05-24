import java.util.ArrayList;

public class ArrayListStack implements Stack {
	private ArrayList<Integer> a;

	// implement a default constructor and all methods from interface Stack.
	// Additional methods maybe required in order to run tests.
	public ArrayListStack() {
		this.a = new ArrayList<Integer>();
	}

	public ArrayList<Integer> getA() {
		return a;
	}

	@Override
	public boolean isEmpty() {
		return this.a.size() == 0;

	}

	@Override
	public boolean isFull() {
		return this.a.size() >= 100000;
	}

	@Override
	public void makeEmpty() {
		this.a = new ArrayList<Integer>();
	}

	@Override
	public int top() throws Exception {
		System.out.println("Hello");
		if(isEmpty()) {
			throw new Exception();
		}
		return this.a.get(0);
	}

	@Override
	public void pop() throws Exception {
		if(isEmpty()) {
			throw new Exception();
		}
		this.a.remove(0);
		
	}

	@Override
	public void push(int data) throws Exception {
		this.a.add(0,data);
	}

}
