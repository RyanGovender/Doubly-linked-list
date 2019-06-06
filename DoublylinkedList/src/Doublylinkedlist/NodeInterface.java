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
public interface NodeInterface<T> {
    public void setNext(Node n);
    public Node getNext();
    public void setItem(T item);
    public T getItem();
    public void setPrevious(Node prev);
    public Node getPrevious();
    
}
