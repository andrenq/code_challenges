package ca.jrvs;

public class ValidPalindrome {
    /**
     * https://leetcode.com/problems/valid-palindrome/
     * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
     * @param words
     * @return boolean
     */

    public static Boolean isPalindrome(String words){
        words = words.replaceAll("[^A-Za-z0-9]","");
        StringBuilder worker = new StringBuilder();
        worker.append(words);
        worker = worker.reverse();
        String words2 = new String(worker);
        if(words.equalsIgnoreCase(words2)){
            return true;
        }else{
            return false;
        }
    }

}
