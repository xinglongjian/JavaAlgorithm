package com.xinglongjian.java.tree;

import com.xinglongjian.java.list.InvalidPositionException;
import com.xinglongjian.java.list.Position;

/**
 * description:
 *
 * @author zwl
 *
 * 2014年7月16日 下午4:24:13
 *
 */
public class TreeUtil
{
    /**
     * 获取树的深度
     * @param T
     * @param v
     * @return
     * @throws InvalidPositionException
     * @throws BoundaryViolationException
     */
    public static <E> int depth(Tree<E> T,Position<E> v) throws InvalidPositionException, BoundaryViolationException
    {
        if(T.isRoot(v))
            return 0;
        else
            return 1+depth(T, T.parent(v));
            
    }
}
