/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment11;
import java.util.Scanner;

public class Assignment11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                           "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int[] temperature2023 = {8, 9, 12, 16, 18, 22, 24, 22, 24, 22,
                                 20, 16, 12, 9};
        int[] temperature2024 = {8, 8, 12, 17, 19, 20, 23, 22, 19, 
                                 16, 10, 8};
        //choose year
        
        System.out.println("Enter year and month.(2023 or 2024):");
        int year = sc.nextInt();
        
        int[] temperature;
        if (year == 2023){
            temperature = temperature2023;
        } else {
            temperature = temperature2024;          
        }
        
        
        //Calculate average
        int sum = 0;
        for (int t : temperature) {
            sum += t;
        }
        double average = (double) sum / temperature.length;
        System.out.println("Average temperature = "+ average  + "c");
        
        
        //linear search
        System.out.println("Enter month to search :");
        String month = sc.nextLine();
        
        boolean found = false;
        for (int i=0; i<months.length; i++){
            if (months[i].equalsIgnoreCase(month)){
                System.out.println("temperature in" + month + " " + year + "="
                                    + temperature[i] + "C");
                found = true;
                break;
            }
        
        }
        if (!found){
            System.out.println("Month not found.");
        }
        sc.close();
    }
}

