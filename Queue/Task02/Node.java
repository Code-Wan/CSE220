package Queue.Task02;

public class Node {
    Object elem;
    Node next;

    // DO NOT CHANGE THIS CONSTRUCTOR
    public Node(Object elem, Node next) {
        this.elem = elem;
        this.next = next;
    }

    public Node(Object elem) {
        this.elem = elem;
    }
}
