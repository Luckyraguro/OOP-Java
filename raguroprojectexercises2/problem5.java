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
public class problem5 {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.print("Input an alphabet: ");
        String input = scanner.nextLine();
   if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Invalid input. Please enter a single alphabet letter.");
        } else {
            char ch = Character.toLowerCase(input.charAt(0));
  if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        }

        scanner.close();
    }
}
