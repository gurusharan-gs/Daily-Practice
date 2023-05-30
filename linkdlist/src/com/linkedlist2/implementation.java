package com.linkedlist2;

public class implementation {

	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static class linkedList {
		Node head = null;
		Node tail = null;

		void insertAtEnd(int val) {
			Node temp = new Node(val);
			if (head == null) {
				head = temp;
				tail = temp;
			} else {
				tail.next = temp;
				tail = temp;
			}
		}

		void inserAtHead(int val) {
			Node temp = new Node(val);
			if (head == null) {
//				head = temp;
//				tail = temp;
//				head = tail = temp;
				insertAtEnd(val);
			} else {
				temp.next = head;
				head = temp;
			}
		}

		void inserAt(int idx, int val) {
			Node t = new Node(val);

			if (idx == size()) {
				insertAtEnd(val);
				return;
			} else if (idx == 0) {
				inserAtHead(val);
				return;
			} else if (idx < 0 || idx > size()) {
				System.out.println("worng index");
				return;
			}

			Node temp = head;
			for (int i = 1; i <= idx - 1; i++) {
				temp = temp.next;
			}
			t.next = temp.next;
			temp.next = t;
		}

		int getAt(int idx) {
			
			if (idx < 0 || idx > size()) {
				System.out.println("worng index");
				return -1;
			}
			
			Node temp = head;
			for(int i=1; i<=idx; i++) {
				temp = temp.next;
			}
			return temp.data;
		}
		
		void deleteAt(int idx) {
			if(idx == 0) {
				head = head.next;
				return;
			}
			
			Node temp = head;
			for(int i=1; i<=idx-1; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
			tail = temp;
		}
		
		void display() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}

		int size() {
			Node temp = head;
			int count = 0;
			while (temp != null) {
				count++;
				temp = temp.next;
			}
			return count;
		}

	}

	public static void main(String[] args) {

		linkedList ll = new linkedList();
		ll.insertAtEnd(2);
//        ll.display();
		ll.insertAtEnd(5);
//        ll.display();
		ll.insertAtEnd(4);
//        ll.display();
		ll.insertAtEnd(3);
//        ll.display();
		ll.inserAtHead(10);
		ll.display();
		ll.inserAt(4, 20);
		ll.display();
		ll.deleteAt(2);
		ll.display();

		System.out.println();
		System.out.println(ll.size());

	}

}
