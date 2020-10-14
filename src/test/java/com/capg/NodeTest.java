package com.capg;

import org.junit.Assert;
import org.junit.Test;

public class NodeTest {
	@Test
	public void given3NumbersWhenLinkedShouldPass() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode) &&
						 mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}
}
