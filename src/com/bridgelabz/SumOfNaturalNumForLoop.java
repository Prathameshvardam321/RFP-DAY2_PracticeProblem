package com.bridgelabz;

import java.util.Scanner;

public class SumOfNaturalNumForLoop {
    public static void main(String[] args) {
        System.out.print("Enter Single digit number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        for (int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println("Sum of first "+num+" natural numbers is "+sum);
    }
}
