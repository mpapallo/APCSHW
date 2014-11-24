import java.util.*;
import java.io.*;
public class Driver{
    public static void main(String[]args){
	WordGrid z = new WordGrid();
	System.out.println(z);

	try{
	    
	    File words = new File("words.txt");
	    Scanner in = new Scanner(words);
	    ArrayList<String> wordBank = new ArrayList<String>();
	    Random rand = new Random();

	    while (in.hasNext()){
		wordBank.add(in.next());
	    }

	    for (int x = 0; x < wordBank.size(); x ++){
		String word = wordBank.remove(rand.nextInt(wordBank.size()));
		z.addWordRandomly(word);
	    }
	    System.out.println(z);

	}catch(FileNotFoundException e){
	    System.out.println("File does not exist");
	}
	
    }
}
