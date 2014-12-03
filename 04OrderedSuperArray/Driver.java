public class Driver{
    public static void main(String[]args){

	System.out.println("Ordered Super Array Stuff:\n\n");
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


	System.out.println("\nSuper Array Stuff:\n\n");
	SuperArray B = new SuperArray(1);
	B.add(d);
	B.add(b);
	B.add(c);
	B.add(a);
	System.out.println(B);
	
	B.sort();
	System.out.println(B);
    }
}
