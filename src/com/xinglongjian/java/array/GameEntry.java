package com.xinglongjian.java.array;

/**
 * description:
 *
 * @author zwl
 *
 * 2015年2月6日 上午11:36:20
 *
 */
public class GameEntry
{
    private String name;
    private int score;
    
    public GameEntry(String n,int s)
    {
        name=n;
        score=s;
    }

    public String getName()
    {
        return name;
    }

    public int getScore()
    {
        return score;
    }

    @Override
    public String toString()
    {
        return "GameEntry [name=" + name + ", score=" + score + "]";
    }

}
