package io.github.iamminster.data_structure.list;

public class SingleLinkedList {

	private Node head = null;
	private int length = 0;

	public SingleLinkedList() {
		// TODO Auto-generated constructor stub
	}

	// O(1)
	public void pushFront(Object key) {
		Node newNode = new Node(key);
		++length;
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.setNext(head);
		head = newNode;
		return;
	}

	// O(1)
	public Object topFront() {
		if (head == null) {
			return null;
		}
		return head.getKey();
	}

	// O(1)
	public void popFront() {
		if (head != null) {
			head = head.getNext();
			--length;
		}
		return;
	}

	// O(n)
	public void pushBack(Object key) {
		Node newNode = new Node(key);
		++length;
		if (head == null) {
			head = newNode;
			return;
		}
		// loop list
		Node pointer = head;
		while (pointer.getNext() != null) {
			pointer = pointer.getNext();
		}
		pointer.setNext(newNode);
		return;
	}

	// O(n)
	public Object topBack() {
		if (head == null) {
			return null;
		}
		Node pointer = head;
		while (pointer.getNext() != null) {
			pointer = pointer.getNext();
		}
		return pointer.getKey();
	}

	// O(n)
	public void popBack() {
		if (head == null) {
			return;
		}
		Node pointer = head;
		while (pointer.getNext() != null && pointer.getNext().getNext() != null) {
			pointer = pointer.getNext();
		}
		pointer.setNext(null);
		--length;
	}

	// O(n)
	public int find(Object key) {
		if (head == null) {
			return -1;
		}
		Node pointer = head;
		int index = 0;
		while (pointer.getNext() != null) {
			if (pointer.getKey().equals(key)) {
				return index;
			}
			++index;
			pointer = pointer.getNext();
		}
		return -1;
	}

	// O(n)
	public int erase(Object key) {
		if (head == null) {
			return -1;
		}
		if (head.getKey().equals(key)) {
			head = head.getNext();
			return --length;
		}
		Node pointer = head;
		int index = 0;
		while (pointer.getNext() != null && !pointer.getNext().getKey().equals(key)) {
			++index;
			pointer = pointer.getNext();
		}
		if (index == length) {
			return -1;
		}
		pointer.getNext().setNext(null);
		pointer.setNext(pointer.getNext().getNext());
		--length;
		return ++index;
	}

	// O(1)
	public boolean empty() {
		return (length == 0);
	}

	// O(n)
	public void addBefore(Node node, Object key) {
		Node newNode = new Node(key);
		if (head == null || node == null) {
			head = newNode;
			++length;
			return;
		}
		
		if (head == node) {
			newNode.setNext(head);
			head = newNode;
			++length;
			return;
		}
		Node pointer = head;
		while (pointer.getNext() != null && pointer.getNext() != node) {
			pointer = pointer.getNext();
		}
		if (pointer.getNext() != null) {
			newNode.setNext(node);
			pointer.setNext(newNode);
			++length;
		}
		return;
	}

	// O(n)
	public void addAfter(Node node, Object key) {
		Node newNode = new Node(key);
		if (head == null) {
			head = newNode;
			++length;
			return;
		}
		if (node == null) {
			newNode.setNext(head);
			head = newNode;
			++length;
			return;
		}
		
		Node pointer = head;
		while (pointer != null) {
			if (pointer == node) {
				newNode.setNext(pointer.getNext());
				pointer.setNext(newNode);
				++length;
				return;
			}
			pointer = pointer.getNext();
		}
	}
	
	// O(n)
	public Node get(int index) {
		if (index + 1 > length || index < 0) {
			return null;
		}
		Node pointer = head;
		int loopIndex = 0;
		while (loopIndex++ < index) {
			pointer = pointer.getNext();
		}
		return pointer;
	}
	
	// O(1)
	public int length() {
		return length;
	}
	
	public void printList() {
		Node pointer = head;
		System.out.print("length = " + length + ": ");
		while (pointer != null) {
			System.out.print(" ");
			pointer.printNode();
			pointer = pointer.getNext();
		}
		System.out.println();
	}

}
