import java.util.*;
import java.io.*;
public class WordGrid{
    private char[][] data;
    public ArrayList<String> wordsToFind;
    Random rand = new Random();
    
    /**
     *Initializes the grid to the size specified and fill all of
     *the positions with spaces.
     *@param rows is the starting height of the WordGrid.
     *@param cols is the starting width of the WordGrid.
     */
    public WordGrid(int rows, int cols){
	if (rows == 0 && cols == 0){
	    data = new char[10][10];
	}else{
	    data = new char[rows][cols];
	}
	clear();
    }
    public WordGrid(){
	this(10, 10);
    }
    
    /**
     *Creates the proper formatting for a WordGrid.
     *@return a String with each each character separated by spaces
     *and each row separated by newlines.
     */
    public String toString(){
	String grid = "";
	for (int y = 0; y < data.length; y ++){
	    for (int x = 0; x < data[y].length; x ++){
		grid += data[y][x] + " ";
	    }
	    grid += "\n";
	}
	return grid;
    }

    /**
     *Sets all values in the WordGrid to underscores.
     */
    private void clear(){
	for (int y = 0; y < data.length; y ++){
	    for (int x = 0; x < data[y].length; x ++){
		data[y][x] = '_';
	    }
	}
    }
    
    /**
     *Checks if the word fits at the specified position of the WordGrid and if it 
     *has a corresponding letter to match any letters that it overlaps).
     *@param word is the text to be added to the WordGrid.
     *@param row is the vertical location of the beginning of the word.
     *@param col is the horizontal location of the beginning of the word.
     *@param x is an int from [-1, 1] that indicates the horizontal direction of the next letter in the word
     *@param y is an int from [-1,1] that indicates the vertical direction of the next letter in the word
     *@return true is the word fits, or false when the word
     *doesn't fit or overlaps letters that don't match.
     */

    private boolean wordFits(String word, int row, int col, int x, int y){
	if ((x == 0 && y == 0) ||
	    row + y*word.length() > data.length ||
	    row + y*word.length() < 0 ||
	    col + x*word.length() > data[0].length ||
	    col + x*word.length() < 0){
	    return false;
	}else{
	    for (int n = 0; n < word.length(); n ++){
		if (data[row][col] != '_' && data[row][col] != word.charAt(n)){
		    return false;
		}
		row += y;
		col += x;
	    }
	}
	return true;
    }

    /**
     *Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, if it fits on the WordGrid and
     *has a corresponding letter to match any letters that it overlaps.
     *@param word is the text to be added to the WordGrid.
     *@param row is the vertical location of the beginning of the word.
     *@param col is the horizontal location of the beginning of the word.
     *@param x is an int from [-1, 1] that indicates the horizontal direction of the next letter in the word
     *@param y is an int from [-1,1] that indicates the vertical direction of the next letter in the word
     *@return true when the word is added successfully, or false when the word
     *doesn't fit or overlaps letters that don't match.
     */

    public boolean addWord(String word, int row, int col, int x, int y){
        if (wordFits(word, row, col, x, y)){
	    for (int n = 0; n < word.length(); n ++){
		data[row][col] = word.charAt(n);
		row += y;
		col += x;
	    }
	    // wordsToFind.add(word);
	    return true;
	}else{
	    return false;
	}
    }

    public boolean addWordRandomly(String word){
	int row = rand.nextInt(data.length);
	int col = rand.nextInt(data[0].length);
        int x  = rand.nextInt(3) - 1;
	int y = rand.nextInt(3) - 1;
	return (addWord(word, row, col, x, y));
    }

    public void fillPuzzle(ArrayList<String> words){
       
	for (int x = 0; x < words.size(); x ++){
	    String word = words.remove(rand.nextInt(words.size()));
		int attempts = 10;
		do{
		    if (addWordRandomly(word)){
			attempts = 0;
		    }else{
			attempts -= 1;
		    }
		}while(attempts > 0);
	    }
    }

    public void fillInLeftovers(){
	for (int y = 0; y < data.length; y ++){
	    for (int x = 0; x < data[y].length; x ++){
		if (data[y][x] == '_'){
		    data[y][x] = (char)('a' + (char)(rand.nextInt('z' - 'a')));
		}
	    }
	}
    }

    public void loadWordsFromFile(File f, boolean fillRandomLetters){
	try{
	    Scanner in = new Scanner(f);
	    ArrayList<String> wordBank = new ArrayList<String>();
	    Random rand = new Random();

	    while (in.hasNext()){
		wordBank.add(in.next());
	    }
	    fillPuzzle(wordBank);
	    if (fillRandomLetters){
		fillInLeftovers();
	    }

	}catch(FileNotFoundException e){
	    System.out.println("File does not exist");
	}

    }
   
}
