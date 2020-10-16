package com.capg;

public class MyLinkedList<K> {
	public INode<K> head;
	public INode<K> tail;

	public MyLinkedList() {
		this.head = head;
		this.tail = tail;
	}

	public void add(INode newNode) {
		if (this.tail == null)
			this.tail = newNode;
		if (this.head == null)
			this.head = newNode;
		else {
			INode tempNode = this.head; // node.setNext(head);
			this.head = newNode; // head = node; will also work
			this.head.setNext(tempNode);
		}
	}

	public void append(INode newNode) {
		if (this.head == null)
			this.head = newNode;
		if (this.tail == null)
			this.tail = newNode;
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	public void addMiddle(INode node) {
		INode slow = head;
		INode fast = head.getNext();
		if (head == null) {
			this.head = node;
			this.tail = node;
		}
		while (fast != null && fast.getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		INode temp = slow.getNext();
		slow.setNext(node);
		node.setNext(temp);
	}

	public INode pop() {
		INode temp = this.head;
		this.head = head.getNext();
		return temp;
	}

	public void popLast() {
		INode temp = this.head;
		while (temp.getNext() != null && temp.getNext().getNext() != null) {
			temp = temp.getNext();
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
			tempNode = tempNode.getNext();
		}
	}

	public INode<K> searchNode(K key) {
		INode tempNode = head;
		while (tempNode != null) {
			if (tempNode.getKey() == key)
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
	public INode<K> searchKey(K key) {
		if (head == null) {
			return null;
		}
		INode tempnode = head;
		int index = 1;
		while (tempnode != null) {

			if (tempnode.getKey().equals(key)) {
				return tempnode;
			}
			index++;
			tempnode = tempnode.getNext();

		}
		return null;
	}
	
	public int size() {
		int size = 0;
		INode<K> tempNode = head;
		while (tempNode != null) {
			size++;
			tempNode = tempNode.getNext();
		}
		return size;
	}

	public int searchKeyIndex(K key) {
		int l = length();
		if (head == null) {
			return -1;
		} else {
			INode temp = head;
			int cnt = 0;
			while (temp != null) {
				if (temp.getKey().equals(key)) {
					System.out.println(key + " Fount at " + cnt);
					return cnt;
				}
				cnt++;
				temp = temp.getNext();
			}

		}
		return -2;
	}
	
	private int length() {
		INode temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.getNext();
		}
		return count;
	}

	public void deleteKey(K key) {
		if (head == null) {
			return;
		}
		int pos = searchKeyIndex(key);
		if (pos == 0) {
			pop();
		} else if (pos == length() - 1) {
			popLast();
		} else if (pos > 0 && pos < length() - 1) {
			INode temp = head;
			INode temp2 = head.getNext();
			while (temp2 != null) {
				temp2 = temp2.getNext();
				if (pos == 1) {
					INode temp3 = temp.getNext();
					temp.setNext(temp2);
					return;
				}
				temp = temp.getNext();
				pos--;
			}
		} else {
			System.out.println("No such key in linked list");
			return;
		}
	}
}
