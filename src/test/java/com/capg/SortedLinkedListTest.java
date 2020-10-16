package com.capg;

import org.junit.Assert;
import org.junit.Test;

public class SortedLinkedListTest {
@Test
public void given3NodesShouldGiveResultInSortedList() {
	MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
	MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
	MyNode<Integer> myThirdNode = new MyNode<Integer>(40);
	MyNode<Integer> myFourthNode = new MyNode<Integer>(70);
	SortedLinkedList<Integer> sortedLinkedList = new SortedLinkedList<Integer>();
	sortedLinkedList.addSort(myFirstNode);
	sortedLinkedList.addSort(mySecondNode);
	sortedLinkedList.addSort(myThirdNode);
	sortedLinkedList.addSort(myFourthNode);
	sortedLinkedList.printMyNodes();
	boolean result = sortedLinkedList.head.equals(mySecondNode) &&
					 sortedLinkedList.head.getNext().equals(myThirdNode) 
					 &&  sortedLinkedList.head.getNext().getNext().getNext().equals(myFourthNode);
	Assert.assertTrue(result);
}

}
