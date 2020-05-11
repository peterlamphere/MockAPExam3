public class Vocab {
/** The controlled vocabulary for a Vocab object. */
private String[] theVocab = { /* contents not shown */ };
 
/** Searches for a string in theVocab. Returns true if its String parameter str
* is an exact match to an element in theVocab and returns false otherwise.
*/
public boolean findWord(String str)
{
/* implementation not shown */
}
 

  /** Counts how many strings in wordArray are not found in theVocab, as described in
  * part (a).
  */
  public int countNotInVocab(String[] wordArray)
  {
      int count = 0;
      for (String element : wordArray) {
          if (findWord (element)) {
            count++
          }
      }
      return count;
  }
  

  /** Returns an array containing strings from wordArray not found in theVocab,
  * as described in part (b).

  This method would create a new String ArrayList, using the value returned by countNotInVocab() to identify the size of the Array. It would iterate through the wordArray parameter and if the findWord method returns false, it would add that String to the ArrayList

  */
  
  public ArrayList<String> notInVocab(String[] wordArray)
  {
    ArrayList<String> list = new ArrayList<String>();
    for (String element : wordArray) {
      if (!findWord (element))
        list.add(element)
    }
    return list;
  }

}

 

}