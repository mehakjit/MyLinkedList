package com.capg;

	public class MyMapNode<K, V> implements INode<K> {
		K key;
		V value;
		MyMapNode<K, V> next;

		public MyMapNode(K key, V value) {
			this.key = key;
			this.value = value;
			next = null;

		}

		@Override
		public String toString() {
			StringBuilder mymapnodestring = new StringBuilder();
			mymapnodestring.append(" MyMapNode{ " + "K=").append(key).append(" V=").append(value).append(" }").append(next);
			if (next != null)
				mymapnodestring.append("->").append(next);
			return mymapnodestring.toString();
		}

		@Override
		public K getKey() {
			return key;
		}

		@Override
		public void setKey(K key) {
			this.key = key;			
		}

		@Override
		public INode getNext() {
			return next;
		}

		@Override
		public void setNext(INode next) {
			this.next = (MyMapNode<K, V>) next;			
		}
		
		public V getvalue() {
			return this.value;
		}

		public void setvalue(V value) {
			this.value = value;
		}

}
