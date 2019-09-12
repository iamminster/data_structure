package io.github.iamminster.data_structure.list;

public class DoubleLinkedListWithTail implements LinkedList {

	private Node head = null;
	private Node tail = null;
	private int length = 0;

	public DoubleLinkedListWithTail() {
		// TODO Auto-generated constructor stub
	}

	// O(1)
	@Override
	public void pushFront(Object key) {
		Node newNode = new Node(key);

		if (length == 0) {
			head = newNode;
			tail = newNode;
			++length;
			return;
		}

		newNode.setNext(head);
		head.setPrevious(newNode);
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
		if (head == null) {
			return;
		}
		head = head.getNext();
		--length;
		if (head != null) {
			head.setPrevious(null);
		}
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

		newNode.setPrevious(tail);
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

	// O(1)
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

		tail = tail.getPrevious();
		tail.setNext(null);
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

		int index = 0;
		Node iterator = head;
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
		if (length == 0) {
			return -1;
		}

		if (length == 1) {
			head = tail = null;
			--length;
			return 0;
		}

		int index = 0;
		Node iterator = head;
		do {
			if (iterator.getKey().equals(key)) {
				if (iterator.getPrevious() != null) {
					iterator.getPrevious().setNext(iterator.getNext());
				}
				if (iterator.getNext() != null) {
					iterator.getNext().setPrevious(iterator.getPrevious());
				}
				if (head == iterator) {
					head = iterator.getNext();
				}
				if (tail == iterator) {
					tail = iterator.getPrevious();
				}
				--length;
				return index;
			}
			iterator = iterator.getNext();
			++index;
		} while (iterator != null);
		return -1;
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

	// O(1)
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
			head.setPrevious(newNode);
			head = newNode;
			++length;
			return;
		}

		newNode.setNext(node);
		newNode.setPrevious(node.getPrevious());
		if (node.getPrevious() != null) {
			node.getPrevious().setNext(newNode);
		} else {
			head = newNode;
		}
		node.setPrevious(newNode);
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
			head.setPrevious(newNode);
			head = newNode;
			++length;
			return;
		}

		newNode.setPrevious(node);
		newNode.setNext(node.getNext());
		if (node.getNext() != null) {
			node.getNext().setPrevious(newNode);
		} else {
			tail = newNode;
		}
		node.setNext(newNode);
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
