
package com.mycompany.recursivealgorithms.classes;

import com.mycompany.recursivealgorithms.Abstraction.IResult;

// Sum of Digits
public class SumOfDigits implements IResult<Long> {
    final long number;
    
    public SumOfDigits(long n){ 
        number = n;
    }
    
    // Recursive Function
    private long sumOfDigits(long n) {
        return (n == 0) ? 0 : n % 10 + sumOfDigits(n / 10);
    }

    @Override
    public Long getResult() {
       return sumOfDigits(number);
    }

    @Override
    public void printResult() {
         System.out.println("Sum of the digits " + number + " = "  + getResult());
    }
}
