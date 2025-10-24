package org.example.List;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    static void main() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        boolean containsOne = list.contains(1);
        LinkedList<Integer> list2 = new LinkedList<>(); // doubly linked list
        list2.addFirst(1);

        for (Integer integer : list2) {
            System.out.println(integer);
            list2.add(integer); // ConcurrentModificationException
        }

        // synchronised
        Vector<Integer> vector = new Vector<>(); //basic array, thread safe
        Stack<Integer> stack = new Stack<>(); // LIFO, extends Vector
        stack.push(1);
        stack.push(2);
        stack.pop();
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>(); // thread safe, creates a new copy on modification
    }
}
