package com.xinglongjian.java.struct;

/**
 * description: 字符串的相似度，参考编程之美
 *
 * @author zwl
 *
 * 2014-4-24 上午10:28:29
 *
 */
public class StringSimilarity
{

    public int CalculateStringDistance(String strA,int pABegin,int pAEnd,String strB,int pBBegin,int pBEnd)
    {
        
        if(pABegin>pAEnd)
        {
            if(pBBegin>pBEnd)
            {
                return 0;
            }
            else
            {
                return pBEnd-pBBegin+1;
            }
        }   
            if(pBBegin>pBEnd)
            {
                if(pABegin>pAEnd)
                {
                    return 0;
                }
                else
                {
                    return pAEnd-pABegin+1;
                }
            }
            if(strA.charAt(pABegin)==strB.charAt(pBBegin))
            {
                return CalculateStringDistance(strA, pABegin+1, pAEnd, strB, pBBegin+1, pBEnd);
            }
            else
            {
                int t1=CalculateStringDistance(strA, pABegin+1, pAEnd, strB, pBBegin+2, pBEnd);
                int t2=CalculateStringDistance(strA, pABegin+2, pAEnd, strB, pBBegin+1, pBEnd);
                int t3=CalculateStringDistance(strA, pABegin+2, pAEnd, strB, pBBegin+2, pBEnd);
                return minValues(t1,t2,t3)+1;
            }
    }
    public static int minValues(int...values)
    {
        int len=values.length;
        int temp=values[0];
        int index =0;
        for(int i=1;i<len;i++)
        {
            if(temp>values[i])
            {
                temp=values[i];
                index=i;
            }                
        }
        return values[index];
    }

   public static void main(String[] args)
   {
      StringSimilarity sim=new StringSimilarity();
      String strA="abcdef";
      int pABegin=0;
      int pAEnd=strA.length()-1;
      String strB="abcde";
      int pBBegin=0;
      int pBEnd=strB.length()-1;
      
      int result=sim.CalculateStringDistance(strA, pABegin, pAEnd, strB, pBBegin, pBEnd);
      System.out.println(result);
   }
}
