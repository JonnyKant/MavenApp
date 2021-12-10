package com.example.mavenTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        List list = Arrays.asList(6, 1, 3, 6, 1, 3, 8, 9, 1, 4, 5, 7, 9);
        HashSet l = new HashSet(list);
        for(Object o : l){
            System.out.println(l);
        }
    }
}
