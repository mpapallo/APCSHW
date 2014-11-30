import java.util.*;
import java.io.*;
public class Driver{
    public static void main(String[]args){
	String rows = "20";
	String cols = "20";
	boolean seedExists = false;
	boolean fillRandomLetters = true;

	if (args.length ==  2){
	    rows = args[0];
	    cols = args[1];
	}else if (args.length == 3){
	    rows = args[0];
	    cols = args[1];
	    seedExists = true;
	}else if(args.length == 4){
	    rows = args[0];
	    cols = args[1];
	    seedExists = true;
	    if (args[3].equals("1")){
	        fillRandomLetters = false;
	    }
	}else{
	    System.out.println("Directions:");
	    System.out.println("to generate a word puzzle, type into terminal:");
	    System.out.println("\t$ java Driver rows cols [randomSeed [answers] ]");
	    System.out.println("where rows and cols create the dimensions of the puzzle,");
	    System.out.println("randomSeed is an optional value that can generate the same puzzle twice, and");
	    System.out.println("answers, when its value is 1, can display the solution to a puzzle that uses a randomSeed.");
	    System.out.println("\n\n");
	}

	WordGrid w = new WordGrid(Integer.valueOf(rows), Integer.valueOf(cols));
	if (seedExists){
	    w.setSeed(Long.valueOf(args[2]));
	}
	w.loadWordsFromFile("words.txt", fillRandomLetters);
	System.out.println(w);	
	
    }
}
