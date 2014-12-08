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
	    for (int x = size(); x > i; x --){
		A[x] = A[x - 1];
	    }
	    A[i] = e;
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
   
    public int find(String target){
	return findHelper(target, 0, size());
    }

    public int findHelper(String target, int start, int end){
	if (size() > 0){
	    if (start > end){
		return -1;
	    }
	    int mid = (start + end) / 2;
	    if (A[mid].compareTo(target) > 0){
		return findHelper(target, start, mid);
	    }else if (A[mid].compareTo(target) < 0){
		return findHelper(target, mid, end);
	    }else{
		return firstInstance(mid);
	    }
	}else{
	    return -1;
	}
    }

    public int firstInstance(int i){
	int index = i;
	for (int x = i - 1; x >= 0; x --){
	    if (A[x].equals(A[i])){
		index = x;
	    }
	}
	return index;
    }

}
