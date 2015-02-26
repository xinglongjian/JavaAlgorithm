package com.xinglongjian.java.singlelink;


public class ReverseSingleLink<E>
{
    public static Node<E> revSingleLink(Node<E> head)
    {
        if(head ==null){
            return head;
        }
        if(head.getNextNode()==null){ 
            return head;
        }
        Node rhead = revSingleLink(head.getNextNode());//
        head.getNextNode().setNextNode(head);//
        head.setNextNode(null);
        return rhead; 
   }
    
   public static void main(String[] args){
        Node head =new Node(0);
        Node temp1 =null,temp2 =null;
        
        for(int i=1;i<10;i++){
           temp1 =new Node(i);        
           if(i==1){
              head.setNextNode(temp1);
           }else{
              temp2.setNextNode(temp1);
           }
           temp2 = temp1;
        } 
        Node next=head;
        while(next!=null)
        {
            System.out.print(next.getValue());
            next=next.getNextNode();
        }
        System.out.println("-----------");
        head = revSingleLink(head);
        Node next1=head;
        while(next1!=null)
        {
            System.out.print(next1.getValue());
            next1=next1.getNextNode();
        }
   }
}
