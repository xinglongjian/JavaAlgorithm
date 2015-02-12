package com.xinglongjian.java.stack;

/**
 * description:泛型节点
 *
 * @author zwl
 *
 * 2014年7月11日 下午3:43:20
 *
 */
public class NodeE<E>
{
    private E element;
    private NodeE<E> next;
    
    /** Creates a node with null references to its element and next node. */
    public NodeE() {
      this(null, null);
    }
    /** Creates a node with the given element and next node. */
    public NodeE(E e, NodeE<E> n) {
      element = e;
      next = n;
    }
    // Accessor methods:
    public E getElement() {
      return element; 
    }
    public NodeE<E> getNext() { 
      return next;
    }
    // Modifier methods:
    public void setElement(E newElem) { 
      element = newElem; 
    }
    public void setNext(NodeE<E> newNext) {
      next = newNext; 
    }
}
