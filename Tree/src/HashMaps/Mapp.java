package HashMaps;

import java.util.ArrayList;

public class Mapp<K, V> {
	ArrayList<MapNode<K, V>> buckets;
	int count;
	int numBuckets;
	
	public Mapp() {
		buckets = new ArrayList<>();
		for(int i=0;i<numBuckets;i++) {
			buckets.add(null);
		}
		count =0;
		numBuckets = 5;
	}
	
	public int size() {
		return count;
	}
	
	private int getIndex(K key) {
		int hc = key.hashCode();
		int index = hc%numBuckets;
		return index;
	}
	public void insert(K key, V value) {
		int bucketIndex = getIndex(key);
		MapNode<K, V> head = buckets.get(bucketIndex);
		
		while(head != null) {
			if(head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		
		head = buckets.get(bucketIndex);
		MapNode<K, V> newNode = new MapNode<>(key, value);
		newNode.next = head;
		buckets.set(bucketIndex, newNode);
		count++;
		double loadFActor = (1.0*count) % numBuckets;
		if(loadFActor > 0.7) {
			reHash();
		}
	}
	public double loadFactor() {
		return (1.0*count)/numBuckets;
	}
	private void reHash() {
		ArrayList<MapNode<K, V>> temp = buckets;
		buckets = new ArrayList<>();
		for(int i=0;i<2*numBuckets;i++) {
			buckets.add(null);
		}
		
		numBuckets = 2*numBuckets;
		count =0;
		
		for(int i=0;i<temp.size();i++) {
			MapNode<K, V> node = temp.get(i);
			while(node!= null) {
			 K key = node.key;
			 V value = node.value;
			insert(key, value);
			node = node.next;
			}
		}
	}
	
	public V getValue(K key) {
		int bucketIndex = getIndex(key);
		MapNode<K, V> head = buckets.get(bucketIndex);
		while(head != null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		return null;
	}
	
	public V removeKey(K key) {
		int bucketIndex = getIndex(key);
		MapNode<K, V> head = buckets.get(bucketIndex);
		MapNode<K, V> prev = null;
		
		while(head != null) {
			if(head.key.equals(key)) {
				if(prev != null) {
					prev.next = head.next;
				}else {
					buckets.set(bucketIndex, head.next);
				}
				count--;
				return head.value;
			}
			prev = head;
			head = head.next;
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
}
