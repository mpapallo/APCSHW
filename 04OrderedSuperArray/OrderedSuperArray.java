public class OrderedSuperArray extends SuperArray{
    public OrderedSuperArray(){
	super(10);
    }
    public OrderedSuperArray(int size){
	super(size);
    }

    public void add(String e){
	if (size() == A.length){
	    resize(A.length *  2);
	    add(e);
	}else{
	    int i = 0;
	    while (i < size() && e.compareTo(A[i]) >= 0){
		i ++;
	    }
	    int index = i;
	    for (; i < size(); i ++){
		A[i + 1] = A[i];
	    }
	    A[index] = e;
	    numElements ++;

	}
    }

    public void add(int index, String e){
	add(e);
    }

    public String set(int index, String e){
	String x = get(index);
	remove(index);
	add(e);
	return x;
    }
    
}
