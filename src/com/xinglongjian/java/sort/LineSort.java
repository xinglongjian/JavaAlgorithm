package com.xinglongjian.java.sort;

/**
 * description:��������
 *
 * @author zwl
 *
 * 2014��1��9�� ����11:16:55
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
