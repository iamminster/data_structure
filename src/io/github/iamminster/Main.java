package io.github.iamminster;

import io.github.iamminster.data_structure.list.SingleLinkedList;

public class Main {

	public static void main(String[] args) {
		System.out.println("Test List");
		SingleLinkedList myList = new SingleLinkedList();
		myList.printList();
		
		myList.pushFront(1); // 1
		myList.printList();
		myList.pushFront(2); // 2 1
		myList.printList();
		myList.pushBack(3);  // 2 1 3 
		myList.printList();
		myList.pushBack(2);  // 2 1 3 
		myList.printList();
		
		println(myList.find(1));
		println(myList.find(2));
		println(myList.find(3));
		println(myList.find(4));
		println(myList.topFront());
		println(myList.topBack());
		
		myList.erase(2);
		myList.printList();
		myList.popBack();
		myList.printList();
		myList.popFront();
		myList.printList();
		println(myList.empty());
		myList.popFront();
		println(myList.empty());
		myList.addBefore(null, 10);
		myList.printList();
		
		println(myList.length());
		myList.addBefore(myList.get(0), 100);
		myList.printList();
		

		println(myList.length());
		myList.addBefore(myList.get(1), 1000);
		myList.printList();
		

		println(myList.length());
		myList.addAfter(myList.get(2), 99);
		myList.printList();

		println(myList.length());
		myList.addAfter(myList.get(0), 55);
		myList.printList();

		println(myList.length());
		myList.addAfter(null, 66);
		myList.printList();

		println(myList.length());
		myList.addAfter(myList.get(3), 55);
		myList.printList();
		
		
		
	}
	
	public static void println(Object obj) {
		System.out.println(obj);
	}

}
