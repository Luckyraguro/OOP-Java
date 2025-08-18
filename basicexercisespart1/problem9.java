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
public class problem9 {
    public static void main(String[] args, int firstnum) {
        Scanner sc = new Scanner(System. in);
        
        System.out.print ("enter first number");
        int firstNum = sc. nextInt();
        System.out.print ("enter second number");
        int secondNum = sc.nextInt();
        System.out.print ("enter third number");
        int thirdNum = sc.nextInt();
        
        System.out.println((firstNum + secondNum + thirdNum) / 3);
    }
}
