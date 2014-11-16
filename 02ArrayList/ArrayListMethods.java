import java.util.*;
public class ArrayListMethods{

    /**
     *Remove any consecutive duplicates in the ArrayList
     *@param L The values which may contain duplicates
     */
    public static void collapseDuplicates(ArrayList<Integer> L){
	for (int i  = 0; i < L.size() - 1; i ++){
	    if (L.get(i) == L.get(i + 1)){
		L.remove(i);
		i --;
	    }
	}
    }
    
    /**
     *Change the order of the elements in the ArrayList to a random permutation <br>
     *by removing a random element and then adding it to the end of the ArrayList
     *@param L The values to be put in random order
     */
    public static void randomize(ArrayList<Integer> L){
	Random r = new Random();
	for (int n = L.size(); n > 0; n --){
	    int x = r.nextInt(n);
	    L.add(L.get(x));
	    L.remove(L.get(x));
	}
    }

    /**
     *Change the order of the elements in the ArrayList to a random permutation <br>
     *by swapping each element with another element at a random index
     *@param L The values to be put in random order
     */
    public static void randomizeFaster(ArrayList<Integer> L){
	Random r = new Random();
	for (int n = 0; n < L.size(); n ++){
	    int x = r.nextInt(L.size());
	    L.set(n, L.set(x, L.get(n)));
	}
    }
	
    public static void main(String[]args){
	ArrayList<Integer> A = new ArrayList<Integer>();
	Integer x = new Integer(1);
	A.add(x);
	A.add(x);
	A.add(x);
	Integer y = new Integer(2);
	A.add(y);
	A.add(y);
	System.out.println(A);
	collapseDuplicates(A);
	System.out.println(A);

	System.out.println();
	
	ArrayList<Integer> B = new ArrayList<Integer>();
	for (int n = 0; n < 10; n ++){
	    Integer z = new Integer(n);
	    B.add(z);
	}
	System.out.println(B);
	randomizeFaster(B);
	System.out.println(B);

    }
    
}
