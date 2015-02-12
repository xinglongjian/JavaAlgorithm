package com.xinglongjian.java.singlelink;

import java.util.Random;

/**
 * description:环形链表，next指向第一个node
 *
 * @author zwl
 *
 * 2014年7月9日 下午4:57:11
 *
 */
public class CircleLink
{
   private Node cursor;//当前节点
   private int size;//节点总数
   
   /**
    * 创建一个空的链表
    */
   public CircleLink()
   {
       cursor=null;
       size=0;
   }
   /**
    * 返回总数
    * @return
    */
   public int size()
   {
       return size;
   }
   
   public Node getCursor()
   {
       return cursor;
   }
   
   /**
    * 下一个
    */
   public void advance()
   {
       cursor=cursor.getNextNode();
   }
   
   /**
    * 添加新节点
    * @param newNode
    */
   public void add(Node newNode)
   {
       if(cursor==null)
       {
           newNode.setNextNode(newNode);
           cursor=newNode;
       }
       else
       {
           newNode.setNextNode(cursor.getNextNode());
           cursor.setNextNode(newNode);
       }
       size++;
   }
   
   /**
    * 移除节点
    * @return
    */
   public Node remove()
   {
       Node oldNode=cursor.getNextNode();
       if(oldNode==cursor)
       {
           cursor=null;
       }
       else
       {
           cursor.setNextNode(oldNode.getNextNode());
           oldNode.setNextNode(null);
       }
       size--;
       return oldNode;
   }
   
   public String toString() {
       if (cursor == null) return "[]";
       String s = "[..." + cursor.getValue();
       Node oldCursor = cursor;
       for (advance(); oldCursor != cursor; advance()) 
         s += ", " + cursor.getValue();
       return s + "...]";
   }
   
   public static void main(String[] args) {
       CircleLink C = new CircleLink();
       int N = 3; // number of iterations of the game
       Node it;    // the player who is "it"
       Node goose; // the goose
       Random rand = new Random();
       rand.setSeed(System.currentTimeMillis()); // use current time as seed
       // The players...
       int[] ages = {1,2,3,4,5,6,7,8};
       for (int i = 0; i< ages.length; i++) {
         C.add(new Node(ages[i]));
         C.advance();
       }
       for (int i = 0; i < N; i++) {   // play Duck, Duck, Goose N times
         System.out.println("Playing Duck, Duck, Goose for " + C.toString());
         it = C.remove();
         System.out.println(it.getValue() + " is it.");
         while (rand.nextBoolean() || rand.nextBoolean()) { // march around circle
               C.advance(); // advance with probability 3/4
               System.out.println(C.getCursor().getValue() + " is a duck.");
         }
         goose = C.remove();
         System.out.println(goose.getValue() + " is the goose!");
         if (rand.nextBoolean()) { 
           System.out.println("The goose won!");
           C.add(goose); // add the goose back in its old place
           C.advance();  // now the cursor is on the goose
           C.add(it);    // The "it" person will be it again in next round
         }
         else {
           System.out.println("The goose lost!");
           C.add(it);     // add who's "it" back at the goose's place
           C.advance(); // now the cursor is on the "it" person
           C.add(goose);  // The goose will be "it" in the next round
         }
       }
       System.out.println("Final circle is " + C.toString());
     }
}
