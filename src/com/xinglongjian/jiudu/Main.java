package com.xinglongjian.jiudu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * description:九度学生排序。
 * 题目描述：
    有N个学生的数据，将学生数据按成绩高低排序，如果成绩相同则按姓名字符的字母序排序，如果姓名的字母序也相同则按照学生的年龄排序，并输出N个学生排序后的信息。
输入：
    测试数据有多组，每组输入第一行有一个整数N（N<=1000），接下来的N行包括N个学生的数据。
    每个学生的数据包括姓名（长度不超过100的字符串）、年龄（整形数）、成绩（小于等于100的正数）。
输出：
    将学生信息按成绩进行排序，成绩相同的则按姓名的字母序进行排序。
    然后输出学生信息，按照如下格式：
    姓名 年龄 成绩
样例输入：
3
abc 20 99
bcd 19 97
bed 20 97
样例输出：
bcd 19 97
bed 20 97
abc 20 99
提示：
学生姓名的字母序区分字母的大小写，如A要比a的字母序靠前(因为A的ASC码比a的ASC码要小)。
 *
 * @author zwl
 *
 * 2014年7月17日 上午8:05:13
 *
 */
public class Main
{
   public static void main(String[] args)
   {
       Scanner cin = new Scanner(System.in);
       while (cin.hasNextLine()) {
           String  n=cin.nextLine();
           int sum=Integer.parseInt(n);
           
           
//           List<Student> students=new ArrayList<Student>();
//           for(int i=0;i<sum;i++)
//           {
//               String nums=cin.nextLine();
//               String[] numArray=nums.split(" ");
//               Student s=new Student();
//               s.name=numArray[0];
//               s.age=Integer.parseInt(numArray[1]);
//               s.score=Integer.parseInt(numArray[2]);
//               students.add(s);
//           }
//           Collections.sort(students);
//           for(Student s:students)
//           {
//               System.out.print(s.name+" "+s.age+" "+s.score);
//               System.out.println();
//           }
           System.out.println();
       }
   }
}
