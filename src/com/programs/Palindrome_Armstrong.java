package com.programs;

import java.util.Scanner;

public class Palindrome_Armstrong {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println("The input number is a palindrome.");
        } else {
            System.out.println("The input number is not a palindrome.");
        }
    }

    private static boolean isPalindrome(int num) {
        int temp = num;
        int revnum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            revnum = revnum * 10 + digit;
            temp = temp / 10;
        }
        return num == revnum;
    }

}