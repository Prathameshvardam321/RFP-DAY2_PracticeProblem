package com.bridgelabz;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date : ");
        int date = sc.nextInt();
        System.out.println("Enter Month : ");
        int month = sc.nextInt();
        int d=0;
        switch (month){
            case 3:d=31+29+date;
            if (d>=80 && d<=172){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
                  break;
            case 4:d=31+29+31+date;
            if (d>=80 && d<=172){
                    System.out.println("True");
                }else{
                    System.out.println("False");
                }
                break;
            case 5:d=31+29+31+30+date;
                if (d>=80 && d<=172){
                    System.out.println("True");
                }else{
                    System.out.println("False");
                }
                break;
            case 6:d=31+29+31+30+31+date;
                if (d>=80 && d<=172){
                    System.out.println("True");
                }else{
                    System.out.println("False");
                }
                break;
            default:
                System.out.println("False.");
        }

    }
}
