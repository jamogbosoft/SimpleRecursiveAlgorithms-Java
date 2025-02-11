
package com.mycompany.recursivealgorithms.classes;
import com.mycompany.recursivealgorithms.Abstraction.IResult;

// Count Digits in a Number // Basic Assumption n > 0
public class CountDigits implements IResult<Integer> {
    final long number;
    public CountDigits(long n){ 
        number = n;
    }
    
    // Recursive Function
    private int countDigits(long n) {
        return (n == 0) ? 0 : 1 + countDigits(n / 10);
    }

    @Override
    public Integer getResult() {
        return countDigits(number);
    }

    @Override
    public void printResult() {
        System.out.println("Count the digits " + number + ": " + getResult());
    }
} 