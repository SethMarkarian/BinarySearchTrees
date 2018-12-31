public interface Tree<E>
{
    boolean insert(E e);
    boolean contains(E e);
    int numOfElementsDepth(int i);
    E findMax();
    E findMin();
    String preOrderString();
    String postOrderString();
    String inOrderString();
    void empty();
    boolean isEmpty();
}
