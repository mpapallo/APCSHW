import java.util.*;
public class WordGrid{
    private char[][] data;
    
    /**
     *Initializes the grid to the size specified and fill all of
     *the positions with spaces.
     *@param rows is the starting height of the WordGrid.
     *@param cols si the starting width of the WordGrid.
     */
    public WordGrid(int rows, int cols){
	data = new char[rows][cols];
	clear();
    }
    public WordGrid(){
	this(5, 5);
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
		data[y][x] = ' ';
	    }
	}
    }

    /**
     *Sets all values in the WordGrid to underscores 
     *for easier use in testing.
     */
    public void initialize(){
	for (int y = 0; y < data.length; y ++){
	    for (int x = 0; x < data[y].length; x ++){
		data[y][x] = '_';
	    }
	}
    }

    //CHANGE '_' TO ' ' LATER!!!!!!!!!!!!!!!!!!!
    public boolean addWordHorizontal(String word, int row, int col){
	int c = col;
	for (int n = 0; n < word.length(); n ++){
	    if (data[row][c] != '_' && data[row][c] != word.charAt(n)){
		return false;
	    }
	    c ++;
	}
	c = col;
        for (int n = 0; n < word.length(); n ++){
	    data[row][c] = word.charAt(n);
	    c ++;
	}
	return true;
    }

    
    public boolean addWordVertical(String word, int row, int col){
	int r = row;
	for (int n = 0; n < word.length(); n ++){
	    if (data[r][col] != '_' && data[r][col] != word.charAt(n)){
		return false;
	    }
	    r ++;
	}
	r = row;
	for (int n = 0; n < word.length(); n ++){
	    data[r][col] = word.charAt(n);
	    r ++;
	}
	return true;
    }
    
    public boolean addWordDiagonal(String word, int row, int col){
	int c = col;
	int r = row;
	for (int n = 0; n < word.length(); n ++){
	    if (data[r][c] != '_' && data[r][c] != word.charAt(n)){
		return false;
	    }
	    c ++;
	    r ++;
	}
	c = col;
	r = row;
	for (int n = 0; n < word.length(); n ++){
	    data[r][c] = word.charAt(n);
	    c ++;
	    r ++;
	}
	return true;
    }
    
}
