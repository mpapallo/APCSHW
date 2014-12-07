public class Driver{
    public static void main(String[]args){

	if (args.length > 0){

	    SuperArray C = new SuperArray();
	    SuperArray D = new SuperArray();
	    
	    for (int n = 0; n < 100; n ++){
		C.add("" + n);
	    }
	    
	    for (int i = 25; i >= 0; i --){
		D.add("" + (char)('a' + i));
	    }
	    for (int i = 25; i >= 0; i --){
		D.add("" + (char)('A' + i));
	    }

	    if (args[0].equals("0")){
		System.out.println(C);
		System.out.println();
		C.insertionSort();
		System.out.println(C);

		System.out.println();

		System.out.println(D);
		System.out.println();
		D.insertionSort();
		System.out.println(D);
	    }else if (args[0].equals("1")){
		System.out.println(C);
		System.out.println();
		C.selectionSort();
		System.out.println(C);

		System.out.println();

		System.out.println(D);
		System.out.println();
		D.selectionSort();
		System.out.println(D);
	    }
	    
	}
    }
}
