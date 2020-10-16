package com.capg;

public class MyHashMap<K, V> {
	MyLinkedList<K> mylist;

	public MyHashMap() {
		this.mylist = new MyLinkedList<>();
	}

	public V get(K key) {
		MyMapNode<K, V> mymapnode = (MyMapNode<K, V>) this.mylist.searchKey(key);
		return (mymapnode == null) ? null : mymapnode.getvalue();

	}

	public void add(K key, V value) {
		MyMapNode<K, V> mymapnode = (MyMapNode<K, V>) this.mylist.searchKey(key);
		if (mymapnode == null) {
			mymapnode = new MyMapNode<>(key, value);
			this.mylist.append(mymapnode);

		} else {
			mymapnode.setvalue(value);
		}
	}

	@Override
	public String toString() {
		return "M{ " + mylist + '}';
	}

}

