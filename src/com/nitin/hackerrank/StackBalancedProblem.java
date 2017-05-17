package com.nitin.hackerrank;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class StackBalancedProblem {
    
	private static boolean isOpenBracket(char chr) {
	    return (chr == '(' || chr == '{' || chr == '[');
	}

	private static Character getClosingBracket(Character chr) {
	    switch(chr) {
	        case '(':
	            return ')';
	        case '[':
	            return ']';
	        case '{':
	            return '}';
	        default:
	                return 'N';

	    }
	
	}

	public static boolean isBalanced(String expression) {
	    
	    
	    String A$B;
	    Deque<Character> stack = new ArrayDeque<Character>();
	    Character head = null;
	    for (int bracketIndex = 0; bracketIndex < expression.length(); bracketIndex++) {
	        char bracket = expression.charAt(bracketIndex);
	        if (isOpenBracket(bracket)) {
	            stack.push(new Character(bracket));
	        } else {
	            if (stack.isEmpty()) {
	                return false;
	            }
	            head = stack.peek();
	            if (getClosingBracket(head) == bracket) {
	                stack.pop();
	            }
	        }
	    }
	    
	    return stack.isEmpty();
	}
  
    public static void main(String[] args) {
    	 ArrayList n = new ArrayList();
 	    n.add("String");
 	    n.add(true);
 	    for(int i=0;i<n.size();i++){
 	    	System.out.println(n.get(i));
 	    }
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
