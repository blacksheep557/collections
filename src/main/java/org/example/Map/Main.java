package org.example.Map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    static void main() {
        // internal structure uses an array of buckets. Keys are converted via a Hash Function to get a bucket index. <br>Collision Handling: Uses a Linked List at the bucket index. <br>Java 8+ Optimization: If a bucket exceeds 8 entries, the linked list converts into a Red-Black Tree (Balanced BST). <br>Put/Get (Average): Big O(1). Worst Case (Collision/Tree): Big O(log N) or Big O(N) (pre-Java 8).
        HashMap<Integer, Character> map = new HashMap<>(); // no order is maintained
        map.put(1, 'a');
        LinkedHashMap<Integer, Character> map2 = new LinkedHashMap<>( 10, 2, true); // maintains insertion order and extends HashMap and act as LRU Cache when accessOrder is true
        map2.put(1, 'a');
        map2.put(2, 'b');
        map2.put(3, 'c');
        System.out.println(map2);
        System.out.println(map2.firstEntry());
        map2.get(2);
        System.out.println(map2);
        System.out.println(map2.firstEntry());
        TreeMap<Integer, Character> treeMap = new TreeMap<>(); // sorted order of keys is maintained using Red-Black Tree(balanced BST). Put/Get: Big O(log N). It is just a tree structure
        Hashtable<Integer, Character> hashtable = new Hashtable<>(); // synchronized version of HashMap. It is legacy and not preferred to use. Use ConcurrentHashMap instead.
        ConcurrentHashMap<Integer, Character> concurrentHashMap = new ConcurrentHashMap<>(); // thread-safe version of HashMap. It divides the map into segments to allow concurrent access by multiple threads. Put/Get (Average): Big O(1).
    }
}

class CustomCompare implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return 0;
    }
}