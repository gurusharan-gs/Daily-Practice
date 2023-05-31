package com.linkedlist2;

public class Main {
	
	public static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	public static class linkedlist{
		Node head = null;
		Node tail = null;
		
		void insertAtEnd(int val) {
			Node temp = new Node(val);
			if(head == null) {
				head = temp;
				tail = temp;
			}else {
				tail.next = temp;
				tail = temp;
				
			}
		}
		
		void insertAtHead(int val) {
			Node temp = new Node(val);
			if(head == null) {
				head = temp;
				tail = temp;
			}else {
				temp.next = head;
				head = temp;
			}
		}
		
		void insertAt(int idx, int val) {
			Node t = new Node(val);
			Node temp = head;
			for(int i=1; i<=idx-1; i++) {
				temp = temp.next;
			}
			t.next = temp.next;
			temp.next = t;
		}
		
		int size() {
			Node temp = head;
			int count = 0;
			while(temp != null) {
				count++;
				temp = temp.next;
			}
			return count;
		}
		
		void deleteAt(int idx) {
			Node temp = head;
			for(int i=1; i<=idx-1; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
		
		void display() {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		linkedlist ll = new linkedlist();
		ll.insertAtEnd(4);
//		ll.display();
		ll.insertAtEnd(2);
//		ll.display();
		ll.insertAtEnd(7);
//		ll.display();
		ll.insertAtEnd(5);
//		ll.display();
		ll.insertAtHead(10);
		ll.display();
		System.out.println(ll.size());
		ll.deleteAt(1);
		ll.display();
	}

}
