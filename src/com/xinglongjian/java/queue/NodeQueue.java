package com.xinglongjian.java.queue;

import com.xinglongjian.java.stack.NodeE;

/**
 * description:
 *
 * @author zwl
 *
 * 2014年7月14日 下午2:43:53
 *
 */
public class NodeQueue<E> implements Queue<E>
{
   private NodeE<E> head;
   private NodeE<E> tail;
   private int size=0;
   
   public NodeQueue()
   {
       this.head=null;
   }
   
    /* (non-Javadoc)
     * @see com.xinglongjian.java.queue.Queue#size()
     */
    @Override
    public int size()
    {
        // TODO Auto-generated method stub
        return size;
    }

    /* (non-Javadoc)
     * @see com.xinglongjian.java.queue.Queue#isEmpty()
     */
    @Override
    public boolean isEmpty()
    {
        // TODO Auto-generated method stub
        if(head==null)
            return true;
        return false;
    }

    /* (non-Javadoc)
     * @see com.xinglongjian.java.queue.Queue#front()
     */
    @Override
    public E front() throws EmptyQueueException
    {
        // TODO Auto-generated method stub
        
        return head.getElement();
    }

    /* (non-Javadoc)
     * @see com.xinglongjian.java.queue.Queue#enqueue(java.lang.Object)
     */
    @Override
    public void enqueue(E element)
    {
        // TODO Auto-generated method stub
        NodeE<E> node=new NodeE<E>();
        node.setElement(element);
        node.setNext(null);
        if(size==0)
            head=node;
        else
            tail.setNext(node);
        tail=node;
        size++;
    }

    /* (non-Javadoc)
     * @see com.xinglongjian.java.queue.Queue#dequeue()
     */
    @Override
    public E dequeue() throws EmptyQueueException
    {
        // TODO Auto-generated method stub
        if(size==0)
            throw new EmptyQueueException("queue is empty");
        E tmp=head.getElement();
        head=head.getNext();
        size--;
        if(size==0)
            tail=null;
        return tmp;
    }

}
