package linkedlistbasic;

public class BasicLinked {
	
	public static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
		}
	}
	
	public static void main(String[] args) {
		
		Node a = new Node(4);
		Node b = new Node(5);
		Node c = new Node(7);
		Node d = new Node(10);
		
		System.out.println(a);
		
		
	}

}
