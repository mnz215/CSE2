import java.util.Scanner;
 
public class ToHex {
        public static void main(String[] args) {
 
                Scanner scan = new Scanner(System.in);
 
                System.out.println("Please enter three numbers representing RBG values:");
 
                int firstNumber = 0, secondNumber = 0, thirdNumber = 0;
               
                //get the first number, checking to make sure its an int and between 0-255
                if (scan.hasNextInt()) {
                        firstNumber = scan.nextInt();
                        if (firstNumber < 0 || firstNumber > 255) {
                                System.out.println("Sorry you must enter values between 0-255.");
                                System.exit(0);
                        }
                } else {
                        System.out.println("Sorry, your input must consist of integers.");
                        System.exit(0);
                }
 
                //get the second number, checking to make sure its an int and between 0-255
                if (scan.hasNextInt()) {
                        secondNumber = scan.nextInt();
                        if (secondNumber < 0 || secondNumber > 255) {
                                System.out.println("Sorry you must enter values between 0-255.");
                                System.exit(0);
                        }
                } else {
                        System.out.println("Sorry, your input must consist of integers.");
                        System.exit(0);
                }
 
                //get the third number, checking to make sure its an int and between 0-255
                if (scan.hasNextInt()) {
                        thirdNumber = scan.nextInt();
                        if (thirdNumber < 0 || thirdNumber > 255) {
                                System.out.println("Sorry you must enter values between 0-255.");
                                System.exit(0);
                        }
                } else {
                        System.out.println("Sorry, your input must consist of integers.");
                        System.exit(0);
                }
 
                //get the first part of the first hex value by dividing by 16
                int firstBase = firstNumber/16;
                //get the second part of the first hex value by using modulos operator
                int firstRemainder = firstNumber%16;
 
                //get the first part of the second hex value by dividing by 16
                int secondBase = secondNumber/16;
                //get the second part of the second hex value by using modulos operator
                int secondRemainder = secondNumber%16;
 
                //get the first part of the third hex value by dividing by 16
                int thirdBase = thirdNumber/16;
                //get the second part of the third hex value by using modulos operator
                int thirdRemainder = thirdNumber%16;
 
                String output = "";
 
                //convert from base 10 to base 16
                if (firstBase < 10) {
                        output += firstBase;
                } else if (firstBase == 10) {
                        output += "A";
                } else if (firstBase == 11) {
                        output += "B";
                } else if (firstBase == 12) {
                        output += "C";
                } else if (firstBase == 13) {
                        output += "D";
                } else if (firstBase == 14) {
                        output += "E";
                } else if (firstBase == 15) {
                        output += "F";
                }
 
                if (firstRemainder < 10) {
                        output += firstRemainder;
                } else if (firstRemainder == 10) {
                        output += "A";
                } else if (firstRemainder == 11) {
                        output += "B";
                } else if (firstRemainder == 12) {
                        output += "C";
                } else if (firstRemainder == 13) {
                        output += "D";
                } else if (firstRemainder == 14) {
                        output += "E";
                } else if (firstRemainder == 15) {
                        output += "F";
                }
 
                //convert from base 10 to base 16
                if (secondBase < 10) {
                        output += secondBase;
                } else if (secondBase == 10) {
                        output += "A";
                } else if (secondBase == 11) {
                        output += "B";
                } else if (secondBase == 12) {
                        output += "C";
                } else if (secondBase == 13) {
                        output += "D";
                } else if (secondBase == 14) {
                        output += "E";
                } else if (secondBase == 15) {
                        output += "F";
                }
 
                if (secondRemainder < 10) {
                        output += secondRemainder;
                } else if (secondRemainder == 10) {
                        output += "A";
                } else if (secondRemainder == 11) {
                        output += "B";
                } else if (secondRemainder == 12) {
                        output += "C";
                } else if (secondRemainder == 13) {
                        output += "D";
                } else if (secondRemainder == 14) {
                        output += "E";
                } else if (secondRemainder == 15) {
                        output += "F";
                }
 
                //convert from base 10 to base 16
                if (thirdBase < 10) {
                        output += thirdBase;
                } else if (thirdBase == 10) {
                        output += "A";
                } else if (thirdBase == 11) {
                        output += "B";
                } else if (thirdBase == 12) {
                        output += "C";
                } else if (thirdBase == 13) {
                        output += "D";
                } else if (thirdBase == 14) {
                        output += "E";
                } else if (thirdBase == 15) {
                        output += "F";
                }
 
                if (thirdRemainder < 10) {
                        output += thirdRemainder;
                } else if (thirdRemainder == 10) {
                        output += "A";
                } else if (thirdRemainder == 11) {
                        output += "B";
                } else if (thirdRemainder == 12) {
                        output += "C";
                } else if (thirdRemainder == 13) {
                        output += "D";
                } else if (thirdRemainder == 14) {
                        output += "E";
                } else if (thirdRemainder == 15) {
                        output += "F";
                }
 
                System.out.println("The decimal numbers R:" + firstNumber + ", G" + secondNumber + ", B" + thirdNumber + " is represented in hexadecimal as: " + output);
        }
}