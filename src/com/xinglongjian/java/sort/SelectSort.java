package com.xinglongjian.java.sort;

/**
 * description:ѡ������
 *
 * @author zwl
 *
 * 2014��1��9�� ����11:17:39
 *
 */
public class SelectSort
{

    private int findMin(int[] a,int start,int end)
    {
        int temp=a[start];
        int index =start;
        for(int i=start+1;i<end;i++)
        {
            if(temp>a[i])
            {
                temp=a[i];
                index=i;
            }                
        }
        return index;
        
    }
    /**
     * ʱ�临�Ӷ�O��n*n��
     * @param a
     */
    public void sort(int[] a)
    {       
        for(int i=0;i<a.length-1;i++)
        {
            int j=findMin(a, i, a.length);
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        
    }
    
    public static void main(String[] args)
    {
        int[] a=new int[]{3,5,6,1,4,2};
        SelectSort sort=new SelectSort();
        sort.sort(a);
    }
}
