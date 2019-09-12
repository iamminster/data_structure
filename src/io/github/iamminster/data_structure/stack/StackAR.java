package io.github.iamminster.data_structure.stack;

public class StackAR implements Stack {

	private Object[] arr;
	private int top = -1;
	private int size = 0;

	public StackAR(int size) {
		this.size = size;
		arr = new Object[size];
	}

	@Override
	public void push(Object key) {
		if (top + 1 < size) {
			arr[++top] = key;
		}
		return;
	}

	@Override
	public Object top() {
		if (top == -1) {
			return null;
		}
		return arr[top];
	}

	@Override
	public Object pop() {
		if (top == -1) {
			return null;
		}
		return arr[top--];
	}

	@Override
	public boolean empty() {
		return (top == -1);
	}
}
