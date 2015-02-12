package com.xinglongjian.java.tree.binarytree;

/**
 * description:递归遍历
 *
 * @author zwl
 *
 * 2014-4-25 下午12:50:02
 *
 */
public class BinaryTreeRecursive
{
    /**
     * //先序遍历
     * @param root
     */
    public static void preOrder(BinaryTree root){  
        if(root!=null){
         System.out.print(root.data+"-");
         preOrder(root.left);
         preOrder(root.right);
        }
    }
    /**
     * //中序遍历
     * @param root
     */
    public static void inOrder(BinaryTree root){     

        if(root!=null){
         inOrder(root.left);
         System.out.print(root.data+"--");
         inOrder(root.right);
        }
    }
    /**
     *  //后序遍历
     * @param root
     */
    public static void postOrder(BinaryTree root){   

        if(root!=null){
         postOrder(root.left);
         postOrder(root.right);
         System.out.print(root.data+"---");
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
        postOrder(root);
    }
}
