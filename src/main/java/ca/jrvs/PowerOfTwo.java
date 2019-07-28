package ca.jrvs;

public class PowerOfTwo {

    public static boolean isPowerOfTwo2(int numb) {
        if (numb > 1) {
            while ((numb % 2) == 0) {
                numb = numb / 2;
            }
        }
        return (numb == 2) || (numb == 1);
    }
    public static boolean isPowerOfTwo(int numb) {
        return (numb > 0) && ((numb & (numb - 1)) == 0);
    }
}
