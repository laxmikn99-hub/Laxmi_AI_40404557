package com.mycompany.laxmia140404557;

// Import the scanner class to accept input from the keyboard
import java.util.Scanner;

public class LaxmiA140404557 {

    public static void main(String[] args) {
        String[] monthlist       = new String[12]; // list of strings
        int[]    temperaturelist = new int[12];
        Scanner   input          = new Scanner(System.in);
        monthlist[0] = "January";
        temperaturelist[0] = 8;
        monthlist[1]= "Feburary";
        temperaturelist[1]= 9;
        monthlist[2]= "March";
        temperaturelist[2]= 12;
        monthlist[3]= "April";
        temperaturelist[3]= 16;
        monthlist[4]= "May";
        temperaturelist[4]= 18;
        monthlist[5]= "June";
        temperaturelist[5]= 22; 
        monthlist[6] = "July";
        temperaturelist[6] = 24;
        monthlist[7]= "August";
        temperaturelist[7]= 22;
        monthlist[8]= "September";
        temperaturelist[8]= 20;
        monthlist[9]= "October";
        temperaturelist[9]= 16;
        monthlist[10]= "November";
        temperaturelist[10]= 12;
        monthlist[11]= "December";
        temperaturelist[11]= 9;
                  
        
  for( int i=0;i<12;i++){ // for loop to step through each array item and print them out.     
      System.out.println("Month:" + monthlist[i]);
      System.out.println("Temperature:" + temperaturelist[i]);
      System.out.println("");
    }
  
  
  /* search for month
  
  */
  String searchMonth; // create a variable to store the month entered by the user
  System.out.println("Enter a month to search"); // prompt the user to enter a month.
  searchMonth = input.next(); // get the user to type a month store in the SearchName variable.
    
  
     for(int i=0;i<12;i++){ // loop 12 times to check each item of the array
         if(searchMonth.equals (monthlist[i])){ //check if the month entered by the user is the same as the array item.
               System.out.println("Month founnd at position:" + i);// printout item found and position.
               System.out.println ("Month:" + monthlist[i]);        // print out month at array position.
               System.out.println("Temperature:" + temperaturelist[i]); // print out temperature at array position.
              
         }
     }
   /* Calculate the average temperature
     
     */
   int total = 0; // create a variable to hold the total of temperatures added together
   int average = 0; // create variable to hold the average temperature.
   for (int i=0;i<12;i++){ // loop through the temperature array.
       total = total + temperaturelist[i]; // add each temperature to the total variable.
   
    }
  average = total/12; // calculate the average temperature
  System.out.println("Average temperature:" + average); // print out the average
    }
}
