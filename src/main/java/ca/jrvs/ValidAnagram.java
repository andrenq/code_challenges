package ca.jrvs;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t ){
        char[] sCA = s.toCharArray();
        char[] tCA = t.toCharArray();
        if (sCA.length != tCA.length){
            return false;
        }
        Arrays.sort(sCA);
        Arrays.sort(tCA);

        return Arrays.equals(sCA,tCA);
    }
}
