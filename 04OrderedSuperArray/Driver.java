public class Driver{
    public static void main(String[]args){

	/*
	String a = "aardvark";
	String b = "banana";
	String c = "crawfish";
	String d = "dugong";

	System.out.println("\nOrdered Super Array Stuff:\n");
	OrderedSuperArray A = new OrderedSuperArray();
	System.out.println(A);
	A.add(c);
	System.out.println(A);
	A.add(b);	
	System.out.println(A);
	A.add(5, a);
	System.out.println(A);
	System.out.println(A.set(0, d));
	System.out.println(A);

	System.out.println("\nSuper Array Stuff:\n");
	SuperArray B = new SuperArray(1);
	B.add(d);
	B.add(b);
	B.add(c);
	B.add(a);
	B.add(b);
	System.out.println(B);
	//B.sort();
	B.insertionSort();
	System.out.println(B);
	*/

	SuperArray C = new SuperArray();

	for (int i = 25; i >= 0; i --){
	    C.add("" + (char)('a' + i));
	}
	for (int i = 25; i >= 0; i --){
	    C.add("" + (char)('A' + i));
	}
	System.out.println(C);
	System.out.println();
	C.insertionSort();
	//C.badInsertionSort();
	System.out.println(C);

    }
}
