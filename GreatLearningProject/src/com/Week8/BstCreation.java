package com.Week8;

import java.util.Scanner;

public class BstCreation {
	
	static class Node{
		int key;
		Node left, right;
	};
	
	static Node newNode(int data) {
		Node temp= new Node();
		
		temp.key=data;
		temp.left=null;
		temp.right=null;
		
		return temp;
		
		
	}
static Node insert(Node root, int key) {
	
	Node newnode= newNode(key);
	Node x=root;
	Node y=null;
	
	while(x !=null) {
		y=x;
		if(key<x.key)
			x=x.left;
		else if(key>x.key)
			x=x.right;
		else {
			System.out.println("Value already exists!!!");
			return newnode;
		}
	}
	if(y==null)
		y=newnode;
	
	else if(key<y.key)
		y.left=newnode;
	else
		y.right=newnode;
	
	return y;
}
static void Inorder(Node root) {
	if(root==null)
		return;
	else {
		Inorder(root.left);
		System.out.println(root.key+" ");
		Inorder(root.right);
	}
}
public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	int value, num;
	
	System.out.println("Enter no of value:");
	num=sc.nextInt();
	
	Node root=null;
	Node result=null;
	
	for(int i=0;i<num;i++) {
		System.out.println("\nInsert value at"+(i+1)+":");
		value = sc.nextInt();
		if(root==null) {
			root=insert(root, value);
			
		}else {
			result=insert(root, value);
			if(result.key==value)
				i-=1;
		}
		System.out.println("Inorder of Binary tree\n");
		Inorder(root);
	}
	sc.close();
}
}
