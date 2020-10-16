package com.capg;

public class MyLinkedList<K> {
	public INode<K> head;
	public INode<K> tail;

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
			INode tempNode = this.head;        //node.setNext(head);
			this.head = newNode;			   //head = node;         will also work
			this.head.setNext(tempNode);
		}
	}
	
	public void append(INode newNode) {
		if(this.head == null)
			this.head = newNode;
		if(this.tail == null) 
			this.tail = newNode;
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	 public void addMiddle(INode node) {
		 INode slow = head;
		 INode fast = head.getNext();
		 if(head == null) {
			 this.head = node;
			 this.tail = node;
		 }
		while(fast!=null && fast.getNext()!=null) {
		 slow = slow.getNext();
		 fast = fast.getNext().getNext();
		}
		INode temp = slow.getNext();
		slow.setNext(node);
		node.setNext(temp);
	 }
	 
	public INode pop(){
		INode temp = this.head;
		this.head = head.getNext();
		return temp;
	}
	
	public void popLast(){
		INode temp = this.head;
		while(temp.getNext()!=null && temp.getNext().getNext()!=null) {
			temp=temp.getNext();
		}
		temp.setNext(null);
		this.tail = temp;
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

	public INode<K> searchNode(K key) {
		INode tempNode = head;
		while(tempNode != null) {
			if(tempNode.getKey() == key)
				return tempNode;
			tempNode = tempNode.getNext();
		}
		return null;
	}

	public void insertAfterNode(MyNode addAfterThisNode, MyNode addThisNode) {
		INode tempNode = addAfterThisNode.getNext();
		addAfterThisNode.setNext(addThisNode);
		addThisNode.setNext(tempNode);		
	}

	public void delete(MyNode deleteThisNode) {
		if (this.head == deleteThisNode)
			pop();
		else {
			INode tempNode = this.head;
			while (tempNode.getNext() != deleteThisNode) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(tempNode.getNext().getNext());
		}
	}

}
