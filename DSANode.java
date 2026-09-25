import java.*;
class Node{
		int data;
		Node next;
		Node(int data){this.data = data;}
}

class DSANode{
	public static void main(String args[]){
		Stack s1 = new Stack();
		s1.push(100);
		s1.push(200);
		s1.push(300);
		s1.push(400);
		s1.push(500);
		s1.printStack(); //[500, 400, 300, 200, 100]		
	}
}
