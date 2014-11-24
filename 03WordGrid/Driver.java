import java.util.*;
import java.io.*;
public class Driver{
    public static void main(String[]args){
	WordGrid z = new WordGrid(10, 10);
	System.out.println(z);

	try{
	    
	    File words = new File("words.txt");
	    Scanner in = new Scanner(words);
	    ArrayList<String> wordBank = new ArrayList<String>();
	    Random r = new Random();

	    while (in.hasNext()){
		wordBank.add(in.next());
	    }

	    for (int x = 0; x < wordBank.size(); x ++){
	       
	    }
	    System.out.println(wordBank);

	}catch(FileNotFoundException e){
	    System.out.println("File does not exist");
	}
	
    }
}
