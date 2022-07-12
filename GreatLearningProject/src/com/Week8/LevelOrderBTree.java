package com.Week8;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrderBTree {
	
	static int value;
	static Scanner sc= new Scanner(System.in);
	
	Deque<Node>queue = new LinkedList<Node>();
	
	static class Node{
		int key;
		Node left;
		Node right;
	}
	static Node newNode(int data){
		Node temp = new Node();
		
		temp.key=data;
		temp.left=null;
		temp.right=null;
		
		return temp;
	}
	Node insertNode(Node root, int key) {
		Node newnode = newNode(key);
		
		if(root==null) {
			root=newnode;
			queue.add(root);
			return root;
		}else {
			Node node;
			node=queue.remove();
			
			System.out.println("parent is:"+node.key);
			if(node.left==null) {
				node.left=newnode;
				queue.add(node.right);
				return root;
			}
		}
		return root;
	}
	public void levelOrder(Node root) {
		Queue<Node>queue1=new LinkedList<Node>();
		queue1.add(root);
		while(!queue1.isEmpty()) {
			Node tempNode=queue1.poll();
			System.out.println(tempNode.key+" ");
			
			if(tempNode.left!=null) {
				queue1.add(tempNode.left);
				
			}
			if(tempNode.right!=null) {
				queue1.add(tempNode.right);
			}
		}
	}

public static void main(String[]args) {
	LevelOrderBTree levelOrder = new LevelOrderBTree();
	
	Node root = null;
	String status = "a";
	while(!status.equals("s")){
			System.out.println("Enter value to insert:");
			value = sc.nextInt();
			root = levelOrder.insertNode(root, value);
			System.out.println("Binary Tree using level order Traversal");
			levelOrder.levelOrder(root);
			
			System.out.println("\nEnter s to stop ar any char to continue insertion");
			status = sc.next();
}
	System.out.println("Program Completed successfully!!!");
}
}