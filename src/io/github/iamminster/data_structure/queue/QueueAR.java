package io.github.iamminster.data_structure.queue;

public class QueueAR implements Queue {

	private Object[] arr = null;
	private int size = 0;
	private Object read = null;
	private Object write = null;
	
	public QueueAR(int size) {
		arr = new Object[size];
		this.size = size;
	}

	@Override
	public void enqueue(Object key) {
		
	}

	@Override
	public Object dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return false;
	}

}
