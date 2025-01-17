package ca.jrvs;

/**
 * Java program to implement
 * a Singly Linked List
 *
 * https://www.yuque.com/zhujinpei/leecode/ugxpu9
 */

public class MyLinkedList {

    Node head; // head of list

    // **************INSERTION**************
    public static MyLinkedList insert(MyLinkedList list, int data) {
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }
        return list;
    }

    // **************TRAVERSAL**************
    // Method to print the MyLinkedList.
    public static void printList(MyLinkedList list) {
        Node currNode = list.head;
        System.out.print("\nMyLinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
        System.out.println("\n");
    }

    // **************DELETION BY KEY**************
    // Method to delete a node in the LinkedList by KEY
    public static MyLinkedList deleteByKey(MyLinkedList list, int key) {
        // Store head node
        Node currNode = list.head, prev = null;

        // CASE 1:
        // If head node itself holds the key to be deleted

        if (currNode != null && currNode.data == key) {
            list.head = currNode.next; // Changed head

            // Display the message
            System.out.println(key + " found and deleted");
            return list;
        }

        // CASE 2:
        // If the key is somewhere other than at head//
        // Search for the key to be deleted,
        // keep track of the previous node
        // as it is needed to change currNode.next
        while (currNode != null && currNode.data != key) {
            // If currNode does not hold key
            // continue to next node
            prev = currNode;
            currNode = currNode.next;
        }

        // If the key was present, it should be at currNode
        // Therefore the currNode shall not be null
        if (currNode != null) {
            // Since the key is at currNode
            // Unlink currNode from linked list
            prev.next = currNode.next;

            // Display the message
            System.out.println(key + " found and deleted");
        }

        // CASE 3: The key is not present
        // If key was not present in linked list
        // currNode should be null
        if (currNode == null) {
            // Display the message
            System.out.println(key + " not found");
        }

        return list;
    }

    // Method to delete a node in the MyLinkedList by POSITION
    public static MyLinkedList deleteAtPosition(MyLinkedList list, int index) {
        // Store head node
        Node currNode = list.head, prev = null;

        // CASE 1:
        // If index is 0, then head node itself is to be deleted

        if (index == 0 && currNode != null) {
            list.head = currNode.next; // Changed head

            // Display the message
            System.out.println(index + " position element deleted");

            // Return the updated List
            return list;
        }

        // CASE 2:
        // If the index is greater than 0 but less than the size of LinkedList
        // The counter
        int counter = 0;

        // Count for the index to be deleted,
        // keep track of the previous node
        // as it is needed to change currNode.next
        while (currNode != null) {

            if (counter == index) {
                // Since the currNode is the required position
                // Unlink currNode from linked list
                prev.next = currNode.next;

                // Display the message
                System.out.println(index + " position element deleted");
                break;
            } else {
                // If current position is not the index
                // continue to next node
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }

        // If the position element was found, it should be at currNode
        // Therefore the currNode shall not be null

        // CASE 3: The index is greater than the size of the LinkedList
        // In this case, the currNode should be null
        if (currNode == null) {
            // Display the message
            System.out.println(index + " position element not found");
        }

        // return the List
        return list;
    }

    // **************DELETION AT A POSITION**************

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }


}
