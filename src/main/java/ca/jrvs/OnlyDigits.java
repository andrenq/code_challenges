package ca.jrvs;

public class OnlyDigits {
    public static boolean isOnlyDigits(String s) {
        char[] chars = s.toCharArray();
        for (char c :
                chars) {
            if((c<'0')||(c>'9')){
                return false;
            }

        }
        return true;
    }

}
