package org.example.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommenEelementsBtwArrays {

    public static void main(String[] args) {
        List l1 = Arrays.asList(1,2,3,4,5,6,7);
        List l2 = Arrays.asList(1,2,4,5);

        Set s1 = new HashSet(l1);

        Set s2 = new HashSet(l2);

        s1.retainAll(s2);
        System.out.println(s1);

    }
}
