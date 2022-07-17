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
			int size = stack.size();
			for(int i=0; i<size(); i++)
				tempQueue.add(stack.remove());
			//add the element in the stack
			
			stack.add(data);
			//now add the elements from temp queue to stack i.e.enqueue
			
			for(int i=0; i<size(); i++)//2
				tempQueue.add(tempQueue.remove());//1
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
	public static void main(String[]args) {
		StackUsingQueue s1 = new StackUsingQueue();
		System.out.println(s1.isEmpty());
		//s1.pop();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		System.out.println(s1.isEmpty());
		s1.display();
	}
}
