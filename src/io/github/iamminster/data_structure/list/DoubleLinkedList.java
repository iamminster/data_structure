package io.github.iamminster.data_structure.list;

public class DoubleLinkedList {

	private Node head = null;
	private Node tail =null;
	private int length = 0;
	
	public DoubleLinkedList() {
		// TODO Auto-generated constructor stub
	}
	
	// pushFront O(1)
	public void pushFront(Node node) {
		if (length == 0) {
			head = node;
			tail = node;
			++length;
			return;
		}
		node.setNext(head);
		head = node;
		return;
	}
	
	// topFront O(1)
	public Object topFront() {
		if (length == 0) {
			return null;
		}
		return head.getKey();
	}
	
	// popFront O(1)
	public void popFront() {
		if (length == 0) {
			return;
		}
		if (length == 1) {
			head = tail = null;
			return;
		}
		head = head.getNext();
		return;
	}
	// pushBack O(1)
	// topBack O(1)
	// popBack O(1)
	// find O(n)
	// erase O(n)
	// empty O(1)
	// get O(n)
	// length O(1)
	// addBefore O(n)
	// addAfter O(n)
	// print

}
