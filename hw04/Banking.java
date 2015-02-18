//Murphy Zingsheim
//CSE 002
//Professor: Brian Chen
//This program will have me utilize switch statements to simulate the processing of bank transactions
//not unlike an ATM. 

import java.util.Random;
import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
    
        Random rand = new Random();
        int randomInt = rand.nextInt(4000) + 1000;
        
        Scanner myScanner;
        myScanner =new Scanner(System.in);
        
        System.out.println("Would you like to: deposit money, withdraw money, or view your balance?");
        String transaction = myScanner.next();
        
        
        switch(transaction) {
            case "deposit":
                //case deposit
                System.out.println("Your current balance is $"+randomInt+" How much would you like to deposit?");
                int deposit=myScanner.nextInt();
                if (deposit < 0) {
                    System.out.println("Invalid entry");
                } else {
                    int BalanceDeposit=(randomInt+deposit);
                    System.out.println("Your new balance is $"+BalanceDeposit);
                }
                break;
            case "withdraw":
                System.out.println("Your current balance is $"+randomInt+" How much would you like to withdraw?");
                int withdraw=myScanner.nextInt();
                if (withdraw < 0 || withdraw>randomInt ){
                    System.out.println("Invalid entry");
                }
                else{
                    int BalanceWithdraw=(randomInt+-withdraw);
                    System.out.println("Your new balance is $"+BalanceWithdraw);
                }
                //case deposit
                break;
            case "view":
                System.out.println("Your account balance is $"+randomInt);
                //case view
                break;
            default:
                System.out.println("You have input the wrong statement. Please select either: withdraw, deposit, or view");
                //incorrect input
                break;
        }
        
    }
}