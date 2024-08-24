package SinglyLinkedList;

public class Test {

    public static void main(String[] args) {
        testInsertAtFirst();
        System.out.println("--------------------------------------------");
        testInsertAtLast();
        System.out.println("--------------------------------------------");
        testInsertInOrder();
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
