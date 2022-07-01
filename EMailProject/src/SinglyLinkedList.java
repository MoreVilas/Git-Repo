
  class Node {
	  public int nodeData;
	  public Node nextNode;
  }
public class SinglyLinkedList {
	private Node head;
	
	public void displayLinkedList() {
		Node currentNode = head;
		while(currentNode != null) {
			System.out.println(currentNode.nodeData + " -> ");
			currentNode = currentNode.nextNode;
		}
		System.out.println("NULL");
	}
	public void insertAtFront(int data) {
		Node newNode = new Node();
		newNode.nodeData = data;
		newNode.nextNode = head;
		head = newNode;
	}
	public static void main(String args[]) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		linkedList.insertAtFront(10);
		linkedList.insertAtFront(12);
		linkedList.insertAtFront(9);
		linkedList.displayLinkedList();
		linkedList.insertAtFront(70);
		linkedList.insertAtFront(40);
		linkedList.displayLinkedList();
		linkedList.insertAtFront(123);
		linkedList.displayLinkedList();
		linkedList.insertAtFront(15);
		linkedList.deleteAtFront();
		linkedList.deleteAtFront();
		linkedList.insertAtFront(19);
		
		
	}
	public void deleteAtFront() {
		head = head.nextNode;
		}
	public void deleteAtLast() {
		Node currentNode = head;
		if (head.nextNode == null) {
			head = null;
		} else {
			while (currentNode.nextNode.nextNode != null) {
				currentNode = currentNode.nextNode;
				}
			currentNode.nextNode = null;
		}
	}
	public void insertAtPos(int data, int pos) {
		Node currentNode = head;
		for(int i=0; i< pos-1; i++) {
			currentNode = currentNode.nextNode;
		}
	}
	
}

