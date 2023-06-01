package com.linkedlist2;

import com.linkedlist2.NthNodeFromEnd.Node;

public class IntersectionofTwoLinked {
	
	 public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		 
		 /**
		  * assigning temporary varbale for don't 
		    changing both head values.
		  */
		 ListNode tempA = headA;
		 ListNode tempB = headB;
		 
		 /**
		  * hera taking lengthA
		  */
		 int lengthA = 0;
		 while(tempA != null) {
			 lengthA++;
			 tempA = tempA.next;
		 }
		 
		 /**
		  * hera taking lengthB
		  */
		 int lengthB = 0;
		 while(tempB != null) {
			 lengthB++;
			 tempB = tempB.next;
		 }
		 
		 /**
		  * assigning tempA and tempB value 
		  * again headA and headB
		  */
		 tempA = headA;
		 tempB = headB;
		 
		 /**
		  * we are chacking greater length 
		  * for here 
		  */
		 if(lengthA > lengthB) {
			 int steps = lengthA - lengthB;
			 for(int i=1; i<=steps; i++) {
				 tempA = tempA.next;
			 }
		 }else {
			 int steps = lengthB - lengthA;
			 for(int i=1; i<=steps; i++) {
				 tempB = tempB.next;
			 }
		 }
		 
		 /**
		  * here moving both value together 
		  * and we get our answer just return that value
		  */
		 while(tempA != tempB) {
			 tempA = tempA.next;
			 tempB = tempB.next;
		 }
		 return tempA;
	 }
	
		public static void display(Node head) {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.val + " ");
				temp = temp.next;
			}
			System.out.println();
		}
	 
	public static class ListNode{
		int data;
		ListNode next;
		
		ListNode(int data){
			this.data = data;
		}
	}
	
	public static void main(String[] args) {
		
		ListNode a1 = new ListNode(100);
		ListNode b1 = new ListNode(10);
		ListNode c1 = new ListNode(5);
		ListNode d1 = new ListNode(2);
		ListNode e1 = new ListNode(8);
		ListNode f1 = new ListNode(13);

		a1.next = b1;
		b1.next = c1;
		c1.next = d1;
		d1.next = e1;
		e1.next = f1;
		
		ListNode a2 = new ListNode(89);
		ListNode b2 = new ListNode(30);
		ListNode c2 = new ListNode(6);
		
		a2.next = b2;
		b2.next = c2;
		
		System.out.println(getIntersectionNode(a1, a2));
		
	
	}

}
