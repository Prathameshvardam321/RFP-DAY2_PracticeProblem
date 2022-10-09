package com.bridgelabz;
import java.lang.Math;
import java.util.Scanner;

public class Distance {
    static void calculateDistance(int x,int y){
        double distance = Math.sqrt(x * x + y * y);

        System.out.println("Distance from ("+ x + ", " + y +") to (0, 0) = " + distance);
    }
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
       calculateDistance(x,y);
       calculateDistance(x,y);
    }
}
