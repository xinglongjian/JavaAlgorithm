package com.xinglongjian.java.stack;

/**
 * description:
 *
 * @author zwl
 *
 * 2014��7��9�� ����5:31:50
 *
 */
public interface Stack<E>
{
    public int size();
    
    public boolean isEmpty();
    
    public E top()throws EmptyStackException;
    
    public void push(E element);
    
    public E pop() throws EmptyStackException;

}
