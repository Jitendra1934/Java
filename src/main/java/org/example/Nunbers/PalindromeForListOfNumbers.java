package org.example.Nunbers;

import java.util.ArrayList;
import java.util.List;

public class PalindromeForListOfNumbers {
    public static void main(String[] args){
        List<Integer> li = new ArrayList<>();
        li.add(131);
        li.add(234);
        li.add(191);
        for(int i=0; i<li.size();i++){
            int rem, sum=0;
            int n=li.get(i);
            int temp = n;
            while( n > 0){
                 rem =  n%10;
                 sum= sum*10+rem;
                 n =  n/10;
            }
            if(temp == sum){
                System.out.println(temp+" is a palindrome");
            }
            else
                System.out.println(temp+" is not a palindrome number");
        }
    }
}
