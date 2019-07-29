package ca.jrvs;

/**
 * Find the length of a singly linked list
 * Using the MyLinkedList class created previously
 * https://java2blog.com/find-length-of-linked-list-in-java/
 */

public class LengthLinkedList {
    public static int findLengthLinkedList(MyLinkedList myLinkedList){
        MyLinkedList.Node currNode = myLinkedList.head, prev = null;
        if(currNode==null){
            return 0;
        }
        int total =1;
        while(currNode.next!= null){
            total+=1;
            currNode = currNode.next;
        }
        return total;
    }
}
