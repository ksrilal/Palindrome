package com.ksril;

import java.util.Arrays;

public class Palindrome {
    private int count = 0;

    public int checkPalindrome(char[] ch, int n) {
        boolean p[][] = new boolean[n][n];

        //single character is not considered as palindrome in here.
        //for palindrome of single length.
        for(int i=0;i<n-1;i++){
            if(ch[i]==ch[i+1])
                p[i][i+1] = true;
        }

        //for other palindrome.
        if(n>2){
            for(int gap=2;gap<n;gap++){
                for(int i=0;i<n-gap;i++){
                    int j = gap + i;

                    if(ch[i]==ch[j] && ch[i+1]==ch[j-1])
                        p[i][j] = true;
                }
            }
        }

        //count of palindrome.
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(p[i][j]==true)
                    count++;
            }
        }
        return count;
    }
}