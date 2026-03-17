package org.example.Arrays;

import java.util.Arrays;

public class RemoveDuplicateArray {

/*
    🔹 Java Coding: Remove duplicates from an array (without HashMap)
*/
        public static void main(String[] args) {

            //upcoming my change is   int[] a ={1,2,3,4,5,6,7,8};
            int[] a ={1,2,3,4,4,5,6,7,8};
            int[] a ={1,2,7,5,3,5,4,3,2,5,7,8};

            // need to sort the array

            Arrays.sort(a);

          /*  for(int b : a){
                System.out.println(b+" ");
            }*/
            int k=1;

            for(int i=0;i<a.length-1; i++){
                if(a[i]!=a[i+1]){
                    a[k]=a[i+1];
                    k++;
                }

            }

            for(int i=0;i<k;i++){
                System.out.print(a[i]+" ");

            }

        }

}
