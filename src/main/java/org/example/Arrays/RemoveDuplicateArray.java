package org.example.Arrays;

public class RemoveDuplicateArray {

/*
    🔹 Java Coding: Remove duplicates from an array (without HashMap)
*/
        public static void main(String[] args) {

            int[] a ={1,2,7,5,3,5,4,3,2,5,7,8};

            // need to sort the array

            for(int i=0;i<a.length;i++){

                int temp;

                for(int j=i+1;j<a.length;j++){

                    if(a[i]>a[j]){
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }

            }

           /* for(int b : a){
                System.out.print(b+" ");
            }
*/
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
