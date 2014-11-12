import java.util.ArrayList;
public class Classwork{

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
    }
    
    public static void collapseDuplicates(ArrayList L){
	for (int i  = 0; i < L.size() - 1; i ++){
	    if (L.get(i) == L.get(i + 1)){
		L.remove(i);
		i --;
	    }
	}
    }
    
}
