package com.xinglongjian.java.stack;

import java.util.Scanner;

/**
 * description:
 *
 * @author zwl
 *
 * 2014年7月11日 下午4:27:05
 *
 */
public class Html
{
    public static String stripEnds(String t)
    {
        if(t.length()<=2) return null;
        return t.substring(1, t.length()-1);
    }
    
    public static boolean isOpeningTag(String tag)
    {
        return (tag.length()==0)||(tag.charAt(0)!='/');
    }
    
    public static boolean areMatchingTags(String tag1,String tag2)
    {
        return tag1.equals(tag2.substring(1));
    }
    
    public static boolean isHTMLMatched(String[] tag)
    {
        Stack<String> S=new NodeStack<String>();
        for(int i=0;(i<tag.length)&&(tag[i]!=null);i++)
        {
            if(isOpeningTag(tag[i]))
            {
                S.push(tag[i]);
            }
            else
            {
                if(S.isEmpty())
                    return false;
                if(!areMatchingTags(S.pop(), tag[i]))
                    return false;
            }
        }
        if(S.isEmpty()) return true;
        return false;
    }
    
    public final static int CAPACITY=1000;
    public static String[] parseHTML(Scanner s)
    {
        String[] tag=new String[CAPACITY];
        int count=0;
        String token=null;
        while(s.hasNextLine())
        {
            if(token!=null&&token.equals("bye"))
                break;
            while((token=s.findInLine("<[^>]*>"))!=null)
            {
                tag[count++]=stripEnds(token);
            }
            s.nextLine();
        }
        return tag;
    }
    
    public static void main(String[] args)
    {
        if(isHTMLMatched(parseHTML(new Scanner(System.in))))
        {
            System.out.println("the input file is a matched HTML document");
        }
        else
        {
            System.out.println("the input file is not a matched HTML document");
        }
        
    }
}
