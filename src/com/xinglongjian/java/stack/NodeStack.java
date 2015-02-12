package com.xinglongjian.java.stack;

import java.util.Arrays;

/**
 * description:使用链表模拟栈
 *
 * @author zwl
 *
 * 2014年7月11日 下午3:46:53
 *
 */
public class NodeStack<E> implements Stack<E>
{

    private NodeE<E> top;
    private int size=0;
    
    public NodeStack()
    {
        top=null;
        size=0;
    }
    /* (non-Javadoc)
     * @see com.xinglongjian.java.stack.Stack#size()
     */
    @Override
    public int size()
    {
        // TODO Auto-generated method stub
        return size;
    }

    /* (non-Javadoc)
     * @see com.xinglongjian.java.stack.Stack#isEmpty()
     */
    @Override
    public boolean isEmpty()
    {
        // TODO Auto-generated method stub
        if(top==null)
            return true;
        return false;
    }

    /* (non-Javadoc)
     * @see com.xinglongjian.java.stack.Stack#top()
     */
    @Override
    public E top() throws EmptyStackException
    {
        // TODO Auto-generated method stub
        if(isEmpty())
            throw new EmptyStackException("stack is empty");
        return top.getElement();
    }

    /* (non-Javadoc)
     * @see com.xinglongjian.java.stack.Stack#push(java.lang.Object)
     */
    @Override
    public void push(E element)
    {
        // TODO Auto-generated method stub
        NodeE<E> v=new NodeE<E>(element,top);
        top=v;
        size++;
    }

    /* (non-Javadoc)弹出
     * @see com.xinglongjian.java.stack.Stack#pop()
     */
    @Override
    public E pop() throws EmptyStackException
    {
        E e;
        // TODO Auto-generated method stub
        if(isEmpty())
            throw new EmptyStackException("stack is empty");
        e=top.getElement();
        top=top.getNext();
        size--;
        return e;
    }

    /**
     * 使用栈来反转数组
     * @param a
     */
    public static <E> void reverse(E[] a)
    {
        Stack<E> S=new ArrayStack<E>(a.length);
        for(int i=0;i<a.length;i++)
        {
            S.push(a[i]);
        }
        for(int i=0;i<a.length;i++)
        {
            a[i]=S.pop();
        }
    }
    public static void main(String args[]) {
        Integer[] a = {4, 8, 15, 16, 23, 42};  // autoboxing allows this
        String[] s = {"Jack", "Kate", "Hurley", "Jin", "Boone"};
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("s = " + Arrays.toString(s));
        System.out.println("Reversing...");
        reverse(a);
        reverse(s);
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("s = " + Arrays.toString(s));
      }
}
