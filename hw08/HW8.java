//Murphy Zingsheim
//Professor:Brian Chen
//3/22/2015
//The purpose of this assignment is to gain familiarity with methods, writing methods, and
//calling a scanner so that a user can input correct input
import java.util.Scanner;

public class HW8 {
public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }
    
    
    public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }
    
    
  public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    
    public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
    
    public static String getInput(Scanner scan, String string) {
        String input = scan.next();
        if (!input.equals("c") && !input.equals("C")) {
            System.out.println("Yea right LOSER!");
            System.exit(0);
        }
        
        return input;
    }
    
    public static String getInput(Scanner scan, String string, int trial) {
        while (trial > 0) {
            String input = scan.next();
            if (input.equals("a") || input.equals("A")) {
                int rand = (int)Math.round(Math.random());
                if (rand == 0) {
                    System.out.println("Gosh! How can you miss it!");
                } else {
                    trial--;
                    System.out.println("Critical Hit!");
                }
            } else if (input.equals("e") || input.equals("E")) {
                int rand = (int)(Math.random()*10) + 1;
                if (rand == 10) {
                    System.out.println("You Escaped!!");
                    return "";
                }
            } else {
                System.out.println("Executed by the GIANT! Game Over");
                System.exit(0);
            }
        }
        
        return "";
    }
    
    public static String getInput(Scanner scan) {
        int treasure=scan.nextInt();
        switch (treasure) {
            case 1:
                    System.out.println("You won a Ferrari!");
                    break;
            case 2: 
                    System.out.println("You won a Maserati!");
                    break;
            case 3: 
                    System.out.println("Sadly, you won a Toyota Prius");
                    break;
            default: 
                    System.out.println("A Wrong Number!");
                    break;
        }
        return "";
    }
}