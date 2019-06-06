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
public interface DListInterface<T> {
    
    public boolean IsEmpty();
    public void AddFront(T item);
    public void AddBack(T item);
    public int getSize();
    public void Add(T item,int position);
    public T RemoveFront();
    public T RemoveBack();
    public void Remove(int position);
    public boolean Search(T item);
    public void display();
}
