
package com.mycompany.recursivealgorithms.classes;

import com.mycompany.recursivealgorithms.Abstraction.IResult;

// Reverse a String
public class ReverseString implements IResult<String> {
    final String str;
    public ReverseString(String s){ 
        str = s;
    }
    
    // Recursive Function
    public static String reverseString(String s) {
        return (s.length() <= 1) ? s : reverseString(s.substring(1)) + s.charAt(0);
    }

    @Override
    public String getResult() {
        return reverseString(str);
    }

    @Override
    public void printResult() {
       System.out.println("Reverse String: Original string '" 
                + str + "', Reversed  string '" + getResult() + "'");  
    }
}