package com.bridgelabz;
import java.lang.Math;
import java.util.Scanner;

public class Distance {
    static void calculateDistance(int x,int y){
        double distance = Math.sqrt(x * x + y * y);

        System.out.println("Distance from ("+ x + ", " + y +") to (0, 0) = " + distance);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value x : ");
        int x = sc.nextInt();
        System.out.println("Enter value y : ");
        int y = sc.nextInt();
       calculateDistance(x,y);
    }
}
