
public class Node <T>{
	
	private Node next;
	private T data;
	
	public Node(Node next, T data) {
		this.next = next;
		this.data = data;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		return next;
	}
	
	public T getData() {
		return data;
	}
}
