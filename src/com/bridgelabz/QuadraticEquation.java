package com.bridgelabz;

import java.util.Scanner;

public class QuadraticEquation {
    static void rootsOfQuadraticEquation(int a,int b,int c){
        int delta = b*b-4*a*c;
        double sq = Math.pow(delta,0.5);
        double root1 = (-b+sq)/(2*a);
        double root2 = (-b-sq)/(2*a);
        System.out.println("Value of root 1 : "+root1);
        System.out.println("Value of root 2 : "+root2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of a : ");
        int a = scan.nextInt();
        System.out.println("Enter value of b : ");
        int b = scan.nextInt();
        System.out.println("Enter value of c : ");
        int c = scan.nextInt();
       rootsOfQuadraticEquation(a,b,c);
    }
}
