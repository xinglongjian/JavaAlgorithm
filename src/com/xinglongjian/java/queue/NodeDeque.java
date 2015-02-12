package com.xinglongjian.java.queue;

/**
 * description:
 *
 * @author zwl
 *
 * 2014年7月14日 下午3:23:56
 *
 */
public class NodeDeque<E> implements Deque<E>
{
    protected DLNode<E> header,tailer;
    protected int size;
    public NodeDeque()
    {
        header=new DLNode<E>();
        tailer=new DLNode<E>();
        header.setNextNode(tailer);
        tailer.setPrevNode(header);
        size=0;
    }
    

    /* (non-Javadoc)
     * @see com.xinglongjian.java.queue.Deque#size()
     */
    @Override
    public int size()
    {
        // TODO Auto-generated method stub
        return size;
    }

    /* (non-Javadoc)
     * @see com.xinglongjian.java.queue.Deque#isEmpty()
     */
    @Override
    public boolean isEmpty()
    {
        // TODO Auto-generated method stub
        if(size==0)
            return true;
        return false;
    }

    /* (non-Javadoc)
     * @see com.xinglongjian.java.queue.Deque#getFirst()
     */
    @Override
    public E getFirst() throws EmptyQueueException
    {
        // TODO Auto-generated method stub
        if(isEmpty())
            throw new EmptyQueueException("Queue is empty");
        return header.getElement();
    }

    /* (non-Javadoc)
     * @see com.xinglongjian.java.queue.Deque#getLast()
     */
    @Override
    public E getLast() throws EmptyQueueException
    {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.xinglongjian.java.queue.Deque#addFirst(java.lang.Object)
     */
    @Override
    public void addFirst(E element)
    {
        // TODO Auto-generated method stub
//        DLNode<E> node=new 
    }

    /* (non-Javadoc)
     * @see com.xinglongjian.java.queue.Deque#addLast(java.lang.Object)
     */
    @Override
    public void addLast(E element)
    {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.xinglongjian.java.queue.Deque#removeFirst()
     */
    @Override
    public E removeFirst() throws EmptyQueueException
    {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.xinglongjian.java.queue.Deque#removeLast()
     */
    @Override
    public E removeLast() throws EmptyQueueException
    {
        // TODO Auto-generated method stub
        return null;
    }

}
