package com.xinglongjian.java.singlelink;

public class UnionLink
{
    public static Node<Integer> union(Node<Integer> link1Node,Node<Integer> link2Node)
    {
        if(link1Node==null)
            return link2Node;
        if(link2Node==null)
            return link1Node;
        
        Node<Integer> unionNode=null;
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

    public static Node<Integer> unionNo(Node<Integer> link1Node,Node<Integer> link2Node)
    {
       if(link1Node==null)
           return link2Node;
       if(link2Node==null)
           return link1Node;
       
       Node<Integer> unionNode=link1Node;
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
        Node<Integer> node1=new Node<Integer>(1,null);
        Node<Integer> temp=null,temp2=null;
        for(int i=2;i<10;i+=2)
        {
            temp=new Node<Integer>(i,null);
            if(i==2)
                node1.setNextNode(temp);
            else
                temp2.setNextNode(temp);
            temp2=temp;
        }
        Node<Integer> head=node1;
        while(head!=null)
        {
            System.out.print(head.getValue());
            System.out.print("---");
            head=head.getNextNode();
        }
        //================1---2---4---6---8---
        System.out.println();
        Node<Integer> node2=new Node<Integer>(3,null);
        temp=null;
        temp2=null;
        for(int i=5;i<15;i+=2)
        {
            temp=new Node<Integer>(i,null);
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

       //===========
       System.out.println();
       System.out.println("");
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
