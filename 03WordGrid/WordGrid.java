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

    public boolean addWordE(String word, int row, int col){
        return addWord(word, row, col, 1, 0);
    }

    
    public boolean addWordN(String word, int row, int col){
	return addWord(word, row, col, 0, 1);
    }
    
    public boolean addWordSE(String word, int row, int col){
	return addWord(word, row, col, 1, 1);
    }
   
}
