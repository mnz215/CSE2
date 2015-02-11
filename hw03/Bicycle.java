//Murphy Zingsheim
//CSE002
//Professor: Brian Chen
//Homework #3
//This program will have me use a scanner to have a user input data regarding bicycling
//my program will then, give the distance, time, and average mph of the trip

import java.util.Scanner;

public class Bicycle{
    public static void main(String[] args){
    
    Scanner myScanner;
    myScanner=new Scanner(System.in);
    
    System.out.print("Enter the number of counts (integer >0) on the cyclometer: ");
    int nCyclometer=myScanner.nextInt();
    
    System.out.print("Enter the number of seconds (integer >0) during which the counts occured: ");
    int nSeconds=myScanner.nextInt();
    
    double wheelDiameter=27.0, PI=3.14158, feetPerMile=5280, inchesPerFoot=12, secondsPerMinute=60;
    double distance=nCyclometer*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    
    System.out.println("The distance was "+distance+"miles and took "+(nSeconds/secondsPerMinute)+" minutes");
    System.out.println("The average mph was "+(distance/(nSeconds/secondsPerMinute/60)));
    
        
    }
}