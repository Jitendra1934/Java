package org.example.Strings;

public class ConvertCase {

/*
     **Example Input**: HexAwarE → **Output**: hEXaWARe
*/
    public static void main(String[] args) {

        String s="HexAwarE";
        System.out.println("input "+s);
        String s1="";

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            if(Character.isLetter(ch)){

                if(ch>='a' && ch<='z'){
                    ch = Character.toUpperCase(ch);
                    s1=s1+ch;
                }
                else{
                   ch = Character.toLowerCase(ch);
                    s1=s1+ch;
                }
            }
        }
        System.out.println("output "+s1);
    }

    public String caseConvert(){
        //logic to implement the code
        return null;
    }
}
