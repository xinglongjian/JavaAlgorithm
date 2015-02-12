package com.xinglongjian.java.tree;

import java.util.Iterator;

import com.xinglongjian.java.list.InvalidPositionException;
import com.xinglongjian.java.list.Position;

/**
 * description:
 *
 * @author zwl
 *
 * 2014年7月14日 下午3:37:56
 *
 */
public interface Tree<E>
{
    public boolean isEmpty();
    
    public int size();
    
    public Iterator<E> iterator();
    
    public Iterable<Position<E>> positions(); 
    
    public E replace(Position<E> v,E e)throws InvalidPositionException;
    
    public Position<E> root() throws EmptyTreeException;
    
    public Position<E> parent(Position<E> e)throws InvalidPositionException,BoundaryViolationException;
    
    public Iterable<Position<E>> children(Position<E> e)throws InvalidPositionException;
    
    public boolean isInternal(Position<E> e)throws InvalidPositionException;;
    
    public boolean isExternal(Position<E> e)throws InvalidPositionException;;
    
    public boolean isRoot(Position<E> e)throws InvalidPositionException;;
    
}
