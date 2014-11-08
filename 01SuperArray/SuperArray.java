public class SuperArray{
    private Object[] A;
    private int numElements;

    public SuperArray(){
        this(10);
    }
    public SuperArray(int size){
	A = new Object[size];
	numElements = 0;
    }
    
    public String toString(){
	String ret = "[";
	for (int i  = 0; i < numElements; i ++){
	    ret += " " + A[i] + " ";
	}
	ret += "]";
	return ret;
    }

    public void add(Object e){
	if (numElements == A.length){
	    resize(A.length + 1);
	    add(e);
	}else{
	    A[numElements] = e;
	    numElements ++;
	}
    }

    public int size(){
	return numElements;
    }

    public void resize(int newSize){
	Object[] ret = new Object[newSize];
	int i = 0;
	while (i < A.length && i < newSize){
	    ret[i] = A[i];
	    i ++;
	}
	A = ret;
    }

    public void clear(){
	for (int i = 0; i < A.length; i ++){
	    A[i] = null;
	}
	numElements = 0;
    }

    public Object get(int index){
	return A[index];
    }

    public void set(int index, Object e){
        A[index] = e;
	numElements ++;
    }

}
