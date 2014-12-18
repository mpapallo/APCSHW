import java.util.Arrays;
public class Driver{
    public static void main(String[]args){
        long startTime, endTime;
	int[] orig;

        orig = new int[500000];
	for (int i = orig.length; i > 0; i --){
	    orig[orig.length - i] = i;
	}

	int[] copy1 = Arrays.copyOf(orig, orig.length);
	System.out.println("Bubble:");
	startTime = System.currentTimeMillis();
	Sorts.bubble(copy1);
	endTime = System.currentTimeMillis();
	System.out.println(endTime - startTime);
	
        int[] copy2 = Arrays.copyOf(orig, orig.length);
	System.out.println("Insertion:");
	startTime = System.currentTimeMillis();
	Sorts.insertion(copy2);
	endTime = System.currentTimeMillis();
	System.out.println(endTime - startTime);

	int[] copy3 = Arrays.copyOf(orig, orig.length);
	System.out.println("Selection:");
	startTime = System.currentTimeMillis();
	Sorts.selection(copy3);
	endTime = System.currentTimeMillis();
	System.out.println(endTime - startTime);

	int[] copy4 = Arrays.copyOf(orig, orig.length);
	System.out.println("Arrays.sort:");
	startTime = System.currentTimeMillis();
        Arrays.sort(copy4);
	endTime = System.currentTimeMillis();
	System.out.println(endTime - startTime);

    }
}
