import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**\
 * Tests classes that are given
 * 
 * @author Alexander Diep
 * version 12/6/20
 */
public class Tester
{
    public static final int WordsPerLine = 10;

    public static void main() throws FileNotFoundException
    {
        //build then output hash table
        HashTable ht = new HashTable();
        System.out.println(ht.toString());

        String word; //read from input file
        WordCount wordToFind;  //search for this in the bst
        WordCount wordInTree;  //found in the bst

        //create generic BST, of WordCount here
        BSTree<WordCount> t = new BSTree<WordCount>();

        //want to read word at a time from input file
        Scanner wordsIn = new Scanner(new File("Hamlet.txt"));
        wordsIn.useDelimiter("[^A-Za-z']+");

        int wordCount = 0;
        int lineNum = 1;
        System.out.printf("%3d:  ", lineNum);
        while (wordsIn.hasNext()) {
            word = wordsIn.next();
            ++wordCount;
            System.out.print(word + " ");
            word = word.toLowerCase();

            //now process word and lineNum here
            if (!ht.find(word))
            {
                wordToFind = new WordCount(word);
                
                wordInTree = t.find(wordToFind);
                
                if (wordInTree == null)
                {
                    wordInTree = new WordCount(word, lineNum);
                    t.insertBST(wordInTree);
                }
                else
                {
                    if (wordInTree.lineNums.lastLine() != lineNum)
                    {
                        wordInTree.lineNums.append(lineNum);
                        wordInTree.incrementCount();
                    }
                }
            }

            if (wordCount % WordsPerLine == 0) {
                ++lineNum;
                System.out.printf("\n%3d:  ", lineNum);
            }
        }
        //EOF
        System.out.println();

        //print bst in alpha order
        System.out.println(t.toString());
    }
}
