public class Driver{
    public static void main(String[]args){
	int[] orig = new int[10];
	for (int i = orig.length; i > 0; i --){
	    orig[orig.length - i] = i;
	}
	for (int i  = 0; i < orig.length; i ++){
	    System.out.println(orig[i] + " ");
	}

    }
}
