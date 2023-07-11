/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demo;

/**
 *
 * @author DELL
 */
public class Demo {

    public static void main(String[] args) {
        try{
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(0);
        System.out.println("Stack is " + stack.toString());
        System.out.println("Peek is "+stack.peek());
        System.out.println("Size is "+ stack.size());
        System.out.println("Stack is " +stack.toString());
       if(stack.search(5)==-1)
       {
            System.out.println("Element not found ");
       }else{
       System.out.println("Element was found at index: "+stack.search(5));
       }
        System.out.println(stack.pop());
        System.out.println(stack.toString()); 
        System.out.println(stack.isEmpty());
        if(stack.isEmpty())
        {
            System.out.println("Stack is empty");
        }else{
            System.out.println("Stack is not empty");
        }
       
        MyQueue queue = new MyQueue();
        queue.enqueue(6);
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        System.out.println("Queue is " +queue.toString()); 
        System.out.println("Front is "+ queue.getFront());
        System.out.println("Rear is " +queue.getRear());
        System.out.println("Size is " +queue.size());
         if(queue.search(1)==-1)
       {
            System.out.println("Element not found ");
       }else{
       System.out.println("Element was found at index: "+queue.search(1));
       }
        System.out.println(queue.dequeue());
        System.out.println(queue.toString());
        System.out.println(queue.isEmpty());
        if(queue.isEmpty())
        {
            System.out.println("Queue is empty");
        }else{
            System.out.println("Queue is not empty");
        }
         }catch (Exception ex)
        {
            System.out.println("Invalid value");
        }       
    }
}
