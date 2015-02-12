package com.xinglongjian.java.sort;

/**
 * description:线性排序
 *
 * @author zwl
 *
 * 2014年1月9日 上午11:16:55
 *
 */
public class LineSort
{
    public Integer lineselect(int[] a,int v)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==v)
                return i;
        }
        return null;
    }
}
