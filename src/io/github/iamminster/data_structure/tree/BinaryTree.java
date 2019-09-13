package io.github.iamminster.data_structure.tree;

public class BinaryTree {

	private Object key = null;
	private BinaryTree left = null;
	private BinaryTree right = null;
		
	public BinaryTree(Object key) {
		this.key = key;
		left = null;
		right = null;
	}

	public Object getKey() {
		return key;
	}

	public void setKey(Object key) {
		this.key = key;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}

	public int height() {
		if (key == null) {
			return 0;
		}
		if (left == null && right == null) {
			return 1;
		}
		if (left == null) {
			return 1 + right.height();
		}
		if (right == null) {
			return 1 + left.height();
		}
		return 1 + Math.max(left.height(), right.height());
	}
	
	public int size() {
		if (key == null) {
			return 0;
		}
		if (left == null && right == null) {
			return 1;
		}
		if (left == null) {
			return 1 + right.size();
		}
		if (right == null) {
			return 1 + left.size();
		}
		return 1 + left.size() + right.size();
	}
	
	public int level() {
		return 1;
	}
}
