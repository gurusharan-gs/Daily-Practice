package com.linkedlist2;

public class Basics {
	
	public static int length(Node head) {
		int count = 0;
		while(head != null) {
			count++;
			head = head.next;
		}
		return count;
	}
	
	public static void displayr(Node head) {
		if(head == null) return;
		System.out.print(head.data+" ");
		displayr(head.next);
	}
	
	public static void display(Node head) {
		
		while(head != null) {
			System.out.print(head.data +" ");
			head = head.next;
		}
	}
	
	public static class Node{
		int data;  // value
		Node next; // address of next node
		
		Node(int data){ // constructor for node
			this.data = data;
		}
	}
	
	public static void main(String[] args) {
		
		Node a = new Node(5);
		Node b = new Node(6);
		Node c = new Node(8);
		Node d = new Node(9);
		Node e = new Node(11);
//		Node f = new Node (12);
		
//		System.out.println(a);
		
	 // connecting linkedlist each other
		a.next = b; // 5 -> 6 8 9 11
		b.next = c; // 5 -> 6 -> 8 9 11
		c.next = d; // 5 -> 6 -> 8 -> 9 11
		d.next = e; // 5 -> 6 -> 8 -> 9 -> 11
//		e.next = f;
//		display(a);
//		System.out.println();
//		displayr(a);
		System.out.println(length(a));
		

		
//		System.out.println(a.next.data);
//		System.out.println(b);
		
//		System.out.println(a.data);
//		System.out.println(a.next.data);
//		System.out.println(a.next.next.data);
//		System.out.println(a.next.next.next.data);
//		System.out.println(a.next.next.next.next.data);
		
		
//		Node temp = a;
////		System.out.println(temp.data);
//		for(int i=1; i<=5; i++) {
//			System.out.print(temp.data +" ");
//			temp = temp.next;
//		}
		
		
		
	}

}
