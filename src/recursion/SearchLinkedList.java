package src.recursion;

// Search for a value in the given linked list
// if found, return true else return false
public class SearchLinkedList {

    static class Node {
        int value;
        Node next;
    }

    public static boolean findNode(Node head, int val) {
        if (head == null) {
            return false;
        }
        else if (head.value == val) {
            return true;
        }
        else {
            System.out.println("navigating node - " + head.value);
            return findNode(head.next, val);
        }
    }

    public static boolean findNodeIterative(Node head, int val) {
        for (Node i=head; i!=null; i=i.next) {
            if (i.value == val) {
                return true;
            }
        }
        return false;
    }
    public static Node insertAtHead(Node head, int new_value) {
        Node n = new Node();
        n.next = head;
        n.value = new_value;
        Node temp = n;
        return temp;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertAtHead(head, 10);
        head = insertAtHead(head, 2);
        head = insertAtHead(head, 13);
        head = insertAtHead(head, 27);
        head = insertAtHead(head, 8);
        head = insertAtHead(head, 11);

        // display linked list
        for (Node i=head; i!=null; i=i.next) {
            System.out.print(i.value + " ");
        }
        System.out.println();
        System.out.println("found: " + findNode(head, 26));
        System.out.println("found: " + findNodeIterative(head, 26));
    }
}
