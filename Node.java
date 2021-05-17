/**
 * Connects with BinarySearchTree
 * 
 * @author Alexander Diep
 * @version 12/6/20
 */
public class Node<E extends Comparable>
{
    protected E info;
    protected Node<E> left;
    protected Node<E> right;
   /**
    * Default Constructor
    */
    public Node()
    {
        info = null;
        left = null;
        right = null;
    }
   /**
    * Default Constructor
    */
    public Node(E obj)
    {
        info = obj;
        left = null;
        right = null;
    }
}
