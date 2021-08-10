package com.interview.ds.questions;

public class ReverseLinkedList {
	
	//1 -> 2-> 3 -> 4
	//4 -> 3 -> 2 -> 1
	public static void main(String[] args) {
		Node node4 = new Node(4,null);
		Node node3 = new Node(3, node4);
		Node node2 = new Node(2, node3);
		Node node1 = new Node(1, node2);
		Node result = reverseLinkedList(node1);
		if(result != null)
			print(result);
	}
	
	public static void print(Node node) {
		Node temp = node;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static Node reverseLinkedList(Node root) {
		
		if (root == null) {
			return null;
		}
		Node curr = root;
		Node prev = null;
		Node next = null;
		
		while (curr != null) {
			next = curr.next;//3
			curr.next = prev;// 1<-2<-3
			prev = curr; //1
			curr = next;//1
		}
		
		return prev;
	}


}

class Node {
	int data;
	Node next;
	
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
}
