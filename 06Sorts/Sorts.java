import java.util.*;
public class Sorts{
    
    public static String name(){
	return "Papallo,Michaela";
    }
    public static int period(){
	return 6;
    }

    public static void bubble(int[] A){
	for (int i = 1 ; i < A.length; i ++){
	    for (int x = 0; x < A.length - i; x ++){
		if (A[x] > A[x+1]){
		    int p = A[x];
		    A[x] = A[x+1];
		    A[x+1] = p;
		}
	    }
	}
    }

    public static void insertion(int[] A){
	for (int i = 1; i < A.length; i ++){
	    int current = A[i];
	    int ctr = i - 1;
	    while(ctr >= 0 && current < A[ctr]){
		A[ctr + 1] = A[ctr];
		ctr --;
	    }
	    A[ctr + 1] = current;
	}
    }

    public static void selection(int[] A){
	for (int i = 0; i < A.length; i ++){
	    int x = getMinIndex(A, i);
	    int p = A[i];
	    A[i] = A[x];
	    A[x] = p;
	}
    }
    
    private static int getMinIndex(int[] A, int start){
	int min = A[start];
	int i = start;
	for (int x = start; x < A.length; x ++){
	    if (A[x] < min){
		min = A[x];
		i = x;
	    }
	}
        return i;
    }

    public static void radix(int[] A){
	int max = A[0];
	for (int i = 1; i < A.length; i ++){
	    if (A[i] > max){
		max = A[i];
	    }
	}

	ArrayList<ArrayList<Integer>> buckets = new ArrayList<ArrayList<Integer>>(10);
	for (int i = 0; i < 10; i ++){
	    buckets.set(i, new ArrayList<Integer>());
	}
	
	int exp = 1;

	while(max / exp > 0){
	    for (int i = 0; i < A.length; i ++){
		int in = ((A[i] / exp) % 10);
		Integer z = new Integer(A[i]);
		buckets.get(in).add(z);
	    }
	    //
	    for (int i = 0; i < 10; i ++){
		for (int x = 0; x < buckets.get(i).size(); x ++){
		    //copy into A
		}
	    }
	    exp *= 10;
	}
	
    }

}
