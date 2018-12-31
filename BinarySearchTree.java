public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E>
{
    private boolean insertAns;
    private boolean containsAns;
    private BinaryNode<E> maxNode;
    private BinaryNode<E> minNode;
    public BinarySearchTree(E rootItem) { //creates new binary search tree
        root = new BinaryNode<E>(rootItem, new BinaryNode<E>(), new BinaryNode<E>());
    }

    public boolean insert(E rootItem) { //inserts new rootItem into tree
        insertHelper(rootItem, root);
        return insertAns;
    }

    public void insertHelper(E rootItem, BinaryNode<E> n) { //helps recursively call above method
        if(n.getElement() == null) {
            n.setElement(rootItem);
            n.setLeft(new BinaryNode());
            n.setRight(new BinaryNode());
            insertAns = true;
        }
        else if(rootItem.compareTo(n.getElement()) < 0) {
            insertHelper(rootItem, n.getLeft());
        }
        else if(rootItem.compareTo(n.getElement()) > 0) {
            insertHelper(rootItem, n.getRight());
        }
        else {
            insertAns = false;
            return;
        }
    }

    public boolean contains(E e) { //checks to see if an element is present
        containsHelper(e, root);
        return containsAns;
    }
    
    public void containsHelper(E e, BinaryNode<E> n) { //helps recusively call above method
        if(n.getElement() == null) {
            containsAns = false;
        }
        else if(e.compareTo(n.getElement()) < 0) {
            containsHelper(e, n.getLeft());
        }
        else if(e.compareTo(n.getElement()) > 0) {
            containsHelper(e, n.getRight());
        }
        if(e.equals(n.getElement())) {
            containsAns = true;
            return;
        }
    }

    public E findMax() { //finds maximum element in the tree
        findMaxHelper(root);
        return maxNode.getElement();
    }
    
    public void findMaxHelper(BinaryNode<E> n) { //helps recursively call above method
        if(n.getRight().getElement() == null) {
            maxNode = n;
        }
        else {
            findMaxHelper(n.getRight());
        }
    }

    public E findMin() { //finds minimum element in the tree
        findMinHelper(root);
        return minNode.getElement();
    }
    
    public void findMinHelper(BinaryNode<E> n) { //helps recusively call above method
        if(n.getLeft().getElement() == null) {
            minNode = n;
        }
        else {
            findMinHelper(n.getLeft());
        }
    }
}
