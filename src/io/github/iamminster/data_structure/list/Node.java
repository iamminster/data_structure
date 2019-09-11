package io.github.iamminster.data_structure.list;

public class Node {

	private Object key;
	private Node next;
	private Node previous;
	
	public Node() {
		key = null;
		next = null;
		setPrevious(null);
	}

	public Node(Object key) {
		setKey(key);
		setNext(null);
	}
	
	public Node(Node node) {
		setKey(node.getKey());
		setNext(node.getNext());
	}

	public Object getKey() {
		return key;
	}

	public void setKey(Object key) {
		this.key = key;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public void printNode() {
		System.out.print(key.toString());
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

}
