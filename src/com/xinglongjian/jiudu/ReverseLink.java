package com.xinglongjian.jiudu;

import java.util.Scanner;

public class ReverseLink
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        String str="";
        while (cin.hasNextLine()) {
            String n=cin.nextLine();
            if(n.equals("-1"))
                break;
            str+=n+",";
        } 
        String[] strs=str.split(",");
        for(int k=strs.length-1;k>=0;k--)
        {
            System.out.println(strs[k]);
        }
    }
}
