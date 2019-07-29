package ca.jrvs;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 * <p>
 * Example 1:
 * Input: "()"
 * Output: true
 * https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        Map<Character, Character> closing = new HashMap<>();
        closing.put('[', ']');
        closing.put('{', '}');
        closing.put('(', ')');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char br = s.charAt(i);
            if (br =='[' || br == '{' || br == '(')
                stack.push(br);
            else if (stack.isEmpty() || (br != closing.get(stack.pop())))
                return false;
        }
        return stack.isEmpty();

    }
}
