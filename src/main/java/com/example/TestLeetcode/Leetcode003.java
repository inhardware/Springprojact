package com.example.TestLeetcode;

public class Leetcode003 {
    public void reverseString(char[] s) {
        StringBuffer sb = new StringBuffer();
        sb.append(s);
        sb.reverse();

        for (int i = 0; i < s.length; i++) {
            s[i] = sb.charAt(i);
        }
  }
}