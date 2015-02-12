package com.xinglongjian.java.list;

/**
 * description:
 *
 * @author zwl
 *
 * 2014年7月16日 上午8:43:50
 *
 */
public interface PositionList<E>
{
    public int size();
    public boolean isEmpty();
    public Position<E> first();
    public Position<E> last();
    public Position<E> next(Position<E> p);
    public Position<E> prev(Position<E> p);
    public void addFirst(E e);
    public void addLast(E e);
    public void addAfter(Position<E> p,E e);
    public void addBefore(Position<E> p,E e);
    public E remove(Position<E> p);
    public E set(Position<E> p,E e);

}
