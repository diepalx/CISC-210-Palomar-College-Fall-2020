/**
 * BSTreeInterface<T> Interfaces BSTree<E>
 * 
 * @author Alexander Diep
 * version 12/6/20
 */
public interface BSTreeInterface<T>
{
    void insertBST(T item);
    
    T find(T item);
    
    String toString();
}
