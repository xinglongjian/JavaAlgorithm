package com.xinglongjian.java.struct;

/**
 * description:字符串移位包含的问题
 *
 * @author zwl
 *
 * 2014-4-24 上午10:09:15
 *
 */
public class StringMove
{
    public boolean test(String src,String des)
    {
        int len=src.length();
        char[] srcchar=src.toCharArray();
        for(int i=0;i<len;i++)
        {
            char temp=srcchar[0];
            for(int j=0;j<len-1;j++)
            {
                srcchar[j]=srcchar[j+1];
            }
            srcchar[len-1]=temp;
            if(String.valueOf(srcchar).contains(des))
                return true;
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        String src="AABCD";
        String des="CDAA";
        StringMove move=new StringMove();
        System.out.println(move.test(src, des));
    }
}
