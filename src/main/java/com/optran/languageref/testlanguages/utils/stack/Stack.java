package com.optran.languageref.testlanguages.utils.stack;

public class Stack<T> {
	private int size;
	private StackNode<T> top;

	public Stack() {
		top = null;
		size = 0;
	}

	public T peek() {
		if(null==top) {
			return null;
		} else {
			return top.getData();
		}
	}

	public void push(T data) {
		StackNode<T>newNode = new StackNode<T>();
		newNode.setData(data);
		newNode.setNext(top);
		top=newNode;
		size++;
	}

	public T pop() {
		if(isEmpty()) {
			return null;
		} else {
			StackNode<T>current = top;
			top=top.getNext();
			size--;
			return current.getData();
		}
	}

	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
}
