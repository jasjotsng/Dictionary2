package Dictionary.Dictionary;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

import org.testng.annotations.Test;

import Utilities.Dictionary;

public class EnglishWords 

{
	String word="way";
	@Test
   public void EnglishWords () throws IOException {
	   
		Permulations per = new Permulations();
		
		HashSet EnglishWords = per.permulations(word);
		System.out.println("All possible permutations of given word is :"+EnglishWords);
		System.out.println("All possible permutations size :"+EnglishWords.size());
		int i=0;
		Iterator it = EnglishWords.iterator();
		while(it.hasNext()) {
		
			String word = it.next().toString();
			Boolean isEnglishWord = Dictionary.isEnglishWord(word);
			if(isEnglishWord==true) {
			System.out.println("English Words :" +word);
			i++;
		}
		
			
		}
		
		System.out.println("Size of english words : "+i);
		//Boolean isEnglishWord = Dictionary.isEnglishWord(word);
		//System.out.println("is english word :"+isEnglishWord);
   }
	
}
