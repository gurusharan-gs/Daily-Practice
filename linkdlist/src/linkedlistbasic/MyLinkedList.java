package linkedlistbasic;

public class MyLinkedList {
	
	public static void display(Node head) {
		Node temp = head;
	    while(temp != null) {
	    	System.out.print(temp.data + " ");
	    	temp = temp.next;
	    }
	}
	
//	linkedlist print throuth recaration
	public static void displayr(Node head) {
		if (head == null) {
			return;
		}
		System.out.print(head.data + " ");
		displayr(head.next);
	}
	
	public static void displayReverace(Node head) {
		if(head == null) return;
		displayReverace(head.next);
		System.out.println(head.data + " ");
	}
	
	public static int length(Node head) {
		
		int count = 0;
		while(head != null) {
			count++;
			head = head.next;
		}
		return count;
	}
	
	public static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			super();
			this.data = data;
		}
		
	}
	
	public static void main(String[] args) {
		
		Node a = new Node(5);
		Node b = new Node(7);
		Node c = new Node(9);
		Node d = new Node(10);
		Node e = new Node(12);
		Node f = new Node(15);
		
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		
//		printing linkedlist 1.
//		System.out.println(a.data);
//		System.out.println(a.next.data);
//		System.out.println(a.next.next.data);
//		System.out.println(a.next.next.next.data);
//		System.out.println(a.next.next.next.next.data);
		
		
//		printing linkedlist 2.
//		for(int i=1; i<=5; i++) {
//			System.out.println(temp.data);
//			temp = temp.next;
//		}
		
//		Node temp = a;
//		while(temp != null) {
//			System.out.print(temp.data + " ");
//			temp = temp.next;
//		}
		
//		display(a);
//		System.out.println();
//		displayr(a);
//		System.out.println();
//		displayReverace(a);
//		System.out.println(length(a));
		
		
	}

}
