package LAB02;

public class LabTask2 {
    public static Node wordDecoder(Node head) {
        int count = count(head);
        int n = 13 % count;
        Node Dummy = new Node(null);
        if (n == 0) {
            return Dummy;
        }

        Node current = head;
        int index = 0;
        while (current != null) {
            if (index != 0 && index % n == 0) {

                Node newNode = new Node(current.elem, Dummy.next);
                Dummy.next = newNode;

            }
            current = current.next;
            index++;
        }

        return Dummy;
    }

    public static int count(Node head) {
        int count = 0;
        Node n = head;
        while (n != null) {
            count++;
            n = n.next;
        }
        return count;
    }

    // NOTE: if you find any issue with the driver code please inform AIB
    // DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args) {
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[] { 'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C' });
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println("Your output: ");
        LinkedList.printLL(result); // This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[] { 'Z', 'O', 'T', 'N', 'X' });
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println("Your output: ");
        LinkedList.printLL(result); // This should print null -> N
        System.out.println();
    }
}
