package javaOOP2;

public class GravityCalculator {
 public final static double Acceleration = -9.81;
    public static double calcDist(double time, double InitialVelocity, double InitialPosition) {
     return 0.5 * Acceleration * (time * time) + InitialVelocity * time * InitialPosition;
    }
    public static void main(String[] args) {
        System.out.println(calcDist(34.7,15.3,25.6));
    }
}