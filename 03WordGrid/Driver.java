public class Driver{
    public static void main(String[]args){
	WordGrid z = new WordGrid(5, 5);
	System.out.println(z);

	if (z.addWordE("HELLO", 0, 0)){
	    System.out.println(z);
	}
	
	if (z.addWordN("HELLO", 0, 0)){
	    System.out.println(z);
	}
	if (z.addWordSE("HELLO", 0, 0)){
	    System.out.println(z);
	}
	
    }
}
