//Murphy Zingsheim
//CSE002
//Professor:Brian Chen
//hw03
//This program will prompt the user to enter a double and then print out
//the first four digits to the right of the decimal point

import java.util.Scanner;

public class FourDigits{
    public static void main(String[] args){
        
    Scanner myScanner;
    myScanner=new Scanner(System.in);
    
    System.out.print("Enter a double and I display the four digits tot he right of the decimal point-");
    
    double number=myScanner.nextDouble();
    
    double base = number*10000;
    
    int decimal = (int)(base%10000);
    
    System.out.println(decimal);
    }
}