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
	    resize(A.length * 2);
	    add(e);
	}else{
	    A[size()] = e;
	    numElements ++;
	}
    }

    public void add(int index, Object o){
	if (size() == A.length){
	    resize(A.length * 2);
	    add(index, o);
	}else{
	    if (!inRange(index)){
		throw new IndexOutOfBoundsException();
	    }
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
	/*
	for (int i = 0; i < size(); i ++){
	    A[i] = null;
	}
	*/
	numElements = 0;
    }

    public Object get(int index){
	if (!inRange(index)){
	    throw new IndexOutOfBoundsException();
	}
	return A[index];
    }

    public Object set(int index, Object e){
	if (!inRange(index)){
	    throw new IndexOutOfBoundsException();
	}
	Object x = new Object();
	x = A[index];
	A[index] = e;
	return x;
    }
    
    public Object remove(int index){
	if (!inRange(index)){
	    throw new IndexOutOfBoundsException();
	}	
	Object x = new Object();
	x = A[index];
	for (int i = index; i < size() - 1; i ++){
	    A[i] = A[i + 1];
	}
	//	A[size() - 1] = null;
	numElements --;
	if (size() < (A.length / 4)){
	    resize(A.length / 2);
	}
	return x;
    }
    
    public static void main(String[]args){

	SuperArray A = new SuperArray();
	System.out.println(A);

	Integer z = new Integer(24);
	Integer x = new Integer(25);
	Integer y = new Integer(42);

	A.add(z);
	System.out.println(A);
	
	try{
	    System.out.println(A.set(0, x));
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Index out of bounds!");
	}	
	System.out.println(A);
	
	try{
	A.set(5, y);
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Index out of bounds!");
	}
	try{
	    A.add(3, y);
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Index out of bounds!");
	}

	A.add(y);
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
