// different insertion methods in linked list
public class pmg1 {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    // insert node at the beginning of the linked list
    public void startAdd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
    }

    // insert after a given node
    public void addAfter(Node prev_node, int data) {
        if (prev_node == null) {
            System.err.println("The previous node can't be null");
            return;
        } else {
            Node newNode = new Node(data);
            newNode.next = prev_node.next;
            prev_node.next = newNode;
        }
    }

    // insert at the end of the linked list
    public void addEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = new Node(data);
            return;
        }
        newNode.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        return;
    }

    public void display() {
        Node cur = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            while (cur != null) {
                System.out.println(cur.data + " ");
                cur = cur.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pmg1 llist = new pmg1();
        llist.startAdd(1);
        llist.startAdd(2);
        llist.startAdd(3);
        llist.addAfter(llist.head.next, 5);
        llist.addEnd(50);
        llist.display();
    }
}