//Murphy Zingsheim
//5-01-15
//This program has me writing a 5d ragged array containing random doubles between 0 and 31


import java.util.Scanner;

public class FourDwin{
    
    public static void statArray(double[][][][] fourDimmensionalArray){
        
        double    total=0;
        int count=0;
        
        for(int i=0; i<fourDimmensionalArray.length; i++){
            for(int j=0; j<fourDimmensionalArray[0].length; j++){
                for(int k=0; k<fourDimmensionalArray[0][0].length; k++){
                    for(int l=0; l<fourDimmensionalArray[0][0][0].length; l++){
                        total+=fourDimmensionalArray[i][j][k][l];
                        count++;
                    }
                }
            }
        }
        
        total=((int)(total*10))/10.0;
        double mean=((double)((int)((total/count)*10)))/10;
        
        System.out.println();
        System.out.println("Members: "+count);
        System.out.println("Sum: "+total);
        System.out.println("Mean: "+mean);
        System.out.println();
        
    }
    
    public static double[][][][] sort4DArray(double[][][][] fourDimmensionalArray){
        
        for(int i=1; i<fourDimmensionalArray.length; i++){
            double[][][] currentElement=fourDimmensionalArray[i];
            int k;
            for(k=i-1; k>=0 && fourDimmensionalArray[k].length>currentElement.length; k--){
                fourDimmensionalArray[k+1]=fourDimmensionalArray[k];
            }
            fourDimmensionalArray[k+1]=currentElement;
        }
        return fourDimmensionalArray;
        
    }
    
    public static double[][][][] sort3DArray(double[][][][] fourDimmensionalArray){
        
        for(int i=0; i<fourDimmensionalArray.length-1; i++){
            double[][][] currentMin=fourDimmensionalArray[i];
            int currentMinIndex=i;
            
            for(int j=i+1; j<fourDimmensionalArray.length; j++){
                if(currentMin.length>fourDimmensionalArray[j].length){
                    currentMin=fourDimmensionalArray[j];
                    currentMinIndex=j;
                }
            }
            
            if(currentMinIndex!=i){
                fourDimmensionalArray[currentMinIndex]=fourDimmensionalArray[i];
                fourDimmensionalArray[i]=currentMin;
            }
            
        }
        return fourDimmensionalArray;
        
    }
    

    public static void printArray(double[][][][] fourDimmensionalArray){
    
        if(fourDimmensionalArray==null){
            System.out.println("The array was empty!");
        }
        
        System.out.print("{");
        for(int i=0; i<fourDimmensionalArray.length; i++){
            System.out.println();
            System.out.print("{");
            for(int j=0; j<fourDimmensionalArray[0].length; j++){
                System.out.print("{");
                for(int k=0; k<fourDimmensionalArray[0][0].length; k++){
                    System.out.print("{");
                    for(int l=0; l<fourDimmensionalArray[0][0][0].length; l++){
                        System.out.print(" "+fourDimmensionalArray[i][j][k][l]+",");
                    }
                    System.out.print("}");
                }
                System.out.print("}");
            }
            System.out.print("}");
        }
        System.out.println();
        System.out.print("}");
        return;
    
    }
    
    
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        int x=0;
        System.out.print("Enter an integer X: ");        
        while(!scan.hasNextInt()){
            System.out.println("Error. That is not an int.");
            System.out.print("Enter an int: ");
            scan.next();
        }
        x=scan.nextInt();
        while(x<=0){
            System.out.println("Error. Your int must be > 0.");
            System.out.print("Enter an integer X: ");
            scan.hasNextInt();
            x=scan.nextInt();
        }

        int y=0;
        System.out.print("Enter an integer Y > "+x+": ");        
        while(!scan.hasNextInt()){
            System.out.println("Error. That is not an int.");
            System.out.print("Enter an int: ");
            scan.next();
        }
        y=scan.nextInt();
        while(y<=x){
            System.out.println("Error. Your int must be > "+x+".");
            System.out.print("Enter an integer Y: ");
            scan.hasNextInt();
            y=scan.nextInt();
        }
        
        int randomSize = x+(int)(Math.random()*y);
        int randomSize2 = x+(int)(Math.random()*y); 
        int randomSize3 = x+(int)(Math.random()*y);
        double[][][][] fourDimmensionalArray = new double[3][randomSize][randomSize2][randomSize3];
        
        for(int i=0; i<fourDimmensionalArray.length; i++){
            for(int j=0; j<fourDimmensionalArray[0].length; j++){
                for(int k=0; k<fourDimmensionalArray[0][0].length; k++){
                    for(int l=0; l<fourDimmensionalArray[0][0][0].length; l++){
                        fourDimmensionalArray[i][j][k][l]=((int)(Math.random()*300))/10.0;
                    }
                }
            }
        }
        
        System.out.println();
        System.out.println("INITIAL ARRAY");
        printArray(fourDimmensionalArray);
        
        statArray(fourDimmensionalArray);
        
        System.out.println("SORTED ARRAY");
        printArray(sort3DArray(sort4DArray(fourDimmensionalArray)));
        
        statArray(fourDimmensionalArray);
    
    }
    
}