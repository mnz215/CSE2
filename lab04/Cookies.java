    //Murphy Zingsheim
    //CSE002
    //Professor Brian Chen
    //This program will have the user input the number of people at a party
    // the number of cookies that the user brought and whether the amount is sufficient.
    
    import java.util.Scanner;
    
    public class Cookies{
        public static void main(String[] args){
            
            Scanner myScanner;
            myScanner=new Scanner(System.in);
            
            System.out.print("Enter the number of People: ");
    
    
        if ( myScanner.hasNextInt() ){
            int nPeople=myScanner.nextInt();
             if( nPeople > 0 ){
                  System.out.println("Enter the number of cookies you are planning to buy: ");
                  if( myScanner.hasNextInt() ){
                      int nCookies=myScanner.nextInt();
                      if( nCookies > 0){
                          System.out.println("How many do you want each person to get? ");
                          if( myScanner.hasNextInt() ){
                              int nCookiesPerPerson=myScanner.nextInt();
                              if( nCookiesPerPerson > 0 ){
                                  if( ((nCookiesPerPerson*nPeople)>nCookies) ){
                                      System.out.println("You do not have enough cookies for each person");
                                      if(nCookies/nPeople){
                                          System.out.print(", but they will divide evenly.");
                                      }
                                  
                                 else{
                                     System.out.println("You have enough");
                                 }
                                  }
                                 if( (nCookies/nPeople) ){
                                     System.out.print("and they will divide evenly ");
                                 }
                                 }
                                 }
                                 }
                              }
                          }
                      }

        else{
            System.out.println("You did not enter an integer");
            return;
        }
        }
    }