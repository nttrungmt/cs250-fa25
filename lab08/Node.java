package lab08;
// Node class for a generic linked list
class Node<T> {
    T data;         // The data stored in the node
    Node<T> next;   // The next node in the linked list

    // Constructor to create a new node
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
