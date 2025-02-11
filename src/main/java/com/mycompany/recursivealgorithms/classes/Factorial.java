
package com.mycompany.recursivealgorithms.classes;
import com.mycompany.recursivealgorithms.Abstraction.IResult;

public class Factorial implements IResult<Long> {
    final int number;
    public Factorial(int n){ 
        number = n;
    }
    
    public Factorial(){ 
        number = 0;
    }
    
    // Recursive Function
    private static long factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    @Override
    public Long getResult() {
        return factorial(number);
    }

    @Override
    public void printResult() {
        System.out.println("Factorial: " + number + "! = " + getResult());
    }
}