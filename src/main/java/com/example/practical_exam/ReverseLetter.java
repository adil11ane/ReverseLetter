package com.example.practical_exam;

public class ReverseLetter {
    public String reverseLetter(char[] chars) {
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
            } else if (!Character.isLetter(chars[right])) {
                right--;
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
