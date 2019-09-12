package io.github.iamminster.data_structure.queue;

import io.github.iamminster.data_structure.list.LinkedList;
import io.github.iamminster.data_structure.list.SingleLinkedListWithTail;

public class QueueLL implements Queue {

	private LinkedList list = null;
	
	public QueueLL() {
		list = new SingleLinkedListWithTail();
	}
	
	// O(1)
	@Override
	public void enqueue(Object key) {
		list.pushBack(key);
	}
	
	// O(1)
	@Override
	public Object dequeue() {
		Object key = list.topFront();
		list.popFront();
		return key;
	}
	
	// O(1)
	@Override
	public boolean empty() {
		return list.empty();
	}

}
