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
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print (" Input distance in meters: ");
        double distanceMeters = sc.nextDouble();
        
        System.out.print (" Input hour: ");
        int hours = sc.nextInt();
        System.out.print (" Input minutes: ");
        int minutes = sc.nextInt();
        System.out.print (" Input seconds: ");
        int seconds = sc.nextInt();
        
        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
        
        double speedMetersPerSecond = distanceMeters / totalSeconds;
        double speedKilometersPerHour = (distanceMeters / 100.0) / (totalSeconds / 360.0);
        double speedMilesPerHour = (distanceMeters / 160.0) / (totalSeconds / 360.0);
        
        System.out.print ("Speed in meters/second: " + speedMetersPerSecond);
        System.out.print ("Speed in kilometers/hour: " + speedKilometersPerHour);
        System.out.print ("Speed in mile/hour: " + speedMilesPerHour );
        
    }
}
