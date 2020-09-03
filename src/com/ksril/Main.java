package com.ksril;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Line: ");
        String str = in.nextLine();

        Palindrome obj = new Palindrome();
        int count = obj.checkPalindrome(str.toCharArray(), str.length());

        System.out.print("Number of Palindrome = ");
        System.out.print(count);
    }
}
