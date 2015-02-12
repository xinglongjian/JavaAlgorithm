package com.xinglongjian.java.singlelink;

public class SinglyLInkList {
	private Node head=null;
	private Node tail=null;
	private int size=0;
	
	public SinglyLInkList(){}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public int first()
	{
		if(isEmpty())
			return 0;
		return head.getValue();
	}
	
	public int last()
	{
		if(isEmpty())
			return 0;
		return tail.getValue();
	}
	
	public void addFirst(int v)
	{
		Node node=new Node(v);
		if(head!=null)
			node.setNextNode(head);
		head=node;
		
	}
	
	public void addLast(int v)
	{
		Node node=new Node(v);
		
	}
    
}
