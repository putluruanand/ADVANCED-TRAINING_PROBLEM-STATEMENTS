package com.Anand.AdvancedTraining;
import java.util.Scanner;

class LinkedList
{
    Node head; 
 
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    
    void printNthFromLast(int n)
    {
        Node main_ptr = head;
        Node ref_ptr = head;
 
        int count = 0;
        if (head != null)
        {
            while (count < n)
            {
                if (ref_ptr == null)
                {
                    System.out.println(n
                     + " is greater than the no "
                       + " of nodes  Value in the list -1");
                    return;
                }
                ref_ptr = ref_ptr.next;
                count++;
            }
 
            if(ref_ptr == null)
            {
              
              if(head != null)
                System.out.println("Node no. " + n +
                                   " from last is " +
                                      head.data);
            }
            else
            {
                   
              while (ref_ptr != null)
              {
                  main_ptr = main_ptr.next;
                  ref_ptr = ref_ptr.next;
              }
              System.out.println("Node no.  from last second is : " +main_ptr.data);
                                
                                  
            }
        }
    }
 
   
    public void push(int new_data)
    {
        
        Node new_node = new Node(new_data);
 
        
        new_node.next = head;
 
        
        head = new_node;
    }
 
   
    public static void main(String[] args)
    {
        LinkedList llist = new LinkedList();
        
        
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the number of nodes in linked list..");
         int nodesize=sc.nextInt();
         System.out.println("enter the node values");
         for(int i=0;i<nodesize;i++) {
        	llist.push(sc.nextInt());
         }
       System.out.println("enter the nth node from last to search element..");
        llist.printNthFromLast(sc.nextInt());
        
    }
}