public class Driver{
    public static void main(String[]args){
	WordGrid z = new WordGrid(5, 5);
	z.initialize();
	System.out.println(z);

	if (z.addWordHorizontal("HELLO", 0, 0)){
	    System.out.println(z);
	}
	if (z.addWordVertical("HELLO", 0, 0)){
	    System.out.println(z);
	}
	if (z.addWordDiagonal("HELLO", 0, 0)){
	    System.out.println(z);
	}

    }
}
