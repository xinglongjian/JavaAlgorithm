package com.xinglongjian.java.list;

/**
 * description:
 *
 * @author zwl
 *
 * 2014年7月15日 下午5:23:08
 *
 */
public class ArrayIndexList<E> implements IndexList<E>
{
    private E[] A;
    private int capacity=16;
    private int size=0;
    
    @SuppressWarnings("unchecked")
    public ArrayIndexList()
    {
        A=(E[]) new Object[capacity];
    }
    
    /* (non-Javadoc)
     * @see com.xinglongjian.java.list.IndexList#size()
     */
    @Override
    public int size()
    {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see com.xinglongjian.java.list.IndexList#isEmpty()
     */
    @Override
    public boolean isEmpty()
    {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see com.xinglongjian.java.list.IndexList#add(int, java.lang.Object)
     */
    @SuppressWarnings("unchecked")
    @Override
    public void add(int r, E e) throws IndexOutOfBoundsException
    {
        // TODO Auto-generated method stub
        checkIndex(r,size+1);
        
        if(size==capacity)
        {
            capacity*=2;
            E[] B=(E[])new Object[capacity];
            for(int i=0;i<size;i++)
            {
                B[i]=A[i];
            }
            A=B;
        }
        for(int k=size-1;k>=r;k--)
        {
            A[k+1]=A[k];
        }
        A[r]=e;
        size++;
    }

    /* (non-Javadoc)
     * @see com.xinglongjian.java.list.IndexList#get(int)
     */
    @Override
    public E get(int i) throws IndexOutOfBoundsException
    {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.xinglongjian.java.list.IndexList#remove(int)
     */
    @Override
    public E remove(int i) throws IndexOutOfBoundsException
    {
        // TODO Auto-generated method stub
        checkIndex(i, size);
        E temp=A[i];
        for(int k=i;k<size-1;k++)
        {
            A[i]=A[i+1];
        }
        size--;
        return temp;
    }

    /* (non-Javadoc)
     * @see com.xinglongjian.java.list.IndexList#set(int, java.lang.Object)
     */
    @Override
    public E set(int i, E e) throws IndexOutOfBoundsException
    {
        // TODO Auto-generated method stub
        
        
        return null;
    }

    
    private void checkIndex(int index,int sum) throws IndexOutOfBoundsException
    {
        if(index>sum)
            throw new IndexOutOfBoundsException(" OUT OF INDEX");
    }
}
