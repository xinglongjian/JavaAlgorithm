package com.xinglongjian.java.singlelink;

/**
 * 
 * @author root
 *
 */
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
		node.setNextNode(head);
		head=node;
		if(size==0)
			tail=head;
		size++;
		
	}
	
	public void addLast(int v)
	{
		Node node=new Node(v);
		node.setNextNode(null);
		if(size==0)
			head=node;
		else
			tail.setNextNode(node);
		tail=node;
		size++;
	}
	
	public int removeFirst()
	{
		int v=0;
		if(size==0)
			v=0;
		if(size==1)
		{
			v=head.getValue();
			head=null;
			tail=null;
		}
		else
		{
			v=head.getValue();
			head=head.getNextNode();
		}
		size--;
		return v;
	}
    
}
