
package com.mycompany.recursivealgorithms.classes;

import com.mycompany.recursivealgorithms.Abstraction.IResult;

// Greatest Common Divisor
public class GreatestCommonDivisor implements IResult<Integer> {
    final int x, y;
    public GreatestCommonDivisor(int a, int b){
        x = a;
        y = b;
    }
    
    // Recursive Function
    public static int greatestCommonDivisor(int a, int b) {
        return (b == 0) ? a : greatestCommonDivisor(b, a % b);
    }

    @Override
    public Integer getResult() { 
        return greatestCommonDivisor(x, y);
    }

    @Override
    public void printResult() {
        System.out.println("Greatest common divisor for " 
                + x + " and " + y + " = " + getResult());
    }
}