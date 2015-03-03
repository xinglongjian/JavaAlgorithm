package com.xinglongjian.java.singlelink;

public class DoublyLinkedList<E> {

	private DNode<E> header;
	private DNode<E> trailer;
	private int size=0;
	
	public DoublyLinkedList()
	{
		header=new DNode<E>(null,null,null);
		trailer=new DNode<E>(null,header,null);
		header.setNext(trailer);
	}
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size==0;
	}
	
	public E first()
	{
		if(isEmpty())
			return null;
		return header.getNext().getElement();
	}
	
	public E last()
	{
		if(isEmpty())
			return null;
		return trailer.getPrev().getElement();
	}
	
	private void addBetween(E e,DNode<E> predecessor,DNode<E> successor)
	{
		DNode<E> newest=new DNode<E>(e,predecessor,successor);
		predecessor.setNext(newest);
		successor.setPrev(newest);
		size++;
	}
	
	private E remove(DNode<E> node)
	{
		DNode<E> predecessor=node.getPrev();
		DNode<E> successor=node.getNext();
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		size--;
		return node.getElement();
	}
	
	public void addFirst(E e)
	{
		addBetween(e, header, header.getNext());
	}
	
	public void addLast(E e)
	{
		addBetween(e, trailer.getPrev(), trailer);
	}
	
	public E removeFirst()
	{
		if(isEmpty())
			return null;
		return remove(header.getNext());
	}
	
	public E removeLast()
	{
		if(isEmpty())
			return null;
		return remove(trailer.getPrev());
	}
	
}









