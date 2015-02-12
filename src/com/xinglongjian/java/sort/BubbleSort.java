package com.xinglongjian.java.sort;

/**
 * description:冒泡排序
 *
 * @author zwl
 *
 * 2014-4-24 星龙剑01:39:32
 *
 */
public class BubbleSort
{
    /**
     * 冒泡排序
     * @param score
     */
    public static void sort(int[] score)
    {
        for (int i = 0; i < score.length -1; i++){    
            for(int j = 0 ;j < score.length - i - 1; j++){    
                if(score[j] < score[j + 1]){    
                    int temp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = temp;
                }
            }            
            System.out.print("第" + (i + 1) + "次");
            for(int a = 0; a < score.length; a++){
                System.out.print(score[a] + "\t");
            }
            System.out.println("");
        }
            System.out.print("最终结果");
            for(int a = 0; a < score.length; a++){
                System.out.print(score[a] + "\t");
       } 
    }
    public static void main(String[] args){
        
       int score[] = {3, 4, 2, 1, 5, 7, 6, 8};
       sort(score);   
    }
}
