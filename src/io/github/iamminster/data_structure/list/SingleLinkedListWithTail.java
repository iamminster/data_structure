package io.github.iamminster.data_structure.list;

public class SingleLinkedListWithTail implements LinkedList {

	private Node head = null;
	private Node tail = null;
	private int length = 0;

	public SingleLinkedListWithTail() {

	}

	// O(1)
	@Override
	public void pushFront(Object key) {
		Node newNode = new Node(key);
		if (length == 0) {
			head = tail = newNode;
			++length;
			return;
		}
		newNode.setNext(head);
		head = newNode;
		++length;
		return;
	}

	// O(1)
	@Override
	public Object topFront() {
		if (length == 0) {
			return null;
		}
		return head.getKey();
	}

	// O(1)
	@Override
	public void popFront() {
		if (length == 0) {
			return;
		}
		head = head.getNext();
		--length;
		return;
	}

	// O(1)
	@Override
	public void pushBack(Object key) {
		Node newNode = new Node(key);

		if (length == 0) {
			head = tail = newNode;
			++length;
			return;
		}
		tail.setNext(newNode);
		tail = newNode;
		++length;
		return;
	}

	// O(1)
	@Override
	public Object topBack() {
		if (length == 0) {
			return null;
		}
		return tail.getKey();
	}

	// O(n)
	@Override
	public void popBack() {
		if (length == 0) {
			return;
		}
		if (length == 1) {
			head = tail = null;
			--length;
			return;
		}

		Node iterator = head;
		while (iterator.getNext() != tail) {
			iterator = iterator.getNext();
		}
		iterator.setNext(null);
		tail = iterator;
		--length;
		return;
	}

	// O(n)
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

	// O(n)
	@Override
	public int findIndex(Object key) {
		if (length == 0) {
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

	// O(n)
	@Override
	public int erase(Object key) {
		// TODO Auto-generated method stub
		return 0;
	}

	// O(1)
	@Override
	public boolean empty() {
		return (length == 0);
	}

	// O(n)
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

	// O(1)
	@Override
	public int length() {
		return length;
	}

	// O(n)
	@Override
	public void addBefore(Node node, Object key) {
		Node newNode = new Node(key);

		if (length == 0) {
			head = tail = newNode;
			++length;
			return;
		}
		if (node == null) {
			newNode.setNext(head);
			head = newNode;
			++length;
			return;
		}

		Node iterator = head;
		while (iterator.getNext() != node) {
			iterator = iterator.getNext();
		}
		newNode.setNext(node);
		iterator.setNext(newNode);
		++length;
		return;
	}

	// O(1)
	@Override
	public void addAfter(Node node, Object key) {
		Node newNode = new Node(key);

		if (length == 0) {
			head = tail = newNode;
			++length;
			return;
		}
		if (node == null) {
			newNode.setNext(head);
			head = newNode;
			++length;
			return;
		}
		node.setNext(newNode);
		if (node == tail) {
			tail = newNode;
		}
		++length;
		return;
	}

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
