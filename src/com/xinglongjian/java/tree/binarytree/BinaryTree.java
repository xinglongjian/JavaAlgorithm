package com.xinglongjian.java.tree.binarytree;

/**
 * description:二叉树
 *
 * @author zwl
 *
 * 2014-4-25 ����12:47:34
 *
 */
public class BinaryTree
{
    int data;      //值
    BinaryTree left;    //左子树
    BinaryTree right;   //右子树
    
    public BinaryTree(int data)    //ʵ���������
    {
       this.data = data;
       left = null;
       right = null;
    }
    /**
     * ��������в����ӽڵ�
     * @param root
     * @param data
     */
    public void insert(BinaryTree root,int data){     
        if(data>root.data)                               //����������ڵ㶼�ȸ�ڵ�С
        {
         if(root.right==null){
          root.right = new BinaryTree(data);
         }else{
          this.insert(root.right, data);
         }
        }else{                                          //���������ҽڵ㶼�ȸ�ڵ��
         if(root.left==null){
          root.left = new BinaryTree(data);
         }else{
          this.insert(root.left, data);
         }
        }
       }
}
