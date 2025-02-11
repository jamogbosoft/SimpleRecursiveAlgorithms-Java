
package com.mycompany.recursivealgorithms.classes;

import com.mycompany.recursivealgorithms.Abstraction.IResult;

// Decimal to Binary Conversion
public class DecimalToBinary implements IResult<String> {
    final long number;
    public DecimalToBinary(long n){ 
        number = n;
    }
    
    // Recursive Function, n > 0
    private String decimalToBinary(long n) {
        return (n <= 0) ? "" : decimalToBinary(n / 2) + (n % 2);
    }

    @Override
    public String getResult() {
       return decimalToBinary(number);
    }

    @Override
    public void printResult() {
        System.out.println("Decimal to Binary: " + number + " = " + getResult());  
    }
}
