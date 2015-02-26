package com.xinglongjian.java.singlelink;

/**
 * 
 * @author root
 *
 */
public class SinglyLInkList<E> {
	
	private Node<E> head=null;
	private Node<E> tail=null;
	private int size=0;
	
	public SinglyLInkList(){}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public E first()
	{
		if(isEmpty())
			return null;
		return head.getValue();
	}
	
	public E last()
	{
		if(isEmpty())
			return null;
		return tail.getValue();
	}
	
	public void addFirst(E v)
	{
		Node<E> node=new Node<E>(v,head);
		head=node;
		if(size==0)
			tail=head;
		size++;
		
	}
	
	public void addLast(E v)
	{
		Node<E> node=new Node<E>(v,null);
		if(size==0)
			head=node;
		else
			tail.setNextNode(node);
		tail=node;
		size++;
	}
	
	public E removeFirst()
	{
		E v=null;
		if(size==0)
			v=null;
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
