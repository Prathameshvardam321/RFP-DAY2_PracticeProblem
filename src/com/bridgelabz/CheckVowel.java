package com.bridgelabz;

import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        System.out.print("Enter any alphabet from (a To z) : ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a' :
                System.out.println("It is a vowel");
                break;
            case 'e' :
                System.out.println("It is a vowel");
                break;
            case 'i' :
                System.out.println("It is a vowel");
                break;
            case 'o' :
                System.out.println("It is a vowel");
                break;
            case 'u' :
                System.out.println("It is a vowel");
                break;
            default :
                System.out.println("It is a consonent");
        }
    }
}
