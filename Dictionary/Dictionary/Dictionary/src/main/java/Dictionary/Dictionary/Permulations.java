package Dictionary.Dictionary;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;

import Utilities.Dictionary;

public class Permulations {
	
	static HashSet WordsSet = new HashSet();

	public HashSet permulations(String str) throws IOException {
		
		HashSet Wset = new HashSet();
		
		char[] charArray = str.toCharArray();
		
		
		for(int k=1;k<=charArray.length; k++) {
			
		 Wset = printAllKLength(charArray, k);
			 
		}
		return Wset;
	}
	
	static HashSet printAllKLength(char[] set, int k) throws IOException
	{
	    int n = set.length;
	    printAllKLengthRec(set, "", n, k);
	    return WordsSet;
	}
	
	static void printAllKLengthRec(char[] set,
            String prefix,
            int n, int k) throws IOException
{

// Base case: k is 0,
// print prefix
if (k == 0)
{
//System.out.println(prefix);
	WordsSet.add(prefix);
	//System.out.println("past English Words :" +prefix);
//Boolean isEnglishWord = Dictionary.isEnglishWord(prefix);
//if(isEnglishWord.equals(true)) {
//	
//	WordsSet.add(prefix);
//System.out.println("English Words :" +prefix);
//}

return;
}

// One by one add all characters
// from set and recursively
// call for k equals to k-1
for (int i = 0; i < n; ++i)
{

// Next character of input added
String newPrefix = prefix + set[i];

// k is decreased, because
// we have added a new character
printAllKLengthRec(set, newPrefix,
             n, k - 1);
}


}
	
	
	
}
