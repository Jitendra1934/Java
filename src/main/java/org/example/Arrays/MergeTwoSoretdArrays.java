package org.example.Arrays;

import java.util.Arrays;

public class MergeTwoSoretdArrays {

    /*Input: a[] = {1,3,5,7,9} b[]={2,4,6,8}
    Output: C[]={1,2,3,4,5,6,7,8,9}*/

    public static void main(String[] args) {

        int a[] = {1,3,5,7,9};
        int b[]= {2,4,6,8};
        int s1 = a.length, s2 =b.length;
        int[] c = new int[s1+s2];

        for(int i=0; i<a.length; i++){
            c[i]=a[i];
        }
        for(int j =0; j<b.length; j++){

            c[j+a.length]=b[j];
        }
        Arrays.sort(c);
        for(int d : c){
            System.out.print(d+" ");
        }
    }
}
