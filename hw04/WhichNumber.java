//Murphy Zingsheim 
//CSE 002
//Professor: Brian Chen
//The goal of this first programm is to have a user input a number between 1 and 10 (including 1 and 10) and guess that number

import java.util.Scanner;

public class WhichNumber{
    public static void main(String[] args){
        
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        System.out.println("Please think of an int between 1 and 10, inclusive. I will attempt to guess your number.");
        
        System.out.println("Is the number even?");
        
        String even = myScanner.next();
        
        if (even.equals("y") || even.equals("Y")) {
            
            System.out.println("Is it divisible by 3?");
            String divBy3 = myScanner.next();
            if (divBy3.equals("y") || divBy3.equals("Y")) {
                System.out.println("Your number is 6");
            } else if (divBy3.equals("n") || divBy3.equals("N")) {
                System.out.println("is the number divisible by 4?");
                String divBy4 = myScanner.next();
                if (divBy4.equals("y") || divBy4.equals("Y")) {
                    System.out.println("is the number divided by 4 greater than 1?");
                    String GreaterThan1 = myScanner.next();
                     if (GreaterThan1.equals("y") || GreaterThan1.equals("Y")) {
                        System.out.println("Your number is 8");
                    } else if (GreaterThan1.equals("N") || GreaterThan1.equals("n")) {
                        System.out.println("Your number is 4");
                    } else {
                         System.out.println("Sorry, that is not a valid input.");
                    }
                } else if (divBy4.equals("n") || divBy4.equals("N")){
                   System.out.println("is it divisible by 5?");
                   String divby5 = myScanner.next();
                   if( divby5.equals("y") || divby5.equals("Y")){
                       System.out.println("Your number is 10");
                   } else if( divby5.equals("n") || divby5.equals("N")){
                       System.out.println("Your number is 2");
                   } else{
                        System.out.println("Sorry, that is not a valid input.");
                   }
                } else { 
                    System.out.println("Sorry, that is not a valid input.");
                }
            } else{
                System.out.println("Sorry, that is not a valid input.");
            }
            
        } else if (even.equals("n") || even.equals("N")) {
            System.out.println("Is it divisible by 3?");
            String div3By = myScanner.next();
            if ( div3By.equals("y") || div3By.equals("Y")){
                System.out.println("when divided by 3 is the result greater than 1?");
                String greater1 = myScanner.next();
                if (greater1.equals("y") || greater1.equals("Y")){
                    System.out.println("Your number is 9");
                } else if( greater1.equals("n") || greater1.equals("N")){
                    System.out.println("Your number is 3");
                } else {
                     System.out.println("Sorry, that is not a valid input.");
                }
            } else if( div3By.equals("n") || div3By.equals("N")){
                System.out.println("Is it greater than 6?");
                String greaterThan6 = myScanner.next();
                if( greaterThan6.equals("y") || greaterThan6.equals("Y")){
                    System.out.println("Your number is 7");
                } else if ( greaterThan6.equals("n") || greaterThan6.equals("N")) {
                    System.out.println("Is it less than 3?");
                    String lessThan3 = myScanner.next();
                    if (lessThan3.equals("y") || lessThan3.equals("Y")){
                        System.out.println(" your number is 1");
                    } else if (lessThan3.equals("n") || lessThan3.equals("N")){
                        System.out.println("your number is 5");
                    } else {
                         System.out.println("Sorry, that is not a valid input.");
                    }
                } else{
                     System.out.println("Sorry, that is not a valid input.");
                }
            } else{
                System.out.println("Sorry, that is not a valid input.");
            }
        } else {
            System.out.println("Sorry, that is not a valid input.");
        }
    }
}
        

