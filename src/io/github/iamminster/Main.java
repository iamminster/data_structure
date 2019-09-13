package io.github.iamminster;

import io.github.iamminster.algorithm.BasicAlgorithms;
import io.github.iamminster.data_structure.list.DoubleLinkedList;
import io.github.iamminster.data_structure.list.DoubleLinkedListWithTail;
import io.github.iamminster.data_structure.list.LinkedList;

public class Main {

	public static void main(String[] args) {
		System.out.println("Test List");
		LinkedList myList = new DoubleLinkedListWithTail();
//		myList.printList();
//		
//		myList.pushFront(1); // 1
//		myList.printList();
//		myList.pushFront(2); // 2 1
//		myList.printList();
//		myList.pushBack(3);  // 2 1 3 
//		myList.printList();
//		myList.pushBack(2);  // 2 1 3 
//		myList.printList();
//		
//		println(myList.findIndex(1));
//		println(myList.findIndex(2));
//		println(myList.findIndex(3));
//		println(myList.findIndex(4));
//		println(myList.topFront());
//		println(myList.topBack());
//		
//		myList.erase(2);
//		myList.printList();
//		myList.popBack();
//		myList.printList();
//		myList.popFront();
//		myList.printList();
//		println(myList.empty());
//		myList.popFront();
//		println(myList.empty());
//		myList.addBefore(null, 10);
//		myList.printList();
//		
//		println(myList.length());
//		myList.addBefore(myList.get(0), 100);
//		myList.printList();
//		
//
//		println(myList.length());
//		myList.addBefore(myList.get(1), 1000);
//		myList.printList();
//		
//
//		println(myList.length());
//		myList.addAfter(myList.get(2), 99);
//		myList.printList();
//
//		println(myList.length());
//		myList.addAfter(myList.get(0), 55);
//		myList.printList();
//
//		println(myList.length());
//		myList.addAfter(null, 66);
//		myList.printList();
//
//		println(myList.length());
//		myList.addAfter(myList.get(3), 55);
//		myList.printList();
		
		BasicAlgorithms alg = new BasicAlgorithms();
		String input = "()()()()()()[][][]";
		String input2 = "(((([()][]))))()";
		String input3 = "()()()()()()][][]";
		String input4 = "())()()()()[][][]";
		String input5 = "()()()()()()[][][";
		String input6 = ")()()()()()()[][][]";
//		println(alg.isBalanced(input));
//		println(alg.isBalanced(input2));
//		println(alg.isBalanced(input3));
//		println(alg.isBalanced(input4));
//		println(alg.isBalanced(input5));
//		println(alg.isBalanced(input6));
		
		String a = "a";
		String b = "absc";
		println(a == b);
		b = "a";
		println(a == b);
//		println(System.identityHashCode(a));
//		println(System.identityHashCode(b));
	}
	
	public static void println(Object obj) {
		System.out.println(obj);
	}

}
