package com.assignments;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Assignments myAssignment = new Assignments();
        int no = myAssignment.takeInput();

        boolean primeResult = myAssignment.isPrime(no);
        boolean evenResult = myAssignment.isEven(no);
        boolean oddResult = myAssignment.isOdd(no);

        if (primeResult) {
            System.out.println("Provided number is Prime");
        }
        else{
            System.out.println("Provided number is Not Prime");
        }

        if (evenResult) {
            System.out.println("Provided number is Even");
        }
        else{
            System.out.println("Provided number is Not Even");
        }

        if (oddResult) {
            System.out.println("Provided number is Odd");
        }
        else{
            System.out.println("Provided number is Not Odd");
        }

        myAssignment.printFibonacci(3,9);
    }

}

