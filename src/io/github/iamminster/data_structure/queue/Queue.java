package io.github.iamminster.data_structure.queue;

public interface Queue {

	// O(1)
	void enqueue(Object key);

	// O(1)
	Object dequeue();

	// O(1)
	boolean empty();

}