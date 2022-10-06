package com.bridgelabz;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int temp = num;
        int reverse=0;
        for (;num>0;num/=10){
            int rem = num%10;
            reverse=reverse*10+rem;
        }
        if (temp==reverse){
            System.out.println(temp+" is palindrome number.");
        }
        else {
            System.out.println(temp+" is not palindrome number.");
        }
    }
}
