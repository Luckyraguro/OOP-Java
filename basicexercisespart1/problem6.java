/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicexercisespart1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class problem6 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//to accept user input
        
         System.out.print("Input First number:");
         int firstnum = sc.nextInt();
                 
         System.out.print("Input Second number:");
         int secondnum = sc.nextInt();
         
         System.out.println("Expected output ");
         int sum =firstnum + secondnum;
         int diff =firstnum - secondnum;
         int prod =firstnum * secondnum;
         int quo =firstnum / secondnum;
         int module =firstnum % secondnum;
         
         System.out.println(firstnum + " + " + secondnum + " = " + sum );
         System.out.println(firstnum + " - " + secondnum + " = " + diff );
         System.out.println(firstnum + " * " + secondnum + " = " + prod );
         System.out.println(firstnum + " / " + secondnum + " = " + quo );
         System.out.println(firstnum + " % " + secondnum + " = " + module );
        
     
     }
}
