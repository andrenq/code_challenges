package ca.jrvs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an input string, reverse the string word by word.
 * Example
 * Input: "the sky is blue"
 * Output: "blue is sky the"
 *
 * https://leetcode.com/problems/reverse-words-in-a-string/
 */
public class ReverseWordsInString {
    public static String reverseWords(String phrase){
        String[] words = phrase.split("[ ]");
        List<String> finalString = new ArrayList<>();
        for(int i=words.length-1; i>=0;i-- ){
            if(!words[i].equals("")){
                finalString.add(words[i]);
            }

        }
        return String.join(" ",finalString);
    }
}
