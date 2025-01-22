class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Hello {
    Node head;

    // Function to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse current node's pointer
            prev = current;      // Move pointers one step forward
            current = next;
        }
        head = prev; // Update head to the new front
    }

    // Function to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Function to add a new node at the end
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void main(String[] args) {
        Hello list = new Hello();

        // Adding nodes to the linked list
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);

        System.out.println("Original Linked List:");
        list.printList();

        // Reversing the linked list
        list.reverse();

        System.out.println("Reversed Linked List:");
        list.printList();
    }
}
