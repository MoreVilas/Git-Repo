package com;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import org.w3c.dom.Node;

public class BinaryTree {

	static int value;
	static Scanner sc = new Scanner(System.in);
	
	Deque<Node>queue=new LinkedList<Node>();
	
	static class Node{
		int key;
		Node left;
		Node right;
		
	}
	
	static Node newNode(int data) {
		Node temp = new Node();
		
		temp.key = data;
		temp.left=null;
		temp.right=null;
		return temp;
	}
	
	Node insertNode(Node root, int key) {
		
		Node newnode = newNode(key);
		
		if(root==null) {
			root = newnode;
			queue.add(root);
			return root;
		}else {
			Node node;
			node=queue.remove();
			
			System.out.println("parent is :" + node.key);
			if(node.left==null) {
				node.left=newnode;
				queue.add(node.left);
				queue.addFirst(node);
				return root;
			}else if (node.right==null) {
				node.right=newnode;
				queue.add(node.right);
				return root;
			}
		}
		return root;
	}
	public void maxMinNode(Node root) {
		int max=root.key;
		int min=root.key;
		Queue<Node>queue1=new LinkedList<Node>();
		queue1.add(root);
		while(!queue1.isEmpty()) {
			Node tempNode=queue1.poll();
			
			if(tempNode.key>max) {
				max=tempNode.key;
			}
			if(tempNode.key<min) {
				min=tempNode.key;
			}
			if(tempNode.left!=null) {
				queue1.add(tempNode.left);
			}
			if(tempNode.right!=null) {
				queue1.add(tempNode.right);
				
			}
		}
		System.out.println("Maximum value in the tree is:" +max);
		System.out.println("Minimum value in the tree is:" +min);
	}
	
	public void levelByLevel(Node root) {
		Queue<Node>queue1=new LinkedList<Node>();
		queue1.add(root);
		while(!queue1.isEmpty()) {
			Node tempNode=queue1.poll();
			System.out.println(tempNode.key + "");
			
			if(tempNode.left!=null) {
				queue1.add(tempNode.left);
				
			}
			if(tempNode.right!=null) {
				queue1.add(tempNode.right);
			}
		}
	}
	public static void main(String[]args) {
		BinaryTree practicebt = BinaryTree();
		
		Node root = null;
		String status = "a";
		while (!status.equals("s")) {

			System.out.println("Enter value to insert:");

			value = sc.nextInt();

			root = practicebt.insertNode(root, value);

			System.out.println("Binary tree after insertion");

			practicebt.levelByLevel(root);

			System.out.println("\nEnter s to stop or any char to continue insertion");

			status = sc.next();

			}

			practicebt.maxMinNode(root);

			System.out.println("Program Completed successfully!!!");

			}

	private static BinaryTree BinaryTree() {
		// TODO Auto-generated method stub
		return null;
	}
}
