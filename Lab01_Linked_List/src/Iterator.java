public interface Iterator {
	Object currentNode = null;

	public boolean hasNext();

	public Object next() throws Exception;

	public void set(Object value);

}
