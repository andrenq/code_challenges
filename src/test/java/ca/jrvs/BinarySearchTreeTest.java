package ca.jrvs;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    BinarySearchTree tree = new BinarySearchTree();
    @Before
    public void setUp() throws Exception {
            /* Let us create following BST
                    50
                 /     \
                /       \
               /         \
              30          70
             /  \        /  \
           20   40      60   80
                  \
                    45              */

        tree.insert(50); /*root*/
        tree.insert(30); /*left*/
        tree.insert(20); /*left, left*/
        tree.insert(40); /*left,right*/
        tree.insert(70); /*right*/
        tree.insert(80); /*right, right*/
        tree.insert(60); /*right,left*/
        tree.insert(45); /*left, right, right*/
    }

    @Test
    public void BinarySearchTreeTest1(){
        assertEquals(45,tree.root.left.right.right.key);
    }
    @Test
    public void BinarySearchTreeTest2(){
        assertEquals(60,tree.root.right.left.key);

    }
    @Test
    public void BinarySearchTreeTest3(){
        assertEquals(80,tree.root.right.right.key);

    }

}