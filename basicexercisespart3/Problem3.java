/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicexercisespart3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem3 {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      
        System.out.println("Print the number of minutes: ");
        int minutes = sc.nextInt();
        
        int minutesInYear = 60 * 24 * 365; 
        int year = minutes / minutesInYear;
        int days = (minutes % minutesInYear) / (60 * 24);
        System.out.println(minutes + " minutes is approximately " + year + " years and " + days + " days ");
                
    }
}
