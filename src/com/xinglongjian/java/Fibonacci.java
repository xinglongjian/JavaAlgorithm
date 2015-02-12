package com.xinglongjian.java;

import java.util.ArrayList;
import java.util.List;


public class Fibonacci
{

    //1 1 2 3 5 8 13...
    public int printNum(int n)
    {
        if(n<=1) 
            return n;
        return printNum(n-1)+printNum(n-2);
    }
    

    public int fibonacciNormal(int n)
    {
        if(n<2)
            return 1;
        int n1=1,n2=1,sn=0;
        for(int i=0;i<n-2;i++)
        {
            sn=n1+n2;
            n1=n2;
            n2=sn;
        }
        return sn;
    }
    
    
    //------------------------------------------------
    private List<Integer> fnData=new ArrayList<Integer>();
    private int maxSize=100;
    
    public void setFnData()
    {
        int result=-1;
        int temp1=0;
        int temp2=1;
        for(int i=0;i<=maxSize;i++)
        {
            if(i==0)
                result = temp1;
            else if(i==1)
            {
                result = temp2;
            }
            else{
                result=temp1+temp2;
                temp1=temp2;
                temp2=result;
            }
            fnData.add(result);
        }
    }
    
    public int getFnData(int n)
    {
        if(fnData.size()==0)
        {
            setFnData();
        }
        if(fnData.size()>n&&n>=0)
        {
            return fnData.get(n);
        }
        else{
            return -1;
        }
    }
    
    public static void main(String[] args)
    {
        Fibonacci f=new Fibonacci();
        System.out.println(f.printNum(6));
        System.out.println(f.fibonacciNormal(6));
        System.out.println(f.getFnData(6));
    }
}
