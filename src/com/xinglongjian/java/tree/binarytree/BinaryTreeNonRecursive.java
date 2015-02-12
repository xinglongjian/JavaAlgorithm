package com.xinglongjian.java.tree.binarytree;

import java.util.Stack;

/**
 * description:非递归遍历
 *
 * @author zwl
 *
 * 2014-4-25 下午12:50:02
 *
 */
public class BinaryTreeNonRecursive
{
    /**
     * 先序遍历1,先压入右节点，再压入左节点
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
     * 非递归先序遍历2，先压入所有左节点
     * @param root
     */
    public static void preOrder2(BinaryTree root)
    {
        Stack<BinaryTree> stack=new Stack<BinaryTree>();
        BinaryTree node=root;
        while(node!=null||stack.size()>0)
        {
           while(node!=null)////压入所有的左节点，压入前访问它
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
     * //中序遍历
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
     *  非递归实现后序遍历 单栈法
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
  
    /** 非递归实现后序遍历4 双栈法*/  
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
        System.out.println("先根遍历：");
        preOrder(root);
        System.out.println();
        System.out.println("中根遍历：");
        inOrder(root);
        System.out.println();
        System.out.println("后根遍历：");
        Postorder(root);
    }
}
