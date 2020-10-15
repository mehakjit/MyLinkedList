package com.capg;

import org.junit.Test;

public class MyLinkedListTest {
	@Test
	public void given3NumbersWhenAddedShouldBeAddedToTop() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.addMiddle(mySecondNode);
		myLinkedList.printMyNode();
		boolean result = myLinkedList.head.equals(myThirdNode) &&
				myLinkedList.head.getNext().equals(mySecondNode) &&
				myLinkedList.tail.equals(myFirstNode);
	}

}
