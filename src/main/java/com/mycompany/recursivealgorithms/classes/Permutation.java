
package com.mycompany.recursivealgorithms.classes;

import com.mycompany.recursivealgorithms.Abstraction.IResult;

// Permutation of a String
public class Permutation implements IResult<String> {
    final String str;
    
    public Permutation(String s, int index){ 
        str = s.substring(index);
    }
    
     public Permutation(String s){ 
        str = s;
    }
    
    // Recursive Function
    private String permutation(String s, String prefix) {
        if (s.isEmpty()) return prefix + " ";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result += permutation(s.substring(0, i) + s.substring(i + 1), prefix + s.charAt(i));
        }
        return result;
    }

    @Override
    public String getResult() {
        return permutation(str, "");
    }

    @Override
    public void printResult() {
        System.out.println("The permutations for the string '" 
                + str + "' = " + getResult()); 
    }
}
