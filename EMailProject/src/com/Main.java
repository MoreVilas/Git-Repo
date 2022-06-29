package com;

public class Main {
 public static void main(String args[]) {
	 StackImplementation s = new StackImplementation();
	 s.push(2);
	 s.push(45);
	 s.push(65);
	 s.push(21);
	 s.push(60);
	 System.out.println(s.pop() + "Pooped from stack");
	 System.out.println(s.pop() + "Pooped from stack");
	 System.out.println(s.pop() + "Pooped from stack");
	 System.out.println(s.pop() + "Pooped from stack");
	 System.out.println(s.pop() + "Pooped from stack");
	 System.out.println(s.pop() + "Pooped from stack");
	 System.out.println("Elements present in stack :");
	 s.printStack();
 }
}
