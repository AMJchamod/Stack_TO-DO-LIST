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
        menu m =new menu();
        m.menu1();
        Scanner in = new Scanner (System.in);
         int answer=in.nextInt();
         switch(answer){
        
                 case 1:
                     stack s = new stack();
                     System.out.println("ADD YOUR TASKS HERE");
                     while(in.hasNext()){
                     String x = in.nextLine();
                     if(x.equals("exit")){
                         m.menu1();
                     }
                     s.push(x);
                     }
    }
         
         
        
    }
}
