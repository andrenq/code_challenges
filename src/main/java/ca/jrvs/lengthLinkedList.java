package ca.jrvs;

public class lengthLinkedList {
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
