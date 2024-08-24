package SinglyLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        Util util = new UtilImpl();

        while (true) {
            System.out.println("\n------------------------------------------------");
            System.out.println("Available Options:");
            System.out.println("0 to insert demo nodes");
            System.out.println("1 to insert at first");
            System.out.println("2 to insert at last");
            System.out.println("3 to insert in order");
            System.out.println("4 to display the linked list");
            System.out.println("5 to exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 0:
                    util.insertAtFirst(50);
                    util.insertAtFirst(40);
                    util.insertAtFirst(30);
                    util.insertAtFirst(20);
                    util.insertAtFirst(10);
                    System.out.print("Demo values inserted");
                    break;

                case 1:
                    System.out.print("Enter the value: ");
                    util.insertAtFirst(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter the value: ");
                    util.insertAtLast(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter the value: ");
                    util.insertInOrder(sc.nextInt());
                    break;

                case 4:
                    util.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
