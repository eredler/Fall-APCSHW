import java.util.*;

public class WordSearchTester {

    public static void main(String[]args){
	//	ArrayList<String> temp = WordSearch.doIt();
	int numrows = 20;
	int numcols = 20;
	int effort = 10;
	int howManyWords = 20;

	Random r = new Random();
	ArrayList<String> wordsUsed = new ArrayList<String>();

	String[] wordBank = WordSearch.doIt();

	WordSearch example = new WordSearch(numrows,numcols);

	for (int i = 0; i < wordBank.length; i++){
	    boolean success = false;
	    int trynum = 0;
	    int spot = r.nextInt(wordBank.length);
	    if (wordsUsed.contains(wordBank[spot])){
		trynum = effort;
	    }
	    if (wordsUsed.size() > howManyWords){
		trynum = effort;
		i = wordBank.length;
	    }
	    while (trynum < effort){
		int dx = r.nextInt(3) - 1;
		int dy = r.nextInt(3) - 1;
		int rw = r.nextInt(numrows);
		int cl = r.nextInt(numcols);
		if (example.addWord(wordBank[spot], rw, cl, dx, dy)){
		    wordsUsed.add(wordBank[spot]);
		}
		trynum++;
		}
	   
	    }
        
	example.fillEmpty();
	System.out.println(example.toString());
	System.out.println(wordsUsed);
    }
    }
