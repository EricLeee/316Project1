package edu.ncsu.csc316.compression_manager.util;

public interface List {

	int size();
	
	boolean contains(Object o); 
	
	void add(Object o);
	
	Object remove(int idx);
	
	int indexof(Object o);
}
