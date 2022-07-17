package com.vilas;

import java.util.ArrayList;
import java.util.List;

class Node{
	int data;
	Node left, right;
	public Node(int data) {
		this.data=data;
		left = null;
		right = null;
	}
}
public class LeastCommanAncestor {
	Node root;
	private List<Integer> path1 = new ArrayList<Integer>();
	private List<Integer> path2 = new ArrayList<Integer>();
	
	//will return the LCA
	public int findLCA(int node1, int node2) {
		path1.clear();
		path2.clear();
		return findLCAInternal(root, node1, node2);
	}
	//iterate through the 2 paths created and check for a comman ancestor and return that
	private int findLCAInternal(Node root, int node1, int node2) {
		if(!findPath(root, node1, path1) || !findPath(root, node2, path2)){
			System.out.println(path1.size()>0 ?"Node 1 is present": "Node 1 is missing");
			System.out.println(path2.size()>0 ?"Node 2 is present": "Node 2 is missing");
			return -1;
		}
	    //30=> 10 20 20
		//40=> 10 20 40
		int i;
		for(i=0; i<path1.size() && i<path2.size();i++) 
		{
			if(! path1.get(i).equals(path2.get(i)))
				break;
		}
		return path1.get(i-1);
	}
	//find path for every node whose ancestor needs to be found else returns false if node does not exist
	private boolean findPath(Node root, int node1, List<Integer> path) {
		//30=>find path
		//1.root not null
		if(root==null)
			return false;
		//2.add data in the path
		path.add(root.data);
		//3.check if root data is equal to data in node1
		if(root.data==node1)
			return true;
		//4.root left is not null only then find path for that node
		if(root.left!=null && findPath(root.left, node1, path))
			return true;
		//4.root left is null only then find path for that node
		if(root.right!=null && findPath(root.right, node1, path))
			return true;
		path.remove(path.size()-1);
		
		return false;
	}
	
	public static void main(String[] args) {
		LeastCommanAncestor lca = new LeastCommanAncestor();
		lca.root = new Node(3);
		lca.root.left = new Node(6);
		lca.root.right= new Node(8);
		lca.root.left.left = new Node(2);
		lca.root.left.right = new Node(11);
		lca.root.left.right.left=new Node(9);
		lca.root.left.right.right=new Node(5);
		lca.root.right.left = new Node(7);
		lca.root.right.right = new Node(9);
		
		System.out.println(lca.findLCA(2, 8));
		System.out.println(lca.findLCA(2, 5));
		System.out.println(lca.findLCA(9, 5));
		System.out.println(lca.findLCA(8, 7));
		System.out.println(lca.findLCA(9, 3));
	}

}
