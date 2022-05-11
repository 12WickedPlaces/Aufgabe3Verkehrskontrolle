
public class Queue <T>{
	
	private Node head;
	private Node tail;
	private int size;
	
	public Queue() {
		head = null;
		tail = null;
		size = 0;
	}
	
	public Queue(T data) {
		Node node = new Node (null, data);
		head = node;
		tail = node;
		size = 1;
	}
	
	public void add(T data) {
		Node node = new Node(null, data);
		if (size == 0) {
			head = node;
			tail = node;
		}else {
			tail.setNext(node);
			tail = node;
		}
		size++;
		
	}
	
	public void remove() {
		if (size > 0 ) {
			head = head.getNext();
			size--;
		}
		
	}
	
	public T peek() {
		try {
			return (T) head.getData();
		} catch (Exception e) {
			return null;
		}
	}
	
	public T poll() {
		try {
			T data = (T)head.getData();
			remove();
			return data;
		} catch (Exception e) {
			return null;
		}
	}
	
	public int size() {
		return size;
	}	
		
}
