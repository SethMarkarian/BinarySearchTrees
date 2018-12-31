public abstract class BinaryTree<E> implements Tree<E>
{
    protected BinaryNode<E> root;
    public BinaryTree() { //creates new binary tree with a null root
        root = null;
    }

    public BinaryTree(E rootItem) { //creates new binary tree with rootItem as the root
        root = new BinaryNode(rootItem, null, null);
    }

    public BinaryNode<E> getRoot() { //returns root of the binary tree
        return root;
    }

    public int size() { //returns size of tree
        return BinaryNode.size(root);
    }

    public int height() { //returns height of tree
        return BinaryNode.height(root);
    }

    public String preOrderString() { //returns pre order of the tree
        String s = "";
        if(root.getElement() != null) {
            s += root.preOrderString();
        }
        return s; 
    }

    public String postOrderString() { //returns post order of the tree
        String s = "";
        if(root.getElement() != null) {
            s += root.postOrderString();
        }
        return s;
    }

    public String inOrderString() { //returns in order of the tree
        String s = "";
        if(root.getElement() != null) {
            s += root.inOrderString();
        }
        return s;
    }

    public int numOfElementsDepth(int i) { //returns the number of elements at a certain depth on the tree
        int num = numOfElementsDepthHelper(i, root);
        return num;
    }
    
    public int numOfElementsDepthHelper(int i, BinaryNode<E> root) { //helps above method with recursive calls
        if(root.getElement() == null || i == 0) {
            return 0;
        }
        else {
            return 1 + numOfElementsDepthHelper(i - 1, root.getLeft()) + numOfElementsDepthHelper(i - 1, root.getRight());
        }
    }

    public void empty() { //empties tree
        root = null;
    }

    public boolean isEmpty() { //check to see if tree is empty
        return root == null;
    }

    public void merge(E rootItem, BinaryTree<E> t1, BinaryTree<E> t2) { //merges two trees together
        if(t1.root == t2.root && t1.root != null) {
            throw new IllegalArgumentException();
        }
        root = new BinaryNode<E>(rootItem, t1.root, t2.root);
        if(this != t1) {
            t1.root = null;
        }
        if(this != t2) {
            t2.root = null;
        }
    }

    public abstract boolean insert(E e);

    public abstract boolean contains(E e);

    public abstract E findMax();

    public abstract E findMin();
}
