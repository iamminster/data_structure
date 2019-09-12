package io.github.iamminster.data_structure.stack;

import io.github.iamminster.data_structure.list.LinkedList;
import io.github.iamminster.data_structure.list.SingleLinkedList;

public class StackLL implements Stack {

	private LinkedList list = null;
	
	public StackLL() {
		list = new SingleLinkedList();
	}
	
	// O(1)
	@Override
	public void push(Object key) {
		list.pushFront(key);
	}

	// O(1)
	@Override
	public Object top() {
		return list.topFront();
	}

	// O(1)
	@Override
	public Object pop() {
		Object result = list.topFront();
		list.popFront();
		return result;
	}

	// O(1)
	@Override
	public boolean empty() {
		return list.empty();
	}

}
