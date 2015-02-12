package com.xinglongjian.java.search;

/**
 * description: ���ֲ����㷨,���㷨Ҫ���������������ġ�
 * ���ֲ����ֳ��۰���ң��ŵ��ǱȽϴ����٣������ٶȿ죬ƽ�����ܺã�
 * ��ȱ����Ҫ������Ϊ��������Ҳ���ɾ�����ѡ�
 * ��ˣ��۰���ҷ��������ڲ������䶯������Ƶ���������б���
 * ���ȣ��������Ԫ���ǰ��������У������м�λ�ü�¼�Ĺؼ�������ҹؼ��ֱȽϣ����������ȣ�����ҳɹ���
 * ���������м�λ�ü�¼�����ֳ�ǰ���������ӱ�������м�λ�ü�¼�Ĺؼ��ִ��ڲ��ҹؼ��֣����һ������ǰһ�ӱ���
 * �����һ�����Һ�һ�ӱ����ظ����Ϲ��̣�ֱ���ҵ����������ļ�¼��ʹ���ҳɹ�����ֱ���ӱ�������Ϊֹ����ʱ���Ҳ��ɹ���
 *
 * @author zwl
 *
 * 2013��12��27�� ����10:23:32
 *
 */
public class BinarySearch
{
    private static int search(int num,int[] a)
    {
        int lo=0;
        int hi=a.length-1;
        
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            if(num<a[mid]) hi=mid-1;
            else if(num>a[mid]) lo=mid+1;
            else return a[mid];
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        //���ֲ����㷨,���㷨Ҫ���������������ġ�
        int[] nums={10,14,23,32,34,43,56,58,63,87};
        search(58, nums);
    }
}
