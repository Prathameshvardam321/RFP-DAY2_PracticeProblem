package com.bridgelabz;

import java.util.Scanner;

public class MaxAndMinNumber {
    static void calculateMinMaxNumber(int a,int b,int c){
        int op1 = a+b*c;
        int op2 = c+a/b;
        int op3 = a%b+c;
        int op4 = a*b+c;
        System.out.println("Value 1 : "+op1);
        System.out.println("Value 2 : "+op2);
        System.out.println("Value 3 : "+op3);
        System.out.println("Value 4 : "+op4);
        int max=op1;
        int min =op1;
        if (op1>max){
            max=op1;
        }
        if (op2>max){
            max=op2;
        }
        if (op3>max){
            max=op3;
        }
        if (op4>max){
            max=op4;
        }
        if (op1<min){
            min=op1;
        }
        if (op2<min){
            min=op2;
        }
        if (op3<min){
            min=op3;
        }
        if (op4<min){
            min=op4;
        }
        System.out.println("Max "+max);
        System.out.println("Min "+min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Value of a : ");
        int a = sc.nextInt();
        System.out.println("Value of b : ");
        int b = sc.nextInt();
        System.out.println("Value of c : ");
        int c = sc.nextInt();
        calculateMinMaxNumber(a,b,c);
    }
}
