package com.capg;

import java.util.ArrayList;

public class MyHashMapPara<K, V> {
	private final int numbuckets;
	ArrayList<MyLinkedList<K>> mybucketarray;

	public MyHashMapPara() {
		this.numbuckets = 10;
		this.mybucketarray = new ArrayList<>(numbuckets);

		for (int i = 0; i < numbuckets; i++) {
			this.mybucketarray.add(null);
		}
	}

	public V get(K key) {
		int index = this.getbucketindex(key);
		MyLinkedList<K> mylist = this.mybucketarray.get(index);
		if (mylist == null)
			return null;
		MyMapNode<K, V> mymapnode = (MyMapNode<K, V>) mylist.searchKey(key);
		return (mymapnode == null) ? null : mymapnode.getvalue();
	}

	private int getbucketindex(K key) {

		int hashcode = Math.abs(key.hashCode());
		int index = hashcode % numbuckets;
		// System.out.println("Key: " + key + " Hashcode: " + hashcode + " Index: " +
		// index);
		return index;
	}

	public void add(K key, V value) {
		int index = this.getbucketindex(key);
		MyLinkedList<K> mylist = this.mybucketarray.get(index);
		if (mylist == null) {
			mylist = new MyLinkedList<>();
			this.mybucketarray.set(index, mylist);
		}
		MyMapNode<K, V> mymapnode = (MyMapNode<K, V>) mylist.searchKey(key);
		if (mymapnode == null) {
			mymapnode = new MyMapNode<>(key, value);
			mylist.append(mymapnode);
		} else
			mymapnode.setvalue(value);
	}

	public void remove(K key) {
		int index = this.getbucketindex(key);
		MyLinkedList<K> myLinkedList = this.mybucketarray.get(index);
		if (myLinkedList == null) {
			System.out.println("no such key to remove");
		} else {
			myLinkedList.deleteKey(key);
		}
	}

	@Override
	public String toString() {
		return "MyHashMapPara{ " + mybucketarray + " }";

	}
}