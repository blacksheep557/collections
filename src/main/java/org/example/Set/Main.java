package org.example.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    static void main() {
        Set<String> set = new HashSet<String>();// no order is maintained. Backed by HashMap internally
        Set<String> set2 = new LinkedHashSet<String>();// maintains insertion order. Backed by HashMap internally with a doubly linked list to maintain order
        Set<String> set3 = new TreeSet<String>();// sorted order is maintained. Backed by Red-Black Tree (Balanced BST)
    }
}
