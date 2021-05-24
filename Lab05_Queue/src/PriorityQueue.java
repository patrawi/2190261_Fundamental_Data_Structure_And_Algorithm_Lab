
public class PriorityQueue {
	MyQueue q;

	public PriorityQueue(MyQueue q) {
		super();
		this.q = q;
	}

	// implement this.
	public void push(int x) throws Exception {
		// 2 3 6 7 8 1
		if(q.isEmpty()) {
			q.insertLast(x);
			return;
		} else if (q.back() <= x) {
			q.insertLast(x);
		} 
		else {
			while(q.front() < x) {
				q.insertLast(q.front());
				q.removeFirst();
				
			}
			q.insertLast(x);
			while(q.front() >= q.back()) {
				q.insertLast(q.front());
				q.removeFirst();
		
			}
			
		}
		


	}

	// implement this.
	public void pop() throws Exception {
		q.removeFirst();
	}

	// implement this
	public int top() throws Exception {
		return q.front();


	}

}
