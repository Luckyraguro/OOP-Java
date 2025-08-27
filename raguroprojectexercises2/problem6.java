/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raguroprojectexercises2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class problem6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter range: ");
        int range = sc.nextInt();
        
        for (int i = 1; i <= range; i++){
            for (int j = 1; j <= range; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
        
    }
}
