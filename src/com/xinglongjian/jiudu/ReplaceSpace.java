package com.xinglongjian.jiudu;

import java.util.Scanner;

public class ReplaceSpace
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextLine()) {
            String  n=cin.nextLine();
            char[] chs=n.toCharArray();
            int nums=0,i=0,j,length=0;
            for(char c:chs)
            {
                i++;
                if(c==' ')
                {
                    
                    nums++;
                }
            }
            length=i+2*nums;
            
            char[] chs2=new char[length];
            for(int k=0;k<i;k++)
            {
                chs2[k]=chs[k];
            }
            
            j=length;
            while(--i>=0)
            {
                if(chs2[i]==' ')
                {
                    chs2[--j]='0';
                    chs2[--j]='2';
                    chs2[--j]='%';
                }
                else
                {
                    chs2[--j]=chs2[i];
                }
            }
            System.out.println(new String(chs2));
        }
    }
}
