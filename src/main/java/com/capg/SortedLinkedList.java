package com.capg;

public class SortedLinkedList<K extends Comparable<K>> {
	INode<K> head;
	INode<K> tail;
	
	public SortedLinkedList(INode<K> head, INode<K> tail) {
		this.head = head;
		this.tail = tail;
	}
	 
	SortedLinkedList(){
	}
	
	public void addSort(INode<K> myNode) {
		INode<K> temp1 = head;
		INode<K> temp2 = null;
		while (temp1 != null && myNode.getKey().compareTo(temp1.getKey()) > 0) {
			temp2 = temp1;
			temp1 = temp1.getNext();
		}
		if (temp2 == null) {
			this.head = myNode;
		} else {
			temp2.setNext(myNode);
		}
		myNode.setNext(temp1);
		while (temp1 != null) {
			this.tail = temp1;
			temp1 = temp1.getNext();
		}

	}

	public void printMyNodes() {
		if (head == null) {
			System.out.println("No nodes present");
			return;
		}
		INode tempNode = head;
		while (tempNode != null) {
			System.out.print(tempNode.getKey() + " -> ");
			tempNode =  tempNode.getNext();
		}
	}

}
