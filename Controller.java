public class Controller
{
    public static void main(String[] args) { //runs tests
        BinarySearchTree<Integer> BSTInt = new BinarySearchTree<Integer>(Integer.parseInt(args[0]));
        for(int i = 1; i < args.length; i++) {
            BSTInt.insert(Integer.parseInt(args[i]));
        }
        System.out.println("Did it insert " + Integer.parseInt(args[0]) + "? (Already in tree) Ans: " + BSTInt.insert(Integer.parseInt(args[0])));
        System.out.println("Did it find " + 8 + "? (Already in tree) Ans: " + BSTInt.contains(8));
        System.out.println("Did it find " + 7 + "? Ans: " + BSTInt.contains(7));
        System.out.println("Maximum number: " + BSTInt.findMax());
        System.out.println("Minumum number: " + BSTInt.findMin());
        System.out.println("PreOrder: " + BSTInt.preOrderString());
        System.out.println("PostOrder: " + BSTInt.postOrderString());
        System.out.println("InOrder: " + BSTInt.inOrderString());
        BSTInt.empty();
        System.out.println("Empty Tree? Ans: " + BSTInt.isEmpty());
    }
}