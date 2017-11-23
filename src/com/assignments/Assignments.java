package com.assignments;


import java.util.Scanner;

public class Assignments {

    boolean isPrimeNum = true;

    public int takeInput() {

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter number: ");
        int no = reader.nextInt();
        reader.close();

        return no;

    }


    public boolean isPrime(int no) {


        if (no == 2 || no == 3)
            return true;

        if (no % 2 == 0)
            isPrimeNum = false;
        if (no % 3 == 0)
            isPrimeNum = false;

        for (int i = 2; i <= no / 2; i++) {
            if (no % i == 0) {
                isPrimeNum = false;
                break;
            }
        }

        if (!isPrimeNum)
            return false;
        else
            return true;
    }

    public boolean isEven(int no){

        if (no % 2 == 0){
            return true;
        }
        else return false;
    }

    public boolean isOdd(int no){

        if (no % 2 == 0){
            return false;
        }
        else return true;
    }

    void printFibonacci(int  term1, int term2) {

        int thisTerm;
        System.out.println(term1);
        System.out.println(term2);

        for(int i=term1; i<=10; i++){
            thisTerm = term1 + term2;
            term1 = term2;
            term2 = thisTerm;
            System.out.println(thisTerm);
        }

    }


}