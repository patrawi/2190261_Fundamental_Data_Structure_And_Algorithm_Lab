
public class StudentList extends CDLinkedList {
    // you can write additional methods.

	// implement this method
	public void swapNode(DListIterator i1, DListIterator i2) throws Exception {
		DListIterator p1 = new DListIterator(i1.currentNode.nextNode);
		DListIterator p2 = new DListIterator(i2.currentNode.nextNode);
		DListIterator p3 = new DListIterator(i1.currentNode.previousNode);
		DListIterator p4 = new DListIterator(i2.currentNode.previousNode);

		i1.currentNode.nextNode = p2.currentNode;
		i1.currentNode.previousNode =  p4.currentNode;
		i2.currentNode.nextNode = p1.currentNode;
		i2.currentNode.previousNode = p3.currentNode;
		
		p3.currentNode.nextNode = i2.currentNode;
		p4.currentNode.nextNode = i1.currentNode;
		p1.currentNode.previousNode = i2.currentNode;
		p2.currentNode.previousNode = i1.currentNode;
		
	
	}	
	
	// implement this method
	public void insertList(DListIterator i1, CDLinkedList lst) throws Exception {
		if(!lst.isEmpty()) {
			DListIterator itr1 = new DListIterator(lst.header);
			while(i1.hasPrevious() && (itr1.currentNode.previousNode != lst.header)) {
				itr1.previous();
				Student stu = (Student) itr1.currentNode.data;
			    insert(stu,i1);
			}
		} 
		return;
	}

	// implement this method
	public void gender(String g) throws Exception {
		DListIterator dtr1 = new DListIterator(header);
		StudentList temp = new StudentList();
		while(dtr1.hasNext() && dtr1.currentNode.nextNode != header) {
			dtr1.next();
			Student stu = (Student) dtr1.currentNode.data;
			if(stu.getSex() == g) {
				temp.insert(stu, new DListIterator(temp.header.previousNode));
				remove(stu);
	
			}
					}
		insertList(new DListIterator(header),  temp);
	
		
		
		

	}
}