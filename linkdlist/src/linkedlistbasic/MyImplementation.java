package linkedlistbasic;

public class MyImplementation {

	public static class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}

	}

	public static class linkedlist {
		Node head = null;
		Node tail = null;

		void insertAtEnd(int val) {
			Node temp = new Node(val);

			if (head == null) {
				head = temp;
			} else {
				tail.next = temp;
			}
			tail = temp;
		}

		void insertAtHead(int val) {
			Node temp = new Node(val);
			if (head == null) {
				head = temp;
				tail = temp;
			} else {
				temp.next = head;
				head = temp;
			}
		}

		void display() {
			Node temp = head;
			while (temp != null) {
				System.out.println(temp.data + " ");
				temp = temp.next;
			}
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

		linkedlist l1 = new linkedlist();
		l1.insertAtEnd(2);
		l1.insertAtEnd(3);
		l1.insertAtEnd(5);
		l1.insertAtEnd(6);
		

//		l1.display();
//		System.out.println();
//		System.out.println(l1.size());
		
		l1.insertAtHead(9);
		l1.insertAtEnd(10);
		l1.display();

	}

}
