package com.vilas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	
	private Queue<Integer> stack;
	private Queue<Integer> tempQueue;
	
	public StackUsingQueue() {
		stack = new LinkedList<Integer>();
		tempQueue = new LinkedList<Integer>();
		
	}
	public void push(int data) {
		//if no element is present add the 1st element in the stack
		if(stack.isEmpty())
			stack.add(data);
		//if an element already exists then perform dequeue and enquque operations
		
		else {
			//empty the stack in temporary queue i.e. dequue
			for(int i=0; i<stack.size(); i++)
				tempQueue.add(stack.remove());
			//add the element in the stack
			
			stack.add(data);
			//now add the elements from temp queue to stack i.e.enqueue
			
			for(int i=0; i<stack.size(); i++)
				tempQueue.add(stack.remove());
		}
			
		}
		public int pop()
		{
			if(stack.isEmpty())
				throw new RuntimeException("Stack Underfloe");
			return stack.remove();
		}
	public int size()
	{
		return stack.size();
	}
	public boolean isEmpty()
	{
		return stack.size()==0;
	}
	public void display()
	{
		if(isEmpty())
			System.out.println("Stack is Empty");
		else {
			Iterator<Integer> iter = stack.iterator();
			while(iter.hasNext()) {
				System.out.println(iter.next()+" ");
			}
			System.out.println();
		}
	}
}
