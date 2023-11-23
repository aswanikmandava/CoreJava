package src.recursion;

// finds the length of a linked list (number of nodes in it)
public class LinkedListLength {
    static class Node {
        int value;
        Node next;
    }

    public static int getNodeCount(Node head) {
        if (head == null) {
            return 0;
        }
        return getNodeCount(head.next) + 1;
    }
    public static int getNodeCountIterative(Node head) { // non-recursive approach
        Node tmp = head;
        int count = 0;
        while (tmp != null) {
            tmp = tmp.next;
            count++;
        }
        return count;
    }

    static Node insertAtHead(Node t_head, int new_val) {
        Node n = new Node();
        n.next = t_head;
        n.value = new_val;
        t_head = n;
        return t_head;
    }

    public static void main(String[] args) {
        // Empty Linked List
        Node head = null;

        // Linked List = 1->2->3->4->5
        head = insertAtHead(head, 5);
        head = insertAtHead(head, 4);
        head = insertAtHead(head, 3);
        head = insertAtHead(head, 2);
        head = insertAtHead(head, 1);

        // Print the original Linked List
        System.out.println("Linked List: ");
        for (Node i = head; i != null; i = i.next) {
            System.out.print(i.value + " ");
        }
        System.out.println("Node count: " + getNodeCountIterative(head));
        System.out.println("Node count: " + getNodeCount(head));
    }
}
