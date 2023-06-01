package com.linkedlist2;

public class NthNodeFromEnd {

	public static class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
		}
	}

	public static Node nthNode(Node head, int n) {

		Node temp = head;
		int size = 0;

		while (temp != null) {
			size++;
			temp = temp.next;
		}

		int m = size - n + 1;

		temp = head;
		for (int i = 1; i <= m - 1; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public static Node nthNode2(Node head, int n) {

		Node slow = head;
		Node fast = head;

		for (int i = 1; i <= n; i++) {
			fast = fast.next;
		}

		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}

	public static Node deleteNthNodefromEnd(Node head, int n) {

//		Node slow = head;
//		Node fast = head;
//
//		for (int i = 1; i <= n; i++) {
//			fast = fast.next;
//		}
//
//		if (fast == null) {
//			head = head.next;
//			return head;
//		}
//
//		while (fast.next != null) {
//			slow = slow.next;
//			fast = fast.next;
//		}
//		slow.next = slow.next.next;
//		return head;
		
	     Node slow = head;
	     Node fast = head;

	     for(int i=1; i<=n; i++){
	         fast = fast.next;
	     }

	     if(fast == null){
	         head = head.next;
	         return head;
	     }
	
	    while(fast.next != null){
	        slow = slow.next;
	        fast = fast.next;
	    }

	    // slow.next = slow.next.next;
	    slow.next = slow.next.next;
	    return head;
	    
	}

	public static void display(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static Node findingNthNodeFromEnd(Node head, int n) {
		Node slow = head;
		Node fast = head;

		for (int i = 1; i <= n; i++) {
			fast = fast.next;
		}

		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}

	public static void main(String[] args) {

		Node a = new Node(100);
		Node b = new Node(10);
		Node c = new Node(5);
		Node d = new Node(2);
		Node e = new Node(8);
		Node f = new Node(13);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;

//		display(a);
		a = deleteNthNodefromEnd(a, 3);
		display(a);

	}

}
