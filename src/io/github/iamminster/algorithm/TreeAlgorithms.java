package io.github.iamminster.algorithm;

import io.github.iamminster.data_structure.queue.Queue;
import io.github.iamminster.data_structure.queue.QueueLL;
import io.github.iamminster.data_structure.tree.BinaryTree;

public class TreeAlgorithms {

	public TreeAlgorithms() {
	}

	public void inOrderDFS(BinaryTree tree) {
		if (tree == null) {
			return;
		}
		inOrderDFS(tree.getLeft());
		print(tree.getKey());
		inOrderDFS(tree.getRight());
	}

	public void preOrderDFS(BinaryTree tree) {
		if (tree == null) {
			return;
		}
		print(tree.getKey());
		preOrderDFS(tree.getLeft());
		preOrderDFS(tree.getRight());
	}

	public void postOrderDFS(BinaryTree tree) {
		if (tree == null) {
			return;
		}
		postOrderDFS(tree.getLeft());
		postOrderDFS(tree.getRight());
		print(tree.getKey());
	}

	public void standardBFS(BinaryTree tree) {
		if (tree == null) {
			return;
		}
		Queue q = new QueueLL();
		q.enqueue(tree);
		while (!q.empty()) {
			BinaryTree subTree = (BinaryTree) q.dequeue();
			print(subTree.getKey());
			if (subTree.getLeft() != null) {
				q.enqueue(subTree.getLeft());
			}
			if (subTree.getRight() != null) {
				q.enqueue(subTree.getRight());
			}
		}
	}

	public int height(BinaryTree tree) {
		if (tree == null) {
			return 0;
		}
		return 1 + Math.max(height(tree.getLeft()), height(tree.getRight()));
	}

	public int size(BinaryTree tree) {
		if (tree == null) {
			return 0;
		}
		return 1 + size(tree.getLeft()) + size(tree.getRight());
	}

	public void print(Object key) {
		System.out.print(key + " ");
	}

}
