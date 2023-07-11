/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo;

import com.sun.java.accessibility.util.TopLevelWindowListener;
import java.security.DrbgParameters;
import javax.xml.crypto.Data;

/**
 *
 * @author DELL
 */
public class MyStack <T> {
    Node<T> head;// top or head
    int count;// size of staff
    public class Node <T> {
        T data;// data of Node
        Node next;//next element of Node

        public Node(T data) {
            this.data=data;
            this.next=null;
        }
    }
    public void push(T data ) {
        //creat new node : aNode 
        Node aNode= new Node(data);
        if(isEmpty()){ //null
            //if null, set head to anode and anode becomes the top element 
            head=aNode; 
        }else{ 
            //set next pointer of anode = head
            aNode.next=head;
            head= aNode; //set anode becomes the top
        }
        count++;
    }
    public T peek() {
        if(!isEmpty()){
            return head.data; 
//represents the value of the top element in the stack.
        }else{
        return null;
        }
    }
    public T pop() {       
        if(!isEmpty()){
            //create node and =value of head now, represents
            //the element that will be removed from the stack 
        Node<T> temp =head;  
        head=head.next; //move to head to point next and head removed 
        temp.next=null; // delete connect with stack 
        count--;
        return temp.data; //represent the value of element removed            
        }else{
            return null;
        }       
    }

    public int search( T data) {
        //create current reference to head of stack, use to run the stack 
        Node<T> current = head;
        int index=0;// top =0 
        while(current != null){
            if(current.data==data){ // check current == (int data)? 
                return index;
            } current = current.next; // if false, move to the next node and increase index
            index++;        
         }
        return -1;       
    }

    public boolean isEmpty() {
        return count==0;
    }

    public int size() {
        return count;
    }

    public String toString(){
        String str = "[";
        Node current = head; //create current and = value of head.
        while(current !=null){
        str+= current.data; 
        //represent for value of element in stack
         if (current.next != null) {
                str+=(", ");
            }
        current=current.next;
       // reference to point next and move the iteration forward
    }
        str+= "]";//close
        return str;
        
    }
}   
    
