package Utilities;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class Dictionary {

	public static boolean isEnglishWord(String word) throws IOException {
//		 Set<String> wordsSet;
//		 Path path = Paths.get("D:\\WebMD\\EclipseWorkspace\\Practice\\Dictionary\\Dictionary\\src\\main\\DictionaryWords\\dictionaryWords.txt");
//	        byte[] readBytes = Files.readAllBytes(path);
//	        String wordListContents = new String(readBytes, "UTF-8");
//	        wordsSet = new HashSet<>();
//	        
//	        
//	        ArrayList listwords = new ArrayList();
//	        String[] words = wordListContents.split("\n");
//	        
//	        for(int i=0; i<words.length; i++) {
//	        	
//	        	listwords.add(words[i]);
//	        }
//	      
//	        System.out.println(words[1000]);
//	        
//	        Collections.addAll(wordsSet, words);
//	     //   Collections.addAll(listwords, words);
//	   
//	        System.out.println("words set : "+  wordsSet.contains("aboundingly"));
//	        
////	        ArrayList l = new ArrayList();
////	        
////	        l.add("apple");
////	        l.add("orange");
////	        System.out.println("words set newwwwww : "+  l.contains("apple"));
//	        return wordsSet.contains("Work");
//		
		boolean flag=false;
		
		try {
	//	    BufferedReader in = new BufferedReader(new FileReader("D:\\WebMD\\EclipseWorkspace\\Practice\\Dictionary\\Dictionary\\src\\main\\DictionaryWords\\dictionaryWords.txt"));
		    
		    BufferedReader in = new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\src\\main\\DictionaryWords\\dictionaryWords.txt"));
		   String str;
		    
		    while ((str = in.readLine()) != null) {
		    	
		        if ( str.equals(word)) {
		        	flag= true;
		        	break;
		        } else {
		        	flag= false;
		        }
		    }
		    in.close();
		} catch (IOException e) {
		}
		
	//	System.out.println("flag is "+flag);
		
		return flag;
	}
	
	
}
