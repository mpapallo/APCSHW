public class Driver{
    public static void main(String[]args){

	OrderedSuperArray A = new OrderedSuperArray();
	System.out.println(A);

	String a = "aardvark";
	String b = "banana";
	String c = "crawfish";
	String d = "dugong";

	A.add(c);
	System.out.println(A);
	A.add(b);	
	System.out.println(A);
	
	A.add(5, a);
	System.out.println(A);

	System.out.println(A.set(0, d));
	System.out.println(A);

    }
}
