package SinglyLinkedList;

/**
 * An interface for singly linked list operations.
 */
public interface Util {

    /**
     * Inserts a new node at the beginning of the list.
     * 
     * @param val the value to be inserted
     */
    void insertAtFirst(int val);

    /**
     * Inserts a new node at the end of the list.
     * 
     * @param val the value to be inserted
     */
    void insertAtLast(int val);

    /**
     * Inserts a new node in the list order wise.
     * 
     * @param val the value to be inserted
     */
    void insertInOrder(int val);

    /**
     * Displays all the nodes in the linked list.
     */
    void display();

    /*
     * Returns the first node of the list.
     */
    Node getFirst();

    /*
     * Removes a node of given value from the list.
     */
    void remove(int val);
}
