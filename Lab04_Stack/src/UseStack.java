
public class UseStack {
	
	//implement this method.
	public static Stack sort(Stack s) throws Exception {
		ArrayListStack temp = new ArrayListStack();
		while(!s.isEmpty()) {
			int k = s.top();
			s.pop();
			while((!temp.isEmpty()) && (temp.top() < k)) {
				System.out.println("Hello");
				s.push(temp.top());
				temp.pop();
			}

			temp.push(k);			
		}		
		return temp;


	}

}
