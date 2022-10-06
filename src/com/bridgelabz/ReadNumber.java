package com.bridgelabz;
import java.util.Scanner;
public class ReadNumber {
        public static void main(String[] args) {
            System.out.print("Enter Single digit number :");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if(num == 1) {
                System.out.print("One");
            }else if(num == 2) {
                System.out.print("Two");
            }else if(num == 3) {
                System.out.print("Three");
            }else if(num == 4) {
                System.out.print("Four");
            }else if(num == 5) {
                System.out.print("Five");
            }else if(num == 6) {
                System.out.print("Six");
            }else if(num == 7) {
                System.out.print("Seven");
            }else if(num == 8) {
                System.out.print("Eight");
            }else if(num == 9) {
                System.out.print("Nine");
            }else {
                System.out.println("Enter Only Single Digit Number...");
            }
        }
    }

