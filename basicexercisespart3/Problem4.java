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
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print (" Input weight in pounds: ");
        double weight = sc.nextDouble();
        double weightInKg = weight * 0.45359237;
        
        System.out.print (" Input Height in inches: ");
        double height = sc.nextDouble();
        double heightInMeters = height * 0.0254;
        
        double bmi = weightInKg / (heightInMeters * heightInMeters);
        
        System.out.println(weight + " Body Mass Index is: " + bmi );
    }
}
