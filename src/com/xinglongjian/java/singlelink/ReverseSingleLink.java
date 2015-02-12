package com.xinglongjian.java.singlelink;

/**
 * description: ��������ת
 *
 * @author zwl
 *
 * 2014-4-23 ����09:00:50
 *
 */
public class ReverseSingleLink
{
    public static Node revSingleLink(Node head)
    {
        if(head ==null){ //����Ϊ�ղ�������
            return head;
        }
        if(head.getNextNode()==null){ //���ֻ��һ����㣬��Ȼ�����Ҳ��ͬһ��
            return head;
        }
        Node rhead = revSingleLink(head.getNextNode());//���ҵ���ת���head
        head.getNextNode().setNextNode(head);//���з�ת������һ���ڵ����һ���ڵ���Ϊ����
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
