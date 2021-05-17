/**
 * Links with WordCount and Item to produce the counting of words and 
 * which line it corresponds to 
 * 
 * @author Alexander Diep
 * @version 12/6/20
 */
public class CircularList
{
    private Item list;
  /**
   * default Constructor
   */
    public CircularList()
    {
        list = null;
    }
    /**
     * deafult Constructor
     */
    public Boolean isEmpty()
    {
        return list == null;
    }
    /**
     * helps with linking with WordCount and Item
     * 
     * @Item
     * @list
     */
    public void append(int x)
    {
        Item r = new Item(x);
        if (isEmpty()) {
            r.next = r;
        }
        else {
            r.next = list.next;
            list.next = r;
        }
        list = r;
    }

    
    //write a new method here that returns the info of the last item in the list
    //Javadoc comment required
    /**
     * checks the list if empty, return zero. 
     * otherwise, return the last appended item's info field
     * 
     * @isEmpty
     * @list.info
     */
    public int lastLine()
    {
        if (!isEmpty())
        {
            return list.info;
        }
        
        return 0;
    }
    /**
     * Builds the list to be printed out and is linked with WordCount
     * 
     * @isEmpty
     * @s.append
     */
    public String toString()
    {
        StringBuilder s = new StringBuilder("");

        if (!isEmpty()) {
            Item r = list.next;
            while (r != list) {
                s.append(r.info + ", ");
                r = r.next;
            }
            //append last item
            s.append(r.info);
        }
        return s.toString();
    }
}
