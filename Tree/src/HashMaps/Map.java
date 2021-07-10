package HashMaps;

import java.util.ArrayList;

public class Map<K,V> {
	ArrayList<MapNode<K,V>> buckets;
	int count;
	int noOfBuckets;
	
	public Map() {
		buckets = new ArrayList<>();
		noOfBuckets = 5;
		
		for(int i=0;i<noOfBuckets;i++) {
			buckets.add(null);
		}
	}
	
	public int size() {
		return count;
	}
	private int getIndex(K key) {
		int hc = key.hashCode();
		int index = hc % noOfBuckets;
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
		double loadFactor = (1.0*count) / noOfBuckets;
		if(loadFactor > 0.7) {
			rehash();
		}
	}
	
	public double loadFactor() {
		return (1.0*count) / noOfBuckets;
	}
	
	private void rehash() {
		ArrayList<MapNode<K, V>> temp = buckets;
		buckets = new ArrayList<>();
		for(int i=0; i < 2*noOfBuckets;i++) {
			buckets.add(null);
		}
		
		count = 0;
		noOfBuckets = noOfBuckets*2;
		
		for(int i=0;i < temp.size();i++) {
			MapNode<K, V> head = temp.get(i);
			while(head != null) {
				K key = head.key;
				V value = head.value;
				insert(key, value);
				head = head.next;
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

	
	public V remove(K key) {
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
