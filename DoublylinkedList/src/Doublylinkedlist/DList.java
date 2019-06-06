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
public class DList<T> implements DListInterface<T> {
    private Node head;
    private int size;
    
    DList()
    {
        head=null;
        size=0;
    }

    @Override
    public boolean IsEmpty()
    {
        return (head==null&&size==0);
    }
  
    @Override
    public void AddFront(T item)
    {
        if(!IsEmpty())
        {
           Node value= new Node(item,head,null);
            head.setPrevious(value);
            head=value;
      
        }
        else
        {
             head = new Node(item,null,null);
        }
        size++;
    }
    
    @Override
    public void AddBack(T item)
    {
        if(!IsEmpty())
        {
            int count=1;
            Node current=head;
            while(count<=size)
            {
                if(count==size)
                {
                  Node value = new Node(item,null,current);
                  current.setNext(value);
                } 
                current=current.getNext();   
                count++;
            }   
             size++;
        }
        else
        {
            AddFront(item);
        }
       
    }
    
    @Override
    public void Add(T item,int position)
    {
        if(!IsEmpty())
        {
            int i=1;
            Node temp=null;
            Node current= head;
            while(current!=null)
            {
                 if(i==position)
                {
                    temp =current;
                    AddBack((T) temp.getItem());
                    current.setItem(item);
                    break;
                }
                 current=current.getNext();
                if(current==null)AddBack(item);
                i++;
            }
        }
        else
        {
            AddFront(item);
        }
      
    }
    @Override
    public T RemoveFront()
    {
          T val= null;
        if(!IsEmpty())
        {
            if(size==1)
            {
                val = (T) head.getItem();  
                head= null;
                size=0;
            }
            else
            {
                val =(T) head.getItem();
                head=head.getNext();
                head.setPrevious(null);
                size--;
            }   
        }
        return val;
    }
    
    @Override
    public T RemoveBack()
    {
         T val=null;
        if(!IsEmpty())
        {
            if(size==1)
            {
                val =(T) head.getItem();
                head=null;
                size=0;
            }
            else
            {
            int count=1;
            Node current=head;
            while(count<=size)
            {
                if(count==size)
                {
                  val =(T) current.getItem();
                  current=current.getPrevious();
                  current.setNext(null);
                } 
                current=current.getNext();   
                count++;
            }   
               
            }
        }
        size--;
        return val;
    }
    @Override
    public void Remove(int position)
    {
        
        if(!IsEmpty())
        {
            int i=1;
            Node next=null;
            Node current=head;
            while(current!=null)
            {
                if(i==position)
                {
                  if(i==1)RemoveFront();
                  while(current!=null)
                  {
                      next=current.getNext();
                      current.setItem(null);
                      if(next!=null)current.setItem(next.getItem());
                      current=current.getNext();
                  }  
                  RemoveBack();
                  break;
                }          
                current=current.getNext();
                i++;
            }
            
        }
    }
     @Override
    public boolean Search(T item)
    {
        if(!IsEmpty())
        {
            Node current=head;
            while(current!=null)
            {
                if(current.getItem().equals(item))return true;
                current=current.getNext();
            }
        }
        return false;
    }
        @Override
    public void display() {
        Node current = head;
        while(current!=null){
            System.out.println(current.getItem());
            current = current.getNext();
        }
    }
    
    @Override
    public int getSize()
    {
        return size;
    }
        
    
}
