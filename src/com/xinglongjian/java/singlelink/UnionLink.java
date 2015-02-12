package com.xinglongjian.java.singlelink;

import java.util.Stack;

/**
 * description:合并两个有序的链表，让合并后的链表依然有序
 *
 * @author zwl
 *
 * 2014-4-25 下午03:41:30
 *
 */
public class UnionLink
{

    /**
     * 合并 按从小到大排列（递归版）
     * @param link1Node
     * @param link2Node
     */
    public static Node union(Node link1Node,Node link2Node)
    {
        if(link1Node==null)
            return link2Node;
        if(link2Node==null)
            return link1Node;
        
        Node unionNode=null;
        if(link1Node.getValue()<link2Node.getValue())
        {
            unionNode=link1Node;
            unionNode.setNextNode(union(link1Node.getNextNode(), link2Node));
        }
        else
        {
            unionNode=link2Node;
            unionNode.setNextNode(union(link1Node, link2Node.getNextNode()));
        }
        return unionNode;
    }
    /**
     * 非递归版
     * @param link1Node
     * @param link2Node
     */
    public static Node unionNo(Node link1Node,Node link2Node)
    {
       if(link1Node==null)
           return link2Node;
       if(link2Node==null)
           return link1Node;
       
       Node unionNode=link1Node;
       while(link1Node!=null&&link2Node!=null)
       {
           if(link1Node.getValue()<link2Node.getValue())
           {
               unionNode.setNextNode(link1Node);
               unionNode=link1Node;
               link1Node=link1Node.getNextNode();
           }
           else
           {
               unionNode.setNextNode(link2Node);
               unionNode=link2Node;
               link2Node=link2Node.getNextNode();
           }
       }
       
        return unionNode;
    }
    
    public static void main(String[] args)
    {
        Node node1=new Node(1);
        Node temp=null,temp2=null;
        for(int i=2;i<10;i+=2)
        {
            temp=new Node(i);
            if(i==2)
                node1.setNextNode(temp);
            else
                temp2.setNextNode(temp);
            temp2=temp;
        }
        Node head=node1;
        while(head!=null)
        {
            System.out.print(head.getValue());
            System.out.print("---");
            head=head.getNextNode();
        }
        //================1---2---4---6---8---
        System.out.println();
        Node node2=new Node(3);
        temp=null;
        temp2=null;
        for(int i=5;i<15;i+=2)
        {
            temp=new Node(i);
            if(i==5)
                node2.setNextNode(temp);
            else
                temp2.setNextNode(temp);
            temp2=temp;
        }
        head=node2;
        while(head!=null)
        {
            System.out.print(head.getValue());
            System.out.print("---");
            head=head.getNextNode();
        }
        //==============3---5---7---9---11---13---
//       System.out.println();
//       System.out.println("递归版");
//       Node resut= union(node1, node2);
//       head=resut;
//       while(head!=null)
//       {
//           System.out.print(head.getValue());
//           System.out.print("---");
//           head=head.getNextNode();
//       }
       //===========
       System.out.println();
       System.out.println("非递归版");
       Node resut1= unionNo(node1, node2);
       head=resut1;
       while(head!=null)
       {
           System.out.print(head.getValue());
           System.out.print("---");
           head=head.getNextNode();
       }
    }
}
