//Murphy Zingsheim
//Lab-02 Cyclometer
//Date- 1-30-2015
//Professor:Brian Chen

//The goal of this program is to write a program akin to a bicycle cyclomter
//we will measure distance based off of wheel rotations and also count time

public class Cyclometer{
    public static void main(String[] args) {
    
    int secsTrip1=480;
    int secsTrip2=3220;
    int countsTrip1=1561;
    int countsTrip2=9037;
    double wheelDiameter=27.0, PI=3.14158, feetPerMile=5280, inchesPerFoot=12, secondsPerMinute=60;
    double distanceTrip1, distanceTrip2, totalDistance;
    
    System.out.println("Trip 1 took " +(countsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
    System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    distanceTrip1/=inchesPerFoot*feetPerMile;
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
        
    }
}