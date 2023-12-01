/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todolist;

/**
 *
 * @author jcham
 */
public class stack {
    public static final int max =100;
    String [] array = new String[max];
    int top ;
    
     public stack (){
        top = -1;
    }
     boolean push(String x){
         if (top>=array.length-1){
             System.out.println("SORRY MEMORY FULL");
             return false;
         }else{
             array[++top] = x;
              return true;
     }
     }
         
      int pop(){
           if(top<0){
               System.out.println("System underflow");
                return 0;
               
           }else{
                int x = array[--top];
                 return x;
           }
         
     }
     
}

