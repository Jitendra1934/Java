package org.example.Strings;

public class MaxOccurenceOfCharacter {

    public static void main(String[] args) {
        String s = "HexawareTechnologies";

        int maxCount=0;
        char mostRepeatedChar=' ';

        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount=count;
                mostRepeatedChar=s.charAt(i);
            }
        }

        System.out.println(mostRepeatedChar+" repeats "+maxCount+" times");
    }
}
