public class Driver{
    public static void main(String[]args){

	OrderedSuperArray A = new OrderedSuperArray();
	System.out.println(A);

	String a = "aardvark";
	String b = "banana";
	String c = "crawfish";

	A.add(c);
	System.out.println(A);
	A.add(b);	
	System.out.println(A);
	
    }
}
