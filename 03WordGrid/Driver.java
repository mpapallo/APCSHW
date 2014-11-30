import java.util.*;
import java.io.*;
public class Driver{
    public static void main(String[]args){
	WordGrid z = new WordGrid();
	System.out.println(z);

	File f = new File("words.txt");
	z.loadWordsFromFile(f, true);
	System.out.println(z);	
	
    }
}
