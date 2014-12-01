public class Driver{
    public static void main(String[]args){

	OrderedSuperArray A = new OrderedSuperArray();
	System.out.println(A);

	String a = "aardvark";
	String b = "banana";
	String c = "crawfish";

	A.add(c);
	System.out.println(A);
	
	try{
	    System.out.println(A.set(0, b));
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Index out of bounds!");
	}	
	System.out.println(A);
	
	try{
	    A.set(5, c);
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Index out of bounds!");
	}
	try{
	    A.add(3, c);
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Index out of bounds!");
	}

	A.add(a);
	System.out.println(A);

	try{
	    System.out.println(A.remove(0));
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Index out of bounds!");
	}

	System.out.println(A);

	A.clear();
	System.out.println(A);
	
    }
}