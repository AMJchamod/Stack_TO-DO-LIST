/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.todolist;
import java. util.Scanner;
/**
 *
 * @author jcham
 */
public class Todolist {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         menu m = new menu();
         boolean done = false;
         String complete ;
         m.menu1();
         
          stack s = new stack();
         System.out.println("enter your choisce");
         String answer = in.nextLine(); // fix this
      
          if("1".equals(answer)){
              
              
                
                      while(in.hasNext()){
                            System.out.println("enter your works");
                            String d = in.nextLine();
                            if ("done".equals(d) ){
                                
                                  break;
                           }else{
                                  s.push(d);
                                 }
                        }
               
                
          }else if("2".equals(answer)) {
             s.pop();
             String g =s.pop();
             System.out.println(g);
             
            
        }
         
         
       
    }
    }
    
       