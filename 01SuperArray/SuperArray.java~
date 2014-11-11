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
    
    public int size(){
	return numElements;
    }

    public boolean inRange(int index){
	return (index >= 0 && index < size());
    }

    public String toString(){
	String ret = "[";
	for (int i  = 0; i < size(); i ++){
	    ret += " " + A[i] + " ";
	}
	ret += "]";
	return ret;
    }

    public void add(Object e){
	if (size() == A.length){
	    resize(A.length + 1);
	    add(e);
	}else{
	    A[size()] = e;
	    numElements ++;
	}
    }

    public void add(int index, Object o){
	if (size() == A.length){
	    resize(A.length + 1);
	    add(index, o);
	}else{
	    if (inRange(index)){
		Object[] ret = new Object[A.length];
		for (int i = 0; i < index; i ++){
		    ret[i] = A[i];
		}
		ret[index] = o;
		for (int i = index; i < A.length; i ++){
		    ret[i+1] = A[i];
		}
		A = ret;
		numElements ++;
	    }else{
		System.out.println("Index out of range");
	    }
	}
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
	for (int i = 0; i < size(); i ++){
	    A[i] = null;
	}
	numElements = 0;
    }

    public Object get(int index){
	if (inRange(index)){
	    return A[index];
	}else{
	    System.out.println("Index out of range");
	    return null;
	}
    }

    public Object set(int index, Object e){
	if (inRange(index)){
	    Object x = new Object();
	    x = A[index];
	    A[index] = e;
	    return x;
	}else{
	    System.out.println("Index out of range");
	    return null;
	}	    
    }
    
    public Object remove(int index){
	if (inRange(index)){
	    Object x = new Object();
	    x = A[index];
	    for (int i = index; i < size() - 1; i ++){
		A[i] = A[i + 1];
	    }
	    A[size() - 1] = null;
	    numElements --;
	    return A[index];
	}else{
	    System.out.println("Index out of range");
	    return null;
	}
    }
    
    public static void main(String[]args){

	SuperArray A = new SuperArray();
	System.out.println(A);

	Integer z = new Integer(24);
	Integer x = new Integer(25);
	Integer y = new Integer(42);

	A.add(z);
	System.out.println(A);
	
	System.out.println(A.size());
	
	System.out.println(A.set(0, x));
	System.out.println(A);

	A.set(5, y);
	A.add(3, y);

	A.add(y);
	System.out.println(A);

	System.out.println(A.remove(0));
	System.out.println(A);

	A.clear();
	System.out.println(A);
	
    }

}
