package com.example.TestLeetcode;
import java.util.HashSet;

public class Leetcode004 {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        StringBuilder sb=new StringBuilder(s);
        HashSet<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        
        while(i < j){
            char lastChar = s.charAt(j);
            char firstChar = s.charAt(i);
            
            if(set.contains(lastChar)){
                // System.out.println(sb);
                if(set.contains(firstChar)){
                    sb.replace(j , j+1 , ""+firstChar);
                    sb.replace(i , i+1 , ""+lastChar);
                    j--;
                }
                i++;
            }else if(set.contains(firstChar)){
                j--;
            }else{
                i++;j--;
            }
        }
        return sb.toString();
    }
}