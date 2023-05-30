package com.linkedlist2;

public class Demo {
	
	public static int length(Node head) {
		int count = 0;
		while(head != null) {
			count++;
			head = head.next;
		}
		return count;
	}
		
	public static void display(Node head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	
	public static void displayr(Node head) {
		if(head == null)return;
		System.out.println(head.data);
		displayr(head.next);
	}
	
	public static void displayrevers(Node head) {
		if(head == null)return;
		displayrevers(head.next);
		System.out.print(head.data+" ");
	}
	
	public static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	

	
	public static void main(String[] args) {
		
		Node a = new Node(2);
		Node b = new Node(5);
		Node c = new Node(3);
		Node d = new Node(8);
		Node e = new Node(10);
		
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		System.out.println(length(a));
		
		displayrevers(a);
		System.out.println();
//		System.out.println(a.next);
//		System.out.println(b);
		Node temp = a;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}

}
