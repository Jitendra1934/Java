package org.example.Strings;

public class ReverseTheStringByPreservingSpace {
    public static void main(String[] args) {
        String s ="Sai Chandu is a high paid Automation test engineer";
        char[] a = s.toCharArray();

        char[] r = new char[a.length];

        for(int i=0;i<a.length;i++){

            if(a[i]==' ') {
                r[i] = ' ';
            }
        }
        int j=a.length-1;
        for(int i=0;i<a.length;i++){
            if (a[i] != ' ') {
                if(r[j]==' '){
                    j--;
                }
                r[j]=a[i];
                j--;
            }
        }
       String s1 = new String(r);
        System.out.println(s1);
    }
}
