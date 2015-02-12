package com.xinglongjian.java.tree.binarytree;

import java.util.Stack;

/**
 * description:�ǵݹ����
 *
 * @author zwl
 *
 * 2014-4-25 ����12:50:02
 *
 */
public class BinaryTreeNonRecursive
{
    /**
     * �������1,��ѹ���ҽڵ㣬��ѹ����ڵ�
     * @param root
     */
    public static void preOrder(BinaryTree root){  
       Stack<BinaryTree> stack=new Stack<BinaryTree>();
       if(root!=null)
       {
           stack.push(root);
           while(!stack.isEmpty())
           {
               root=stack.pop();
               System.out.print(root.data);
               System.out.print("---");
               if(root.right!=null)
                   stack.push(root.right);
               if(root.left!=null)
                   stack.push(root.left);
           }
       }
    }
    /**
     * �ǵݹ��������2����ѹ��������ڵ�
     * @param root
     */
    public static void preOrder2(BinaryTree root)
    {
        Stack<BinaryTree> stack=new Stack<BinaryTree>();
        BinaryTree node=root;
        while(node!=null||stack.size()>0)
        {
           while(node!=null)////ѹ�����е���ڵ㣬ѹ��ǰ������
           {
               System.out.println(node.data);
               stack.push(node);
               node=node.left;
           }
           if(stack.size()>0)
           {
               node=stack.pop();
               node=node.right;
           }
        }
    }
    
    /**
     * //�������
     * @param root
     */
    public static void inOrder(BinaryTree root){     
       Stack<BinaryTree> stack=new Stack<BinaryTree>();
       BinaryTree node=root;
       while(node!=null||stack.size()>0)
       {
           while(node!=null)
           {
               stack.push(node);
               node=node.left;
           }
           if(stack.size()>0)
           {
               node=stack.pop();
               System.out.print(node.data);
               System.out.print("---");
               node=node.right;
           }
       }
        
    }
    /**
     *  �ǵݹ�ʵ�ֺ������ ��ջ��
     *  
     *  */  
    public static void Postorder(BinaryTree p) {  
        Stack<BinaryTree> stack = new Stack<BinaryTree>();  
        BinaryTree node = p, prev = p;  
        while (node != null || stack.size() > 0) {  
            while (node != null) {  
                stack.push(node);  
                node = node.left;  
            }  
            if (stack.size() > 0) {  
                BinaryTree temp = stack.peek().right;  
                if (temp == null || temp == prev) {  
                    node = stack.pop();  
                    System.out.print(node.data);
                    System.out.print("--");
                    prev = node;  
                    node = null;  
                } else {  
                    node = temp;  
                }  
            }  
  
        }  
    }  
  
    /** �ǵݹ�ʵ�ֺ������4 ˫ջ��*/  
    public static void Postorder2(BinaryTree p) {  
        Stack<BinaryTree> stack = new Stack<BinaryTree>();  
        Stack<BinaryTree> temp = new Stack<BinaryTree>();  
        BinaryTree node = p;  
        while (node != null || stack.size() > 0) {  
            while (node != null) {  
                temp.push(node);  
                stack.push(node);  
                node = node.right;  
            }  
            if (stack.size() > 0) {  
                node = stack.pop();  
                node = node.left;  
            }  
        }  
        while (temp.size() > 0) {  
            node = temp.pop();  
            System.out.print(node.data);
            System.out.print("--"); 
        }  
    }  
    
    public static void main(String[] args)
    {
        int[] array = {12,76,35,22,16,48,90,46,9,40};
        BinaryTree root = new BinaryTree(array[0]);
        for(int i=1;i<array.length;i++){
         root.insert(root, array[i]);
        }
        System.out.println("�ȸ�������");
        preOrder(root);
        System.out.println();
        System.out.println("�и�������");
        inOrder(root);
        System.out.println();
        System.out.println("���������");
        Postorder(root);
    }
}
