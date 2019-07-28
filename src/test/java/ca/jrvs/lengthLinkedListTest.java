package ca.jrvs;

import org.junit.Before;
import org.junit.Test;

import static ca.jrvs.MyLinkedList.*;
import static ca.jrvs.lengthLinkedList.findLengthLinkedList;
import static org.junit.Assert.*;

public class lengthLinkedListTest {

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
    }
    @Test
    public void findLengthLinkedListTest1() {
        assertEquals(9,findLengthLinkedList(myLinkedList));
    }
    @Test
    public void findLengthLinkedListTest2() {
        deleteAtPosition(myLinkedList,1);
        assertEquals(8,findLengthLinkedList(myLinkedList));
    }
    @Test
    public void findLengthLinkedListTest3() {
        deleteAtPosition(myLinkedList,1);
        deleteAtPosition(myLinkedList,1);
        deleteAtPosition(myLinkedList,1);
        assertEquals(6,findLengthLinkedList(myLinkedList));
    }
}