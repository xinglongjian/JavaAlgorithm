package com.xinglongjian.java.queue;

/**
 * description:
 *
 * @author zwl
 *
 * 2014年7月15日 上午8:37:17
 *
 */
public class DLNode<E>
{
    E element;
    DLNode<E> next;
    DLNode<E> prev;
    public DLNode()
    {
        next=null;
        prev=null;
    }
    
    public DLNode(E e,DLNode<E> next,DLNode<E> prev)
    {
        next=null;
        prev=null;
    }
    
    public E getElement()
    {
        return element;
    }
    
    public void setElement(E element)
    {
        this.element=element;
    }
    
    public DLNode<E> getNextNode()
    {
        return next;
    }
    
    public void setNextNode(DLNode<E> next)
    {
        this.next=next;
    }
    
    public DLNode<E> getPrevNode()
    {
        return prev;
    }

    public void setPrevNode(DLNode<E> prev)
    {
        this.prev=prev;
    }
}
