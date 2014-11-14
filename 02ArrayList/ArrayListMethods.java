import java.util.*;
public class ArrayListMethods{

    public static void collapseDuplicates(ArrayList<Integer> L){
	for (int i  = 0; i < L.size() - 1; i ++){
	    if (L.get(i) == L.get(i + 1)){
		L.remove(i);
		i --;
	    }
	}
    }
    
    public static void randomize(ArrayList<Integer> L){
	for (int n = L.size(); n > 0; n --){
	    Random r = new Random();
	    int x = r.nextInt(n);
	    L.add(L.get(x));
	    L.remove(L.get(x));
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
	randomize(B);
	System.out.println(B);

    }
    
}
