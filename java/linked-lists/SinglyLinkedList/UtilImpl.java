package SinglyLinkedList;

/**
 * A basic implementation of the Util interface for a singly linked list.
 * 
 * @see Util
 */
public class UtilImpl implements Util {
    private Node first = null;

    @Override
    public void insertAtFirst(int val) {
        // 1. Create a new node
        Node newNode = new Node(val);

        // 2. Set the link to first pointer
        newNode.link = first;

        // 3. Update the first pointer to the new node
        first = newNode;
    }

    @Override
    public void insertAtLast(int val) {
        // 1. Create a new node
        Node newNode = new Node(val);

        // 2. Check if the list is empty
        if (first == null) {
            first = newNode;
        } else {
            Node last = first;

            // 3. Traverse till we find the last node
            while (last.link != null) {
                last = last.link;
            }

            // 4. Update the link of the last node to the new node
            last.link = newNode;
        }
    }

    @Override
    public void insertInOrder(int val) {
        // 1. Create a new node
        Node newNode = new Node(val);

        // 2. Check list is empty or not
        if (first == null) {
            first = newNode;
            return;
        }

        // 3. findout the predicisor
        Node temp = first, pred = first;

        while (temp != null && newNode.data > temp.data) {
            pred = temp;
            temp = temp.link;
        }

        // 4. insert the node in between
        newNode.link = temp;
        pred.link = newNode;
    }

    @Override
    public void display() {
        Node temp = first;

        if (temp == null) {
            System.out.println("List is empty.");
            return;
        }

        // Traverse the list and print each node's data
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.link != null) {
                System.out.print(" -> ");
            }
            temp = temp.link;
        }
        System.out.println();
    }

    @Override
    public Node getFirst() {
        return first;
    }

    @Override
    public void remove(int val) {
        // 1. findout the node
        Node temp = first, pred = null;

        while (temp != null && temp.data != val) {
            pred = temp;
            temp = temp.link;
        }

        // if it's first then
        if (temp == first) {
            first = temp.link;
        }

        // if temp is null then
        else if (temp == null) {
            System.out.println("Node not found");
        }

        // if it's in between
        else {
            pred.link = temp.link;
        }
    }
}
