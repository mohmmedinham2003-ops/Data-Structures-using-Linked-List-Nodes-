//Stack
import java.*;
class Node{
		int data;
		Node next;
		Node(int data){this.data = data;}
}
class Stack{
		private Node top;
		public void push(int data){
				Node n1 = new Node(data);
				n1.next = top;
				top = n1;
		}
		public void pop(){
				if(top!=null){
						top = top.next
				}
		}
		public void printStack(){
			System.out.print("[");
			Node temp = top;
			while(temp!=null){
				System.out.print(temp.data+",")
				temp = temp.next;;
			}
			System.out.print(isEmpty()?"empty]":"\b\b");
		}
		
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
//Queue
class Node{
		int data;
		int next;
		Node(int data){this.data = data;}
}
class Queue{
	private Node front;
	public void add(int data){
		Node n1=new Node(data);
		//find the last node
		if(isEmpty()){
			front=n1;
		}else{
			Node lastNode=front;
			while(lastNode.next!=null){
				lastNode=lastNode.next;
			}
			lastNode.next=n1;
		}
	}
	
	public void remove(){
		if(front!=null){
			front=front.next;
		}
	}
	
	public void printQueue(){
		System.out.print("[");
		Node temp=front;
		while(temp!=null){
			System.out.print(temp.data+", ");
			temp=temp.next;
		}
		System.out.println(isEmpty() ?"empty]":"\b\b]");
	}

	public int size(){
		Node temp=front;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}

	public boolean isEmpty(){
		return front==null;
	}
	public void clear(){
		front=null;
	}
	public int search(int data){
		Node temp=front;
		int index=0;
		while(temp!=null){
			if(temp.data==data){
				return index;
			}
			index++;
			temp=temp.next;
		}
		return -1;
	}
	public int[] toArray(){
		int[] tempDataArray=new int[size()];
		Node temp=front;
		for (int i = 0; i < tempDataArray.length; i++)	{
			tempDataArray[i]=temp.data;
			temp=temp.next;
		}
		return tempDataArray;
	}
	
}

class DSANode{
	public static void main(String args[]){
	Queue q1 = new Queue();	
	}
}
