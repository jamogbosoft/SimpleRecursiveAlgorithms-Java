
package com.mycompany.recursivealgorithms.classes;

import com.mycompany.recursivealgorithms.Abstraction.IResult;

// Fibonacci Sequence
public class Fibonacci implements IResult<Integer>{
    final int number;
    
    public Fibonacci(int n){
        number = n;
    }
    
    public Fibonacci(){
        number = 0;
    }
    
    // Recursive Function
    private int fibonacci(int n) {
        return (n <= 1) ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }

    @Override
    public Integer getResult() {
        return fibonacci(number);
    }

    @Override
    public void printResult() {
        System.out.println("Fibonacci: Fn(" + number + ") = " + getResult());
    }
}