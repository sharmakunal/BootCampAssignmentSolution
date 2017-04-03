package l12;

import java.util.ArrayList;

public class Map<K, V> {
	private static class Node<K, V> {
		K key;
		V value;
		Node<K, V> next;
	}
	private ArrayList<Node<K, V>> bucket;
	private int numBuckets;
	int size;
	public Map() {
		bucket = new ArrayList<>();
		numBuckets = 20;
		for (int i = 0; i < numBuckets; i++) {
			bucket.add(null);
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return getSize() == 0;
	}
//	
//	public boolean containsKey(K key) {
//		
//	}
	
	public V remove(K key) {
		int index = getBucketIndex(key);
		Node<K,V> head = bucket.get(index);
		Node<K,V> prev = null;
		while (head != null) {
			if (head.key.equals(key)) {
				break;
			}
			prev = head;
			head = head.next;
		}
		if (head == null) {
			return null;
		} else {
			size--;
			if (prev == null) {
				bucket.set(index, head.next);
			} else {
				prev.next = head.next;
			}
			return head.value;
		}
	}
	
	private int getBucketIndex(K key) {
		int bucketIndex = key.hashCode() % numBuckets;
		return bucketIndex;
	}
	
	private void rehash() {
		numBuckets *= 2;
		ArrayList<Node<K, V>> temp = bucket;
		bucket = new ArrayList<>();
		for (int i = 0; i < numBuckets; i++) {
			bucket.add(null);
		}
		size = 0;
		for (Node<K, V> head : temp) {
			while (head != null) {
				put(head.key, head.value);
				head = head.next;
			}
		}
	}
	
	public void put(K key, V value) {
		int index = getBucketIndex(key);
		Node<K,V> head = bucket.get(index);
		while (head != null) {
			if (head.key.equals(key)) {
				break;
			}
			head = head.next;
		}
		if (head != null) {
			head.value = value;
		} else {
			size++;
			Node<K,V> newNode = new Node<>();
			newNode.key = key;
			newNode.value = value;
			newNode.next = bucket.get(index);
			bucket.set(index, newNode);
			if ((1.0*size)/numBuckets > 0.7) {
				rehash();
			}
		}
	}
	
	public V get(K key) {
		int index = getBucketIndex(key);
		Node<K,V> head = bucket.get(index);
		while (head != null) {
			if (head.key.equals(key)) {
				break;
			}
			head = head.next;
		}
		if (head == null) {
			return null;
		} else {
			return head.value;
		}
		
	}
	
}
