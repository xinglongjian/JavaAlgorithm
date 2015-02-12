package com.xinglongjian.java.sort;


/**
 * Insert Sort
 * @author root
 *
 */
public class InsertSort
{
    public void insertSort(int[] a)
    {
        for(int j=1;j<a.length;j++)
        {
            int temp=a[j],i=j;
            while(i>=1&&a[i-1]>temp)
            {
                a[i]=a[i-1];
                i--;
            }
            a[i]=temp;
        }
        System.out.println(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    
    public static void main(String[] args)
    {
        int[] a=new int[]{3,5,6,4,1,2};
        InsertSort sort=new InsertSort();
        sort.insertSort(a);
    }
}
