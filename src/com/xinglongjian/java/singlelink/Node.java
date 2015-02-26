package com.xinglongjian.java.singlelink;

/**
 * 
 * @author root
 *
 */
public class Node<E>
{
    private E value;
    private Node<E> nextNode;

    public Node(){

    }
    public Node(E value,Node<E> node){
        this.value =value;
        this.nextNode=node;
        
    }
    public E getValue()
    {
        return value;
    }
    public void setValue(E value)
    {
        this.value = value;
    }
    public Node<E> getNextNode() {
        return nextNode;
    }
    public void setNextNode(Node<E> nextNode) {
        this.nextNode = nextNode;
    }
}
