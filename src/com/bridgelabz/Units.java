package com.bridgelabz;

import java.util.Scanner;

public class Units {
    public static void main(String[] args) {
        System.out.println("Enter Number from (1,10,100,1000,100000) : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 1) {
            System.out.print("Unit");
        }else if(num == 10) {
            System.out.print("Ten");
        }else if(num == 100) {
            System.out.print("Hundred");
        }else if(num == 1000) {
            System.out.print("Thousand");
        }else if(num == 100000) {
            System.out.print("Lakh");
        }else {
            System.out.print("Enter Number from (1,10,100,1000,100000)");
        }
    }
}
