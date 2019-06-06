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
public class Doublylinkedlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   DListInterface<Integer> list = new DList<>();
        System.out.println("------ Add to Front-----");
      list.AddFront(5);
      list.AddFront(10);
      list.AddFront(45);
      list.AddFront(4);
      list.display();
      System.out.println("----------Add to Back------------");
      list.AddBack(7);
      list.display();
      System.out.println("--------- Add 50 to position 3-----------");
      list.Add(50, 3);
      list.display();
      System.out.println("------Remove Front-----");
      list.RemoveFront();
      list.display();
      System.out.println("-----Remove back-------");
      list.RemoveBack();
      list.display();
      System.out.println("-------Remove from position 2-------");
      list.Remove(2);
      list.display();
      System.out.println("------ Does this list contain 5:"+list.Search(5));     
      System.out.println("------ Does this list contain 15:"+list.Search(15));
       System.out.println("The size is :"+list.getSize());
    }
    
}
