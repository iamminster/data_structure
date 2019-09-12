package io.github.iamminster.data_structure.list;

public class DoubleLinkedList implements LinkedList {

	private Node head = null;
//	private Node tail =null;
	private int length = 0;

	public DoubleLinkedList() {
		// TODO Auto-generated constructor stub
	}

	// pushFront O(1)
	@Override
	public void pushFront(Object key) {
		Node newNode = new Node(key);
		if (length == 0) {
			head = newNode;
//			tail = node;
			++length;
			return;
		}
		head.setPrevious(newNode);
		newNode.setNext(head);
		newNode.setPrevious(null);
		head = newNode;
		++length;
		return;
	}

	// topFront O(1)
	@Override
	public Object topFront() {
		if (length == 0) {
			return null;
		}
		return head.getKey();
	}

	// popFront O(1)
	@Override
	public void popFront() {
		if (length == 0) {
			return;
		}
//		if (length == 1) {
//			head = tail = null;
//			return;
//		}
		head = head.getNext();
		if (head != null) {
			head.setPrevious(null);
		}
		--length;
		return;
	}

	// pushBack O(n)
	@Override
	public void pushBack(Object key) {
		Node newNode = new Node(key);
		if (length == 0) {
			head = newNode;
			++length;
			return;
		}
		// loop
		Node iterator = head;
		while (iterator.getNext() != null) {
			iterator = iterator.getNext();
		}
		iterator.setNext(newNode);
		newNode.setPrevious(iterator);
		++length;
		return;

	}

	// topBack O(n)
	@Override
	public Object topBack() {
		if (head == null) {
			return null;
		}

		Node iterator = head;
		while (iterator.getNext() != null) {
			iterator = iterator.getNext();
		}
		return iterator.getKey();
	}

	// popBack O(n)
	@Override
	public void popBack() {
		if (length == 0) {
			return;
		}
		if (length == 1) {
			head = null;
			--length;
			return;
		}

		Node iterator = head;
		while (iterator.getNext() != null && iterator.getNext().getNext() != null) {
			iterator = iterator.getNext();
		}
		iterator.setNext(null);
		--length;
		return;

	}

	// find O(n)
	@Override
	public Node find(Object key) {
		if (length == 0) {
			return null;
		}

		Node iterator = head;
		do {
			if (iterator.getKey().equals(key)) {
				return iterator;
			}
			iterator = iterator.getNext();
		} while (iterator != null);
		return null;
	}
	
	@Override
	public int findIndex(Object key) {
		if (head == null) {
			return -1;
		}
		
		Node iterator = head;
		int index = 0;
		do {
			if (iterator.getKey().equals(key)) {
				return index;
			}
			iterator = iterator.getNext();
			++index;
		} while (iterator != null);
		return -1;
	}

	// erase O(n)
	@Override
	public int erase(Object key) {
		if (length == 0) {
			return -1;
		}

		Node iterator = head;
		int index = 0;
		do {
			if (iterator.getKey().equals(key)) {
				if (length == 1) {
					head = null;
					--length;
					return index;
				} else {
					if (iterator.getPrevious() != null) {
						iterator.getPrevious().setNext(iterator.getNext());
					}
					if (iterator.getNext() != null) {
						iterator.getNext().setPrevious(iterator.getPrevious());
					}
					if (head == iterator) {
						head = iterator.getNext();
					}
					--length;
					return index;
				}
			}
			++index;
		} while (iterator != null);
		return -1;
	}

	// empty O(1)
	@Override
	public boolean empty() {
		return (length == 0);
	}

	// get O(n)
	@Override
	public Node get(int index) {
		if (index >= length || index < 0) {
			return null;
		}

		Node iterator = head;
		for (int loopIndex = 0; loopIndex < index; ++loopIndex) {
			iterator = iterator.getNext();
		}
		return iterator;
	}

	// length O(1)
	@Override
	public int length() {
		return length;
	}

	// addBefore O(1)
	@Override
	public void addBefore(Node node, Object key) {
		Node newNode = new Node(key);

		if (node == null) {
			head = newNode;
			++length;
			return;
		}

		if (node.getPrevious() != null) {
			newNode.setPrevious(node.getPrevious());
			node.getPrevious().setNext(newNode);
		}
		else {
			head = newNode;
		}
		node.setPrevious(newNode);
		newNode.setNext(node);
		++length;
		return;
	}

	// addAfter O(1)
	@Override
	public void addAfter(Node node, Object key) {
		Node newNode = new Node(key);

		if (head == null) {
			head = newNode;
			++length;
			return;
		}
		if (node == null) {
			newNode.setNext(head);
			head.setPrevious(newNode);
			head = newNode;
			++length;
			return;
		}

		if (node.getNext() != null) {
			newNode.setNext(node.getNext());
			node.getNext().setPrevious(newNode);
		}
		node.setNext(newNode);
		newNode.setPrevious(node);
		++length;
		return;
	}

	// print
	@Override
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
