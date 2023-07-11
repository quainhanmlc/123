/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo;

import java.time.DayOfWeek;

/**
 *
 * @author DELL
 */
public class MyQueue<T> {
    Node front;//Front or Head
    Node rear;//Rear or Tail
    int count;   
    public class Node{
        T data;// data of Node
        Node prev;//next element of Node
        Node next;//previous element of Node  
    
    public Node(T data){
        this.data=data;
        this.next=null;
        this.prev=null;      
        }
    }
    public void enqueue(T data) {
        Node aNode=new Node(data);
        if(isEmpty()){
            front=aNode;// create front and rear
            rear=aNode;           
        }else{           
            rear.next=aNode; 
            aNode.prev=rear;
            rear=aNode;           
        }       
        count++;
    }
    public T dequeue() {
        if(isEmpty()){
            return null;
        }
        //store data of front node
        T data=front.data;
        if(count==1){
            front=null;
            rear=null;           
        }else{
            Node temp= front;
            front=front.next;        
            front.prev=null;
            temp.next=null;
            //Set the next reference of the new front node to null: front.next = null;
        }
        count--;
        return data;       
    }
    public boolean isEmpty() {
        return count ==0;
    }

    public int size() {
        return count;
    }
    public String toString(){
        String str = "[";
        Node current = front; //create current and = value of head.
        while(current.next !=null){
       str+= current.data;
        if (current.next != null) {
                str+=(", ");
            }
        //represent for value of element in stack 
        current=current.next;       
       // reference to point next and move the iteration forward
        }         
        str+= current.data +"]"; //close
        return str;
    }
    public int search(T data) {
        //create current reference to head of stack, use to run the stack 
        Node current = front;
        int index=0;// top =0 
        while(current != null){
            if(current.data==data){ // check value data of current == (int data)? 
                return index;
            } current = current.next; // if false, move to the next node and increase index
            index++;        
         }
        return -1;
    }
    public T getFront(){
        if(isEmpty()){
            return null;
        }return front.data;
    }
    public T getRear(){
        if(isEmpty()){
            return null;
        }return rear.data;
    }
}
