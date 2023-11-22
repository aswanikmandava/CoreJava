package src.recursion;

import java.util.LinkedList;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        next = null;
    }
}

// finds the length of a linked list (number of nodes in it)
public class LinkedListLength {
    public static int getNodeCount(Node head) { // non-recursive approach
        Node tmp = head;
        int count = 0;
        while (tmp != null) {
            tmp = tmp.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.push(1);
        ls.push(4);
        ls.push(9);
        // TODO: still work to be done
        // System.out.println("Count of nodes: ");
    }
}
