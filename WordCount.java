/**
 * Word count helps Circular list with counting the text file
 * 
 * @author Alexander Diep
 * @version 12/8/20
 */
public class WordCount implements Comparable<WordCount>
{
    protected String word;
    protected int count;
    protected CircularList lineNums;

    //required for class to compile
    /**
     * Compares the the text file that is given 
     * 
     * @return
     */
    public int compareTo(WordCount other)
    {
        return word.compareTo(other.word);
    }

    //write your WordCount methods here. Javadoc comments required
    /** 
     * constructor with circularList of one item
     * 
     * @lineNums
     * @lineNums.append
     */
     public WordCount (String w, int line)
     {
         word = w;
         count = 1;
         lineNums = new CircularList();
         lineNums.append(line);
         
     }
     /**
      * increment the count 
      * 
      * @count++
      */
     public void incrementCount()
     {
         count++;
     }
     /**
      * Links with Circular List to be Appended
      * 
      * @word 
      * @lineNums
      */
    public WordCount()
    {
        word = "";
        count = 0;
        lineNums = null;
    }
    /**
     * Links with Circular List so that the words can be counted
     * 
     * @word
     * @lineNums
     */
    public WordCount(String w)
    {
        word = w;
        count = 0;
        lineNums = null;
    }
    /**
     * String is needed to compare the CircularList
     * 
     * @toString
     */
     public String toString()
     {
        return String.format("%-12s %3d %s", word, count, lineNums.toString());
        
     }
}
