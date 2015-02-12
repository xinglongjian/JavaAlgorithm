package com.xinglongjian.java.array;

/**
 * description:
 *
 * @author zwl
 *
 * 2015年2月6日 上午11:38:29
 *
 */
public class Scoreboard
{
   private int numEntries=0;
   private GameEntry[] board;
   
   public Scoreboard(int capacity){
       board=new GameEntry[capacity];
   }

   public void add(GameEntry e){
       int newScore=e.getScore();
       if(numEntries<board.length||newScore>board[numEntries-1].getScore())
       {
           //数量还没有满，就整体加1
           if(numEntries<board.length)
               numEntries++;
           
           //从尾部到头，依次判断
           int j=numEntries-1;
           while(j>0&&board[j-1].getScore()<newScore)
           {
               board[j]=board[j-1];
               j--;
           }
           board[j]=e;
       }
   }
   
   public GameEntry remove(int i)throws IndexOutOfBoundsException
   {
       if(i<0||i>=numEntries)
           throw new IndexOutOfBoundsException();
       
       GameEntry rg=board[i];
       for(int j=i;j<numEntries-1;j++)
       {
           board[j]=board[j+1];
       }
       board[numEntries-1]=null;
       numEntries--;
       return rg;
   }
}
