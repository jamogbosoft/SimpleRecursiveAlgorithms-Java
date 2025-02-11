
package com.mycompany.recursivealgorithms.classes;

import com.mycompany.recursivealgorithms.Abstraction.IResult;

// Power Calculation
public class Power implements IResult<Integer> {
    final int x, y;
    public Power(int a, int b){ 
        x = a;
        y = b;
    }
    
    // Recursive Function
    private int power(int a, int b) {
        return (b == 0) ? 1 : a * power(a, b - 1);
    }

    @Override
    public Integer getResult() {
        return power(x, y);
    }

    @Override
    public void printResult() {
        System.out.println("Power: " + x + "^" + y + " =  " + getResult());  
    }
}