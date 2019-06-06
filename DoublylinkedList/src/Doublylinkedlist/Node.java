/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doublylinkedlist;

/**
 *
 * @author 21614
 */
public class Node <T> implements NodeInterface <T> {
    private T item;
    private Node next;
    private Node previous;
    
    Node(T value)
    {
        this(value,null,null);
    }
    
    Node(T value,Node n,Node prev)
    {
        item=value;
        next=n;
        previous=prev;
    }
    
    @Override
    public void setNext(Node n)
    {
        next=n;
    }
    @Override
    public Node getNext()
    {
        return next;
    }
    
    @Override
    public void setItem(T value)
    {
        item=value;
    }
    
    @Override
    public T getItem()
    {
        return item;
    }
    @Override
    public void setPrevious(Node prev)
    {
        previous=prev;
    }
    @Override
    public Node getPrevious()
    {
        return previous;
    }
        
        
        
        
        
        
}
