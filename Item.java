/**
 * Lists out both circularlist and wordcount
 * 
 * @author Alexander Diep
 * @version 12/6/20
 */
public class Item
{
    protected int info;
    protected Item next;
   /**
    * Default Constructor
    */
    public Item()
    {
        info = 0;
        next = null;
    }
   /**
    * Default Constructor
    */
    public Item(int i)
    {
        info = i;
        next = null;
    }
}
