package com.xinglongjian.java.stack;

/**
 * description:使用数组模拟栈
 *
 * @author zwl
 *
 * 2014��7��9�� ����5:36:47
 *
 */
public class ArrayStack<E> implements Stack<E>
{
    public int capacity;//当前容量
    public static final int CAPACITY=1000;//默认容量
    public E S[];
    public int top=0;
    
    
    public ArrayStack()
    {
        this(CAPACITY);
    }
    
    @SuppressWarnings("unchecked")
    public ArrayStack(int cap)
    {
        capacity=cap;
        S=(E[]) new Object[capacity];
    }

    /* (non-Javadoc)
     * @see com.xinglongjian.java.stack.Stack#size()
     */
    @Override
    public int size()
    {
        // TODO Auto-generated method stub
        return top;
    }

    /* (non-Javadoc)
     * @see com.xinglongjian.java.stack.Stack#isEmpty()
     */
    @Override
    public boolean isEmpty()
    {
        // TODO Auto-generated method stub
        return top<=0;
    }

    /* (non-Javadoc)
     * @see com.xinglongjian.java.stack.Stack#top()
     */
    @Override
    public E top() throws EmptyStackException
    {
        // TODO Auto-generated method stub
        if(isEmpty())
            throw new EmptyStackException("Stack is full");
        
        return S[top-1];
    }

    /* (non-Javadoc)
     * @see com.xinglongjian.java.stack.Stack#push(java.lang.Object)
     */
    @Override
    public void push(E element)
    {
        // TODO Auto-generated method stub
        if(size()==capacity)
            throw new FullStackException("Stack is full");
        S[top++]=element;
    }

    /* (non-Javadoc)
     * @see com.xinglongjian.java.stack.Stack#pop()
     */
    @Override
    public E pop() throws EmptyStackException
    {
        // TODO Auto-generated method stub
        E e;
        if(isEmpty())
            throw new EmptyStackException("Stack is empty");
        e=S[--top];
        S[top]=null;
        return e;
        
    }
    public String toString() {
        String s;
        s = "[";
        if (size() > 0) s+= S[0];
        if (size() > 1)
          for (int i = 1; i <= size()-1; i++) {
        s += ", " + S[i];
          }
        return s + "]";
      }
    public void status(String op, Object element) {
        System.out.print("------> " + op);   // print this operation
        System.out.println(", returns " + element); // what was returned
        System.out.print("result: size = " + size() + ", isEmpty = " + isEmpty());
        System.out.println(", stack: " + this);       // contents of the stack
      }
    
    public static void main(String[] args)
    {
        Object o;
        ArrayStack<Integer> A=new ArrayStack<Integer>();
        A.status("new ArrayStack<Integer> A", null);
        A.push(7);
        A.status("A.push(7)", null);
        o=A.pop();
        A.status("A.pop()", o);
        A.push(9);
        A.status("A.push(9)", null);
        o=A.pop();
        A.status("A.pop()", o);
        
        ArrayStack<String> B = new ArrayStack<String>();
        B.status("new ArrayStack<String> B", null);
        B.push("Bob");
        B.status("B.push(\"Bob\")", null);
        B.push("Alice");
        B.status("B.push(\"Alice\")", null);
        o = B.pop();
        B.status("B.pop()", o);
        B.push("Eve");
        B.status("B.push(\"Eve\")", null);
    }
}
