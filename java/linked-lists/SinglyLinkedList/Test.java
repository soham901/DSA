package SinglyLinkedList;

public class Test {

    public static void main(String[] args) {
        testInsertAtFirst();
        System.out.println("--------------------------------------------");
        testInsertAtLast();
        System.out.println("--------------------------------------------");
        testInsertInOrder();
        System.out.println("--------------------------------------------");
        testRemove();
        System.out.println("--------------------------------------------");
        testCountNodes();
        System.out.println("--------------------------------------------");
        testDisplay();
    }

    // Test case for inserting at the first position
    public static void testInsertAtFirst() {
        Util util = new UtilImpl();

        util.insertAtFirst(10);
        util.insertAtFirst(20);
        util.insertAtFirst(30);

        System.out.println("Test: Insert at First");
        String result = listToString((UtilImpl) util);
        String expected = "30 -> 20 -> 10";
        assertResult(result, expected);
    }

    // Test case for inserting at the last position
    public static void testInsertAtLast() {
        Util util = new UtilImpl();

        util.insertAtLast(10);
        util.insertAtLast(20);
        util.insertAtLast(30);

        System.out.println("Test: Insert at Last");
        String result = listToString((UtilImpl) util);
        assertResult(result, "10 -> 20 -> 30");
    }

    // Test case for inserting in ordered list
    public static void testInsertInOrder() {
        Util util = new UtilImpl();

        util.insertAtLast(10);
        util.insertAtLast(20);
        util.insertAtLast(30);

        util.insertInOrder(22);

        System.out.println("Test: Insert in Order");
        String result = listToString((UtilImpl) util);
        assertResult(result, "10 -> 20 -> 22 -> 30");
    }

    // Test case for displaying the list
    public static void testDisplay() {
        Util util = new UtilImpl();

        util.insertAtFirst(10);
        util.insertAtLast(20);
        util.insertAtLast(30);

        System.out.println("Test: Display List");
        util.display();
    }

    // Test case for removing a node
    public static void testRemove() {
        Util util = new UtilImpl();

        util.insertAtFirst(10);
        util.insertAtLast(20);
        util.insertAtLast(30);
        util.insertAtLast(40);
        util.insertAtLast(50);

        // remove a node with value 30
        util.remove(30);
        System.out.println("Test: Remove 30");
        String result = listToString((UtilImpl) util);
        String expected = "10 -> 20 -> 40 -> 50";
        assertResult(result, expected);

        // remove first node
        util.remove(10);
        System.out.println("Test: Remove 10");
        result = listToString((UtilImpl) util);
        expected = "20 -> 40 -> 50";
        assertResult(result, expected);

        // remove last node
        util.remove(50);
        System.out.println("Test: Remove 50");
        result = listToString((UtilImpl) util);
        expected = "20 -> 40";
        assertResult(result, expected);
    }

    // Test case for counting the number of nodes
    public static void testCountNodes() {
        Util util = new UtilImpl();

        util.insertAtFirst(10);
        util.insertAtLast(20);
        util.insertAtLast(30);

        System.out.println("Test: Count Nodes");
        int result = util.countNodes();
        int expected = 3;
        assertResult(String.valueOf(result), String.valueOf(expected));

        // count empty list
        util = new UtilImpl();
        result = util.countNodes();
        expected = 0;
        assertResult(String.valueOf(result), String.valueOf(expected));
    }

    private static String listToString(UtilImpl util) {
        Node current = util.getFirst();
        StringBuilder sb = new StringBuilder();
        while (current != null) {
            sb.append(current.data);
            if (current.link != null) {
                sb.append(" -> ");
            }
            current = current.link;
        }
        return sb.toString();
    }

    private static void assertResult(String result, String expected) {
        if (result.equals(expected)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL: Expected [" + expected + "] but got [" + result + "]");
            System.exit(0);
        }
    }
}
