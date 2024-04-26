package com.programs;

import java.util.Scanner;

class EvenOdd{
    public static void main(String[] args) {
        int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");

            n = sc.nextInt();
            if (n % 2 == 0)
                System.out.println("Entered number is a Even Number.");
            else

                System.out.println("Entered number is a Odd Number.");


        }
    }

