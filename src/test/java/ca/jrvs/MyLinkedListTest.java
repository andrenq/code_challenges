package ca.jrvs;

import org.junit.Before;
import org.junit.Test;

import static ca.jrvs.MyLinkedList.*;

public class MyLinkedListTest {

    MyLinkedList myLinkedList = new MyLinkedList();


    @Before
    public void setUp() throws Exception {
        myLinkedList = insert(myLinkedList, 1);
        myLinkedList = insert(myLinkedList, 2);
        myLinkedList = insert(myLinkedList, 3);
        myLinkedList = insert(myLinkedList, 4);
        myLinkedList = insert(myLinkedList, 5);
        myLinkedList = insert(myLinkedList, 6);
        myLinkedList = insert(myLinkedList, 7);
        myLinkedList = insert(myLinkedList, 8);
        myLinkedList = insert(myLinkedList, 9);
        // Print the MyLinkedList
        printList(myLinkedList);
    }

    @Test
    public void toStringTest() {
        {
            // Delete node with value 1
            deleteByKey(myLinkedList, 1);

            // Print the LinkedList
            printList(myLinkedList);

            // Delete node with value 4
            deleteByKey(myLinkedList, 4);

            // Print the LinkedList
            printList(myLinkedList);

            // Delete node with value 10
            deleteByKey(myLinkedList, 10);
            printList(myLinkedList);


            // Delete node at position 0
            deleteAtPosition(myLinkedList, 0);
            printList(myLinkedList);

            // Delete node at position 2
            deleteAtPosition(myLinkedList, 2);
            printList(myLinkedList);

            // Delete node at position 10
            deleteAtPosition(myLinkedList, 10);
            printList(myLinkedList);
        }

    }

}