
public class MaxIntHeap extends Heap{
	public void add(Object element) {
		
		// Add your code here
		int parent;
		int child = size -1;
		Comparable temp;
		if(++size == this.mData.length) {
			Object[] newHeap = new Object[2 * this.mData.length];
			System.arraycopy(mData, 0, newHeap, 0, size);
			this.mData = newHeap;
		}
		this.mData[size -1] = element;
		
		while( child > 0) {
			parent = (child - 1)/ 2;
			if (((Comparable) mData[parent]).compareTo(mData[child]) >= 0)
				break;
			temp = (Comparable) mData[parent];
			mData[parent] = mData[child];
			mData[child] = temp;
			child = parent;
		}
		
		
		
		
	}
	public Object pop() throws Exception {
		int parent = 0;
		int child = 2 * parent + 1;
		Object temp;	
		if (size == 0)
			throw new Exception("Priority queue empty.");
		Object minElem = mData[0];
		mData[0] = mData[size - 1];
		size--;
		while (child < size) {
			if (child < size - 1
					&& ((Comparable) mData[child]).compareTo(mData[child + 1]) < 0)
				child++;
			if (((Comparable) mData[parent]).compareTo(mData[child]) >= 0)
				break;
			temp = mData[child];
			mData[child] = mData[parent];
			mData[parent] = temp;
			parent = child;
			child = 2 * parent + 1;
		
		
	}
	
		return minElem;
		
}
}
