package com.capg;

public class MyLinkedList {
	private INode head;
	private INode tail;

	public MyLinkedList() {
		this.head = head;
		this.tail = tail;	
	}
	
	public void add(INode newNode) {
		if(this.tail == null) 
			this.tail = newNode;
		if(this.head == null)
			this.head = newNode;
		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	public void printMyNode() {
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
