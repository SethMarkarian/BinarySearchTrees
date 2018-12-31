public class BinaryNode<E> 
{
    private E element;
    private BinaryNode<E> left;
    private BinaryNode<E> right;
    public BinaryNode() { //creates new empty binary node
        this(null, null, null); 
    }

    public BinaryNode(E theElement, BinaryNode<E> lt, BinaryNode<E> rt) { //creates a new binary node with a left and right node
        element = theElement;
        left = lt;
        right = rt; 
    }

    public E getElement() { //retuns element of the node
        return element; 
    }

    public BinaryNode<E> getLeft() { //returns left node
        return left;
    }

    public BinaryNode<E> getRight() { //retuns right node
        return right; 
    }
    
    public void setElement(E x) { //sets element of the node
        element = x; 
    }

    public void setLeft(BinaryNode<E> t) { //sets left node
        left = t; 
    }

    public void setRight(BinaryNode<E> t) { //sets right node
        right = t; 
    }

    public static <E> int size(BinaryNode<E> t) { //returns size under node
        if(t == null) {
            return 0;
        }
        else {
            return 1 + size(t.left) + size(t.right);
        }
    }

    public static <E> int height(BinaryNode<E> t) { //returns height under node
        if(t == null) {
            return -1;
        }
        else {
            return 1 + Math.max(height(t.left), height(t.right));
        }
    }

    public BinaryNode<E> duplicate() { //creates duplicate of the node
        BinaryNode<E> root = new BinaryNode<E>(element, null, null);
        if(left != null) {
            root.left = left.duplicate();
        }
        if(right != null) {
            root.right = right.duplicate();
        }
        return root;
    }

    public String preOrderString() { //returns pre order of the node
        String s = element.toString();
        if(left.getElement() != null) {
            s += left.preOrderString();
        }
        if(right.getElement() != null) {
            s += right.preOrderString();
        }
        return s;
    }

    public String postOrderString() { //returns post order of the node
        String s = "";
        if(left.getElement() != null) {
            s += left.postOrderString();
        }
        if(right.getElement() != null) {
            s += right.postOrderString();
        }
        s += element.toString();
        return s;
    }

    public String inOrderString() { //returns in order of the node
        String s = "";
        if(left.getElement() != null) {
            s += left.postOrderString();
        }
        s += element.toString();
        if(right.getElement() != null) {
            s += right.postOrderString();
        }
        return s;
    }
}