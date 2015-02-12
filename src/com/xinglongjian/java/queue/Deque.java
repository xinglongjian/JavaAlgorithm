package com.xinglongjian.java.queue;

/**
 * description:能从双向进行添加、删除的
 *
 * @author zwl
 *
 * 2014年7月14日 下午2:55:30
 *
 */
public interface Deque<E>
{
    public int size();
    
    public boolean isEmpty();
    
    public E getFirst() throws EmptyQueueException;
    
    public E getLast() throws EmptyQueueException;
    
    public void addFirst(E element);
    
    public void addLast(E element);
    
    public E removeFirst() throws EmptyQueueException;
    
    public E removeLast() throws EmptyQueueException;
    

}
