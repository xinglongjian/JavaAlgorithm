package com.xinglongjian.java.queue;

import com.xinglongjian.java.stack.EmptyStackException;

/**
 * description:
 *
 * @author zwl
 *
 * 2014年7月14日 下午2:28:12
 *
 */
public interface Queue<E>
{
    public int size();
    
    public boolean isEmpty();
    
    /**
     * 取出头部的元素
     * @return
     * @throws EmptyQueueException
     */
    public E front() throws EmptyQueueException;

    /**
     * 向尾部添加
     * @param element
     */
    public void enqueue(E element);
    
    /**
     * 从头部拿
     * @return
     * @throws EmptyQueueException
     */
    public E dequeue() throws EmptyQueueException;
    
    
}
