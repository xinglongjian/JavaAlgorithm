package com.xinglongjian.java.search;

/**
 * description: 二分查找算法,该算法要求数组必须是有序的。
 * 二分查找又称折半查找，优点是比较次数少，查找速度快，平均性能好；
 * 其缺点是要求待查表为有序表，且插入删除困难。
 * 因此，折半查找方法适用于不经常变动而查找频繁的有序列表。
 * 首先，假设表中元素是按升序排列，将表中间位置记录的关键字与查找关键字比较，如果两者相等，则查找成功；
 * 否则利用中间位置记录将表分成前、后两个子表，如果中间位置记录的关键字大于查找关键字，则进一步查找前一子表，
 * 否则进一步查找后一子表。重复以上过程，直到找到满足条件的记录，使查找成功，或直到子表不存在为止，此时查找不成功。
 *
 * @author zwl
 *
 * 2013年12月27日 上午10:23:32
 *
 */
public class BinarySearch
{
    private static int search(int num,int[] a)
    {
        int lo=0;
        int hi=a.length-1;
        
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            if(num<a[mid]) hi=mid-1;
            else if(num>a[mid]) lo=mid+1;
            else return a[mid];
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        //二分查找算法,该算法要求数组必须是有序的。
        int[] nums={10,14,23,32,34,43,56,58,63,87};
        search(58, nums);
    }
}

