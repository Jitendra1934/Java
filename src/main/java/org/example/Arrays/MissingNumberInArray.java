package org.example.Arrays;

public class MissingNumberInArray {

    /*Array Question: Find the missing number in an array from 1 to N
    Example: [1, 2, 4, 5, 6] → Output: 3*/

    public static void main(String[] args) {

        int[] a= {1, 2, 4, 5, 6};// Array must be in sorted order

        int n=1;

        for(int i=0; i<a.length; i++){

            if(a[i]==n){
                n++;
            }
            else{
                System.out.println("Missing number is "+n);
                break;

            }


        }
    }
}
