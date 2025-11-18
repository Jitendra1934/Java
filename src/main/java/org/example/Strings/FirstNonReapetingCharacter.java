package org.example.Strings;

public class FirstNonReapetingCharacter {

   /* String Question: Find the first non-repeating character in a string
    Example: "swiss" → 'w'*/

    public static void main(String[] args) {

        String s = "jitendra";

        for(int i=0;i<s.length();i++){
            int count=1;
            for(int j=i+1; j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.println("First non repeatig charcter is "+s.charAt(i));
                break;
            }
        }
    }
}

