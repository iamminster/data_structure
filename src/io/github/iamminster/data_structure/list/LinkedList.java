package io.github.iamminster.data_structure.list;

public interface LinkedList {

	// pushFront O(1)
	void pushFront(Object key);

	// topFront O(1)
	Object topFront();

	// popFront O(1)
	void popFront();

	// pushBack O(n)
	void pushBack(Object key);

	// topBack O(n)
	Object topBack();

	// popBack O(n)
	void popBack();

	// find O(n)
	Node find(Object key);
	
	int findIndex(Object key);

	// erase O(n)
	int erase(Object key);

	// empty O(1)
	boolean empty();

	// get O(n)
	Node get(int index);

	// length O(1)
	int length();

	// addBefore O(1)
	void addBefore(Node node, Object key);

	// addAfter O(1)
	void addAfter(Node node, Object key);

	// print
	void printList();

}