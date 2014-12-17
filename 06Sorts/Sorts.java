public class Sorts{
    
    public static void bubble(int[] A){
	for (int i = 1 ; i < A.length; i ++){
	    for (int x = 0; x < A.length - i; x ++){
		if (A[x] > A[x+1]){
		    int p = A[x];
		    A[x] = A[x+1];
		    A[x+1] = p;
		}
	    }
	}
    }

    public static void swap(int[]A){
	if (A.length > 1){
	    for (int i = 1; i < A.length; i ++){
		int x = i;
		while (x > 0 && A[x-1] > A[x]){
		    int s = A[x];
		    A[x] = A[x-1];
		    A[x-1] = s;
		    x --;
		}
	    }
	}
    }

    public static void main(String[]args){
	int[] I = new int[10];
	for (int i = 10; i > 0; i --){
	    I[10 - i] = i;
	}
	bubble(I);
	for(int i = 0; i < I.length; i ++){
	    System.out.print(I[i] + " ");
	}
	System.out.println();
    }
}
