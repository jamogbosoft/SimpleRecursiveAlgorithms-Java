
package com.mycompany.recursivealgorithms.classes;

import com.mycompany.recursivealgorithms.Abstraction.IResult;

// Sum of Even Numbers
public class SumOfEvenNumbers implements IResult<Long> {
    final int number;
    public SumOfEvenNumbers(int a){ 
        number = a;
    }
    
    // Recursive Function
    private long sumOfEvenNumbers(int n) {
         return (n <= 0) ? 0 : (n % 2 == 0) ? n + sumOfEvenNumbers(n - 2) : sumOfEvenNumbers(n - 1);
    }
    
    @Override
    public Long getResult() {
        return sumOfEvenNumbers(number);
    }

    @Override
    public void printResult() {
         System.out.println("The sum of even numbers up to " + number 
                 + " is: "  + getResult()); 
    }
}
