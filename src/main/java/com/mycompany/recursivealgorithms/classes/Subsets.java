
package com.mycompany.recursivealgorithms.classes;

import com.mycompany.recursivealgorithms.Abstraction.IResult;

// Generate Subsets
public class Subsets implements IResult<String> {
    final String str;
    final int index;
    
    public Subsets(String str, int index){ 
        this.str = str;
        this.index = index;
    }
    
    public Subsets(String str){ 
        this.str  = str;
        index = 0;
    }
    
    // Recursive Function
    private String subsets(String s, int index, String current) {
        if (index == s.length()) return current + " " ; // Base Case
        return
        subsets(s, index + 1, current + s.charAt(index)) // Include current character
        + subsets(s, index + 1, current); // Exclude current character
    }

    @Override
    public String getResult() {
        return subsets(str, index, "");
    }

    @Override
    public void printResult() {
        System.out.println("The subsets for the string '" + str 
                + "' from index " + index + " = " + getResult());
    }
}