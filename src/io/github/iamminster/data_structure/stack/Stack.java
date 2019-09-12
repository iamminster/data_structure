package io.github.iamminster.data_structure.stack;

public interface Stack {

	// O(1)
	void push(Object key);

	// O(1)
	Object top();

	// O(1)
	Object pop();

	// O(1)
	boolean empty();

}