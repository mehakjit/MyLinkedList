package com.capg;

import org.junit.Assert;
import org.junit.Test;

import com.capg.MyLinkedList;
import com.capg.MyNode;

public class MyLinkedListTest {
	@Test
	public void given3NumbersWhenAddedShouldBeAddedToTop() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyNode<Integer> myFouthNode = new MyNode<>(40);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.addMiddle(mySecondNode);
		myLinkedList.insertAfterNode(mySecondNode,myFouthNode);
		myLinkedList.delete(myFouthNode);
	//	myLinkedList.pop();
	//	myLinkedList.popLast();
		myLinkedList.printMyNode();
		boolean result = myLinkedList.head.equals(myFirstNode) &&
				myLinkedList.head.getNext().equals(mySecondNode) &&
			//	myLinkedList.head.getNext().getNext().equals(myFouthNode) &&
				myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
}
