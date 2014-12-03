public class SuperArray{
    public String[] A;
    public int numElements;

    public SuperArray(){
        this(10);
    }
    public SuperArray(int size){
	A = new String[size];
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

    public void add(String e){
	if (size() == A.length){
	    resize(A.length * 2);
	    add(e);
	}else{
	    A[size()] = e;
	    numElements ++;
	}
    }

    public void add(int index, String o){
	if (size() == A.length){
	    resize(A.length * 2);
	    add(index, o);
	}else{
	    if (!inRange(index)){
		throw new IndexOutOfBoundsException();
	    }
	    String[] ret = new String[A.length];
	    for (int i = 0; i < index; i ++){
		ret[i] = A[i];
	    }
	    ret[index] = o;
	    for (int i = index; i < size(); i ++){
		ret[i+1] = A[i];
	    }
	    A = ret;
	    numElements ++;
	}
    }

    public void resize(int newSize){
	String[] ret = new String[newSize];
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

    public String get(int index){
    	if (!inRange(index)){
    	    throw new IndexOutOfBoundsException();
    	}
    	return A[index];
    }

    public String set(int index, String e){
    	if (!inRange(index)){
    	    throw new IndexOutOfBoundsException();
    	}
    	String x = A[index];
    	A[index] = e;
    	return x;
    }
    
    public String remove(int index){
    	if (!inRange(index)){
    	    throw new IndexOutOfBoundsException();
    	}	
    	String x = A[index];
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

    public void sort(){
	for (int i = 0; i < size(); i ++){
	    String min = A[i];
	    for (int x = i; x < size(); x ++){
		if (A[x].compareTo(min) < 0){
		    min = A[x];
		}
	    }
	    add(i, min);
	}
    }
   
}
