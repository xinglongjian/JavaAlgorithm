package com.xinglongjian.jiudu;
/**
 * 九度排序算法，通过版，采用插入排序
 * 题目描述：
    对输入的n个数进行排序并输出。
输入：
    输入的第一行包括一个整数n(1<=n<=100)。
    接下来的一行包括n个整数。
输出：
    可能有多组测试数据，对于每组数据，将排序后的n个整数输出，每个数后面都有一个空格。
    每组测试数据的结果占一行。
样例输入：
4
1 4 3 2
样例输出：
1 2 3 4 
 */
import java.util.Scanner;
public class JiuDuSort
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextLine()) {
            String  n=cin.nextLine();
            String nums=cin.nextLine();
            if(n!=null&&!n.equals(""))
            {
                int sum=Integer.parseInt(n);
                String[] numArray=nums.split(" ");
                if(numArray.length>=sum)
                {
                    int[] a = new int[sum];
                    for(int i=0;i<sum;i++)
                    {
                        a[i]=Integer.parseInt(numArray[i]);
                    }
                    for(int j=1;j<a.length;j++)
                    {
                        int temp=a[j],i=j;
                        if(a[i-1]>temp)
                        {
                            while(i>=1&&a[i-1]>temp)
                            {
                                a[i]=a[i-1];
                                i--;
                            }
                           
                        }  
                        a[i]=temp;
                    }
                    for(int i=0;i<a.length;i++)
                    {
                        System.out.print(a[i]+" ");
                    } 
                    
                    System.out.println();
                }
            }
        }
    }
    
}
