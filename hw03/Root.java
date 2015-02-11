//Murphy Zingsheim
//CSE002
//Professor: Brian Chen
//hw3
//This program will prompt a user to enter a double and then print out a crude estimate of the cube root of said number
//then, it iwll take this crude guess and return the value of it squared

import java.util.Scanner;

public class Root{
    public static void main(String[] args){
        
    Scanner myScanner;
    myScanner=new Scanner(System.in);
    
    System.out.print("Enter a double, and I print its cube root- ");
    
    double number=myScanner.nextDouble();
    
    double guess=number/3;
    double guess01 = (guess*guess*guess+number)/(3*guess*guess);
    double guess1=(2*guess01*guess01*guess01+number)/(3*guess01*guess01);
    double guess2=(2*guess1*guess1*guess1+number)/(3*guess1*guess1);
    double guess3=(2*guess2*guess2*guess2+number)/(3*guess2*guess2);
    double guess4=(2*guess3*guess3*guess3+number)/(3*guess3*guess3);
    
    System.out.println("The cube root is "+guess4);
    System.out.println(guess4+"*"+guess4+"*"+guess4+"="+(guess4*guess4*guess4));
    
    
    }
}