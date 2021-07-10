package Lecture1;

import java.util.ArrayList;

public class treeNodeClass<T> {
	T data;
	ArrayList<treeNodeClass<T>> children;
	
	public treeNodeClass(T data) {
		this.data = data;
		children = new ArrayList<>();
	}
}
