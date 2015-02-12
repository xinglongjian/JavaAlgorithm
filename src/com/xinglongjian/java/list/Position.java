package com.xinglongjian.java.list;

/**
 * description:
 *
 * @author zwl
 *
 * 2014年7月16日 上午8:43:20
 *
 */
public interface Position<E>
{
    E element() throws InvalidPositionException;
}
