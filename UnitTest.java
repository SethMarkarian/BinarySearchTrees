import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UnitTest
{
    @Test
    public void testGetElement() {
        BinaryNode<Integer> bn = new BinaryNode(10, null, null);
        int theAns = bn.getElement();
        int trueAns = 10;
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testGetLeftElement() {
        BinaryNode<Integer> bn = new BinaryNode(10, new BinaryNode(1, null, null), new BinaryNode(2, null, null));
        int theAns = bn.getLeft().getElement();
        int trueAns = 1;
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testGetLeftElementNull() {
        BinaryNode<Integer> bn = new BinaryNode(10, null, new BinaryNode(2, null, null));
        Object theAns = bn.getLeft();
        Object trueAns = null;
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testGetRightElement() {
        BinaryNode<Integer> bn = new BinaryNode(10, new BinaryNode(1, null, null), new BinaryNode(2, null, null));
        int theAns = bn.getRight().getElement();
        int trueAns = 2;
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testGetRightElementNull() {
        BinaryNode<Integer> bn = new BinaryNode(10, new BinaryNode(1, null, null), null);
        Object theAns = bn.getRight();
        Object trueAns = 2;
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testSetLeft() {
        BinaryNode<Integer> bn = new BinaryNode();
        bn.setElement(10);
        bn.setLeft(new BinaryNode(12, null, null));
        int theAns = bn.getLeft().getElement();
        int trueAns = 12;
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testSetRight() {
        BinaryNode<Integer> bn = new BinaryNode();
        bn.setElement(10);
        bn.setRight(new BinaryNode(13, null, null));
        int theAns = bn.getRight().getElement();
        int trueAns = 13;
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testBinaryNodeSize() {
        BinaryNode<Integer> bn = new BinaryNode<Integer>(10, new BinaryNode(1, new BinaryNode(4, null, null), new BinaryNode(5, null, null)), new BinaryNode(2, new BinaryNode(6, null, null), new BinaryNode(7, null, null)));
        int theAns = BinaryNode.size(bn);
        int trueAns = 7;
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testBinaryNodeHeight() {
        BinaryNode<Integer> bn = new BinaryNode<Integer>(10, new BinaryNode(1, new BinaryNode(4, null, null), new BinaryNode(5, null, null)), new BinaryNode(2, new BinaryNode(6, null, null), new BinaryNode(7, null, null)));
        int theAns = BinaryNode.height(bn);
        int trueAns = 2;
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testBinaryNodeDuplicate() {
        BinaryNode<Integer> bn = new BinaryNode(10, null, null);
        BinaryNode<Integer> bnDuplicate = bn.duplicate();
        int theAns = bnDuplicate.getElement();
        int trueAns = 10;
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testBinarySearchTreeInsertTrue() {
        BinarySearchTree<Integer> bst = new BinarySearchTree(10);
        boolean theAns = bst.insert(11);
        boolean trueAns = true;
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testBinarySearchTreeInsertFalse() {
        BinarySearchTree<Integer> bst = new BinarySearchTree(10);
        boolean theAns = bst.insert(10);
        boolean trueAns = false;
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testBinarySearchTreeContains() {
        BinarySearchTree<Integer> bst = new BinarySearchTree(10);
        bst.insert(11);
        boolean theAns = bst.contains(11);
        boolean trueAns = true;
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testBinarySearchTreeFindMax() {
        BinarySearchTree<Integer> bst = new BinarySearchTree(10);
        bst.insert(11);
        bst.insert(9);
        int theAns = bst.findMax();
        int trueAns = 11;
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testBinarySearchTreeFindMin() {
        BinarySearchTree<Integer> bst = new BinarySearchTree(10);
        bst.insert(11);
        bst.insert(9);
        int theAns = bst.findMin();
        int trueAns = 9;
        assertEquals(theAns, trueAns);
    }
}   
