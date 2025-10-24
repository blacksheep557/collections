package org.example.Queue;

import java.util.*;

public class Main {
    static void main() {
        Queue<Integer> q = new LinkedList<Integer>(); // Creating a Queue with a linked list
        q.add(1);
        q.remove();
        Queue<Integer> q2 = new PriorityQueue<>(); // Creating a Priority Queue by default min heap
        Queue<Integer> q3 = new PriorityQueue<>((a,b) -> b - a); // Creating a max heap with custom comparator with functional interface of the compare method
        ArrayDeque<Integer> a = new ArrayDeque<>();// Creating a double ended queue by circular array
    }
}