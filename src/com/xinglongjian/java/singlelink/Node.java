package com.xinglongjian.java.singlelink;

/**
 * description: ������ڵ�
 *
 * @author zwl
 *
 * 2014-4-23 ����08:59:27
 *
 */
public class Node
{
    private Integer value;
    private Node nextNode;

    public Node(){

    }
    public Node(int value){
        this.value =new Integer(value);
    }
    public Integer getValue()
    {
        return value;
    }
    public void setValue(Integer value)
    {
        this.value = value;
    }
    public Node getNextNode() {
        return nextNode;
    }
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
