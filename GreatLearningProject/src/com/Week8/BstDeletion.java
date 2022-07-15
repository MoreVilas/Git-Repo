package com.Week8;

import java.util.Scanner;

public class BstDeletion {
	
	static class Node{
		int key;
		Node left, right;
	};
	
	static Node newNode(int data) {
		Node temp = new Node();
		
		temp.key=data;
		
		temp.left=null;
		temp.right=null;
		
		return temp;
	}
static Node insert(Node root,int key) {
	Node newnode= newNode(key);
	Node x = root;
	Node current_parent = null;
	
	while(x !=null) {
		current_parent = x;
		if(key<x.key)
			x=x.left;
		else if(key>x.key)
			x=x.right;
		else {
			System.out.println("Value already exists!!!");
			return newnode;
		}
	}
	if(current_parent==null)
		current_parent=newnode;
	
	else if(key<current_parent.key)
		current_parent.left=newnode;
	
	else
		current_parent.right=newnode;
	return current_parent;
	
}
static Node deleteNode(Node root, int key) {
	return delete_Recursive(root, key);
}
static Node delete_Recursive(Node root, int key) {
	
	if(root==null)
		return root;
	if(key<root.key)
		root.left=delete_Recursive(root.left, key);
	else if(key>root.key)
		root.right=delete_Recursive(root.right, key);
	else {
		if(root.left==null)
			return root.right;
		else if(root.right==null)
			return root.left;
		
		root.key=minValue(root.right);
		
		root.right=delete_Recursive(root.right, root.key);
					
	}
	return root;
}
static int minValue(Node root) {
	int minval = root.key;
	while(root.left!=null) {
		minval=root.left.key;
		root=root.left;
	}
	return minval;
}
static boolean search(Node root, int key) {
	root=search_Recursive(root, key);
		if(root !=null)
			return true;
		else
			return false;
}
static Node search_Recursive(Node root, int key) {
	if(root==null)
		return root;
	if(root.key>key)
		return search_Recursive(root.left, key);
	return search_Recursive(root.right, key);
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
	int value;
	boolean status;
	
	Node root=null;
	int[]arr = {44,17,28,29,88,65,97,54,82,67,80,78};
	
	for(int i=0; i<arr.length; i++) {
		value = arr[i];
		if(root==null) {
			root=insert(root, value);
		}else {
			insert(root, value);
		}
	}
	System.out.println("\nInorder of Binary Tree!!. Root is:"+root.key+"\n");
	Inorder(root);
	int stop=-1;
	while(stop !=0) {
		System.out.println("\nEnter value to delete.");
		int val= sc.nextInt();
		status  = search(root, val);
		
		if(status==true) {
			root=deleteNode(root, val);
			System.out.println("\nInorder of Binary Tree!!.Root is:"+root.key+"\n");
			Inorder(root);
			System.out.println("\nValue found and deleted successfully!!!\nEnter 0 to stop or any value to continue");
			if(sc.nextInt()==0) {
				stop=0;
			}
			
		}else {
			System.out.println("\nValue not found111"+"\nEnter 0 to stop or Enter any value to continue");
			if(sc.nextInt()==0) {
				stop=0;
			}
		}
	}
	System.out.println("Program completed successfully");
	sc.close();
}
}