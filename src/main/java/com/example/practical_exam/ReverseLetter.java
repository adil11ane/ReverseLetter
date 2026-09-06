package com.example.practical_exam;

public class ReverseLetter {
    public static String reverseLetter(String word){
        if (word == null || word.isBlank()){
            return " ";
        }
        char[] chars = word.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if ( !Character.isLetter(chars[left])) {
                left++;
                continue;
            } else if ( !Character.isLetter(chars[right])) {
                right--;
                continue;
            }
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
