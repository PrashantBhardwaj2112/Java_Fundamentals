package leetCodeQuestions;

public class q344 {
        public static char[] reverseString(char[] s)
        {
            int start = 0;
            int end = s.length-1;
            while(start<end){
                char temp = s[end];
                s[end] = s[start];
                s[start] = temp;
                start++;
                end--;
            }
            return s;
        }
    public static void main(String[] args) {
        char[] str ={'h','e','l','l','o'};
        reverseString(str);
        System.out.println(str);
    }
}

// https://leetcode.com/problems/reverse-string/description/
/*
344. Reverse String
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.



Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */