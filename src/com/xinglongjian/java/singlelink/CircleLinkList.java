package com.xinglongjian.java.singlelink;

import java.util.Random;
/**
 * 
 * @author root
 *
 */
public class CircleLinkList<E>
{
   private Node<E> tail=null;
   private int size=0;
   
   public CircleLinkList()
   {
   }

   public int size()
   {
       return size;
   }
   public boolean isEmpty()
   {
	   return size==0;
   }
   
   public E first()
   {
	   if(size==0)
		   return null;
	   return tail.getNextNode().getValue();
   }
   
   public E last()
   {
	   if(size==0)
		   return null;
	   return tail.getValue();
   }
   
   public void rotate()
   {
	   if(tail==null)
	       tail=tail.getNextNode();
   }
   
   public void addFirst(E e)
   {
	   if(size==0)
	   {
		   tail=new Node<E>(e,null);
		   tail.setNextNode(tail);
	   }
	   else
	   {
		   Node<E> newNode=new Node<E>(e,tail.getNextNode());
		   tail.setNextNode(newNode);
	   }
	   size++;
		   
   }
   
   public void addLast(E e)
   {
	   addFirst(e);
	   tail=tail.getNextNode();
   }
   
   public E removeFirst()
   {
	   if(size==0)
		   return null;
	   Node<E> head=tail.getNextNode();
	   if(head==tail)
		   tail=null;
	   else
		   tail.setNextNode(head.getNextNode());
	   size--;
	   return head.getValue();
   }
   
   
   public static void main(String[] args) {
//       CircleLinkList C = new CircleLinkList();
//       int N = 3; // number of iterations of the game
//       Node it;    // the player who is "it"
//       Node goose; // the goose
//       Random rand = new Random();
//       rand.setSeed(System.currentTimeMillis()); // use current time as seed
//       // The players...
//       int[] ages = {1,2,3,4,5,6,7,8};
//       for (int i = 0; i< ages.length; i++) {
//         C.add(new Node(ages[i]));
//         C.advance();
//       }
//       for (int i = 0; i < N; i++) {   // play Duck, Duck, Goose N times
//         System.out.println("Playing Duck, Duck, Goose for " + C.toString());
//         it = C.remove();
//         System.out.println(it.getValue() + " is it.");
//         while (rand.nextBoolean() || rand.nextBoolean()) { // march around circle
//               C.advance(); // advance with probability 3/4
//               System.out.println(C.getCursor().getValue() + " is a duck.");
//         }
//         goose = C.remove();
//         System.out.println(goose.getValue() + " is the goose!");
//         if (rand.nextBoolean()) { 
//           System.out.println("The goose won!");
//           C.add(goose); // add the goose back in its old place
//           C.advance();  // now the cursor is on the goose
//           C.add(it);    // The "it" person will be it again in next round
//         }
//         else {
//           System.out.println("The goose lost!");
//           C.add(it);     // add who's "it" back at the goose's place
//           C.advance(); // now the cursor is on the "it" person
//           C.add(goose);  // The goose will be "it" in the next round
//         }
//       }
//       System.out.println("Final circle is " + C.toString());
     }
}
