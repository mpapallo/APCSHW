import java.util.*;
public class WordGrid{
    private char[][] data;
    
    /**
     *Initializes the grid to the size specified and fill all of
     *the positions with spaces.
     *@param rows is the starting height of the WordGrid.
     *@param cols is the starting width of the WordGrid.
     */
    public WordGrid(int rows, int cols){
	data = new char[rows][cols];
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
     *Sets all values in the WordGrid to spaces.
     */
    private void clear(){
	for (int y = 0; y < data.length; y ++){
	    for (int x = 0; x < data[y].length; x ++){
		data[y][x] = '_';
	    }
	}
    }

    //CHANGE '_' TO ' ' LATER!!!!!!!!!!!!!!!!!!!
    
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
        int r = row;
	int c = col;
	for (int n = 0; n < word.length(); n ++){
	    if (data[r][c] != '_' && data[r][c] != word.charAt(n)){
		return false;
	    }
	    r += y;
	    c += x;
	}
	r = row;
	c= col;
	for (int n = 0; n < word.length(); n ++){
	    data[r][c] = word.charAt(n);
	    r += y;
	    c += x;
	}
	return true;
    }
   
    File wordBank = new File("words.txt");
    Scanner in = new Scaner(wordBank);
    Random r = new Random();

    public void createPuzzle(){
	while (in.hasNext()){
	    String word = in.next();
	    int dir = r.nextInt(8);
	    if (dir == 0){
	        addWord(word, row, col, 1, 0);
	    }else if (dir == 1){
		addWord(word, row, col, 0, 1);
	    }else if (dir == 2){
	        addWord(word, row, col, 1, 1);
	    }else if (dir == 3){
		addWord(word, row, col, 1, -1);
	    }else if (dir == 4){
		addWord(word, row, col, -1, 0);
	    }else if (dir == 5){
		addWord(word, row, col, 0, -1);
	    }else if (dir == 6){
		addWord(word, row, col, 1, -1);
	    }else{
		addWord(word, row, col, -1, -1);
	    }
	}
    }

}
