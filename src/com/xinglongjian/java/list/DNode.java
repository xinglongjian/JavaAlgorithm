package com.xinglongjian.java.list;

/**
 * description:
 *
 * @author zwl
 *
 * 2014年7月16日 下午3:59:23
 *
 */
public class DNode<E> implements Position<E>
{
    private DNode<E> prev,next;
    private E element;
    
    public DNode(DNode<E> newPrev,DNode<E> newNext,E e)
    {
        prev=newPrev;
        next=newNext;
        element=e;
    }
    /* (non-Javadoc)
     * @see com.xinglongjian.java.list.Position#element()
     */
    @Override
    public E element() throws InvalidPositionException
    {
        // TODO Auto-generated method stub
        if(prev==null&&next==null)
            throw new InvalidPositionException("");
        return element;
    }
    
    public DNode<E> getNext()
    {
        return next;
    }
    
    public DNode<E> getPrev()
    {
        return prev;
    }
    
    public void setNext(DNode<E> newNext) { next = newNext; }
    public void setPrev(DNode<E> newPrev) { prev = newPrev; }
    public void setElement(E newElement) { element = newElement; }

}
