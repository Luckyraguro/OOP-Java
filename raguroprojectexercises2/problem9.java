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
public class problem9 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("input number of rows: ");       
        int rows = sc.nextInt();
        
        for (int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
            System.out.print(j);
        }        
            System.out.println();
        }
    }
    
}
