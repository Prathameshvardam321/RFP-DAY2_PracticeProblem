package com.bridgelabz;
import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.print("Enter the Num : ");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= num) {
            sum += i;
            i++;
        }
        System.out.print("Sum of " +num + " Numbers is " +sum+".");
    }
}