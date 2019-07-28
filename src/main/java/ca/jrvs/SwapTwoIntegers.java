package ca.jrvs;

public class SwapTwoIntegers {
    public static int[] swapingIntegers(int a, int b){
        int[] answer = new int[2];
        a = a+b;
        b = a-b;
        a=  a-b;
        answer[0]=a;
        answer[1]=b;
        return answer;
    }
}
