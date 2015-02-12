package com.xinglongjian.java;

/**
 * description:利用位操作符(& | ^ ~)来实现加、减、乘、除
 * &按位与（两个中都包含的）
 * |按位或 (一个中包含的)
 * ^按位异或 (刨除两个中都包含的)
 * ~补码 (取反)
 * a:0011 1100
 * b:0000 1101
 * 
 * a&b:0000 1100
 * a|b:0011 1101
 * a^b:0011 0001
 * ~a :1100 0011
 * @author zwl
 *
 * 2014-4-25 上午10:07:18
 *
 */
public class Operator
{

    /**
     * 递归实现加法
     * @param a
     * @param b
     * @return
     */
    public static int Add(int a,int b)
    {
        
        return b==0?a:Add(a^b,(a&b)<<1);
    }
    /**
     * 补码中正数转负数的原理（正-负，负-正）
     * @param a
     * @return
     */
    static int negative(int a)
    {
        return Add(~a, 1);
    }
    /**
     * 减法运算
     * @param a
     * @param b
     * @return
     */
    static int sub(int a,int b)
    {
       return Add(a, negative(b));   
    }
    /**
     * 判断正负 是否是负数
     * @param a
     * @return
     */
    static boolean isNegative(int a)
    {
        return (a&Integer.MIN_VALUE)!=0;
    }
    /**
     * 仅计算正数乘法
     * @param a
     * @param b
     * @return
     */
    static int multi_help(int a,int b)
    {
        int result= 0;    
        while(b!=0)    
        {    
            if((b&1)!=0) 
                result = Add(result, a);    
            a <<=1;    
            b >>= 1;    
        }    
        return result; 
    }
    /**
     * 乘法
     * @param a
     * @param b
     * @return
     */
    int multi(int a,int b)  
    {  
        if(isNegative(a))  
        {  
            if(isNegative(b))  
                return multi_help(negative(a),negative(b));  
            else  
                return negative(multi_help(negative(a),b));  
        }  
        else  
        {  
            if(isNegative(b))  
                return negative(multi_help(a,negative(b)));  
            else  
                return multi_help(a,b);  
        }  
    }  
    
    /**
     * 正数除法  
     * @param a
     * @param b
     * @return
     */
    int div_help(int a,int b)    
    {    
        if(a<b) return 0;  
        if(a==b) return 1;  
        int result=0;   
        //第32位为符号位，所以从第31位开始  
        for(int i=30;i>=0;i--)    
        {    
            if((a>>i)>=b)    
            {    
                result=Add(result,1<<i);    
                a=sub(a,b<<i);    
            }    
        }    
        return result;    
    }  
    //除法  
    int div(int a,int b)  
    {  
        if(isNegative(a))  
        {  
            if(isNegative(b))  
                return div_help(negative(a),negative(b));  
            else  
                return negative(div_help(negative(a),b));  
        }  
        else  
        {  
            if(isNegative(b))  
                return negative(div_help(a,negative(b)));  
            else  
                return div_help(a,b);  
        }  
    } 
    
    public static void main(String[] args)
    {
        System.out.println(Operator.Add(2, 3));
        System.out.println(Operator.negative(-2));
        System.out.println(Operator.isNegative(-2));
    }
}
