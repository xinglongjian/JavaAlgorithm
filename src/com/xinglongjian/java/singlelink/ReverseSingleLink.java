package com.xinglongjian.java.singlelink;

/**
 * description: 将单链表反转
 *
 * @author zwl
 *
 * 2014-4-23 上午09:00:50
 *
 */
public class ReverseSingleLink
{
    public static Node revSingleLink(Node head)
    {
        if(head ==null){ //链表为空不能逆序
            return head;
        }
        if(head.getNextNode()==null){ //如果只有一个结点，当然逆过来也是同一个
            return head;
        }
        Node rhead = revSingleLink(head.getNextNode());//先找到反转后的head
        head.getNextNode().setNextNode(head);//进行反转，将后一个节点的下一个节点设为本身
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
