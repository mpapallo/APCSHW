public class Driver{
    public static void main(String[]args){
	
	SuperArray A = new SuperArray();
	System.out.println(A);

	Integer z = new Integer(24);
	A.add(z);
	System.out.println(A);
	
	System.out.println(A.size());
	
	Integer x = new Integer(25);
	A.set(1, x);
	
	System.out.println(A);
	A.clear();
	System.out.println(A);
	
    }
}
