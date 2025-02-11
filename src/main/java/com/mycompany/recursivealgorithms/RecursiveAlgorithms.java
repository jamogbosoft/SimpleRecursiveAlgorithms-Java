package com.mycompany.recursivealgorithms;

import com.mycompany.recursivealgorithms.classes.*;

public class RecursiveAlgorithms {
    public static void main(String[] args) {
        // Variables or inputs        
        int[] array = {14, 10, 9, 25, 7, 18, 17, 19, 20, 21};   
        int[] sortedArray = {1, 2, 9, 16, 17, 21, 28, 35, 46, 48};   
        int n = 15; //For Factorial and Fibonacci
        int startIndex = 5; // For FindMaxInList, SumOfList, ProductOfList, and BinarySearch start index
        int x = 3, y = 5; // For Power ie x^y
        int d1 = 48, d2 = 18; // For GreatestCommonDivisor
        long digits = 1234567890122334455L;        
        int decimalNumber = 2025; //For decimal to binary conversion (dec > 0)
        int searchingItem = 19;
        int forSumOfEvenNumbers = 25; //SumOfEvenNumbers parameter        
        String reverseString = "Software Engineering"; //For ReverseString     
        String subsetString = "SICT"; //For Subsets and Permutations
        int subsetIndex = 0; //For Subsets and Permutations
        
        ////////////////////////////////////////////////////////////////////////
        String headerText = "The Output of Applying OOP to Simple Recursive Algorithms Using Java";
        String footerText = "Thank you for banking with us";    
        String underline = "============================================================================";
        int consoleWidth = 100; 
        // Calculate the padding needed to center the text
        int paddingHeader = (consoleWidth - headerText.length()) / 2;
        int paddingLine = (consoleWidth - underline.length()) / 2;
        int paddingFooter = (consoleWidth - footerText.length()) / 2;
        ////////////////////////////////////////////////////////////////////////
        
        
        // Example calls to test the Recursive Algorithms
        
        System.out.println(String.format("\n%" + paddingHeader + "s%s", "", headerText));
        System.out.println(String.format("%" + paddingLine + "s%s\n", "", underline));
        
        //println("{:^100}", "The Output of Applying OOP to Simple Recursive Algorithms Using C++23", n);
       // println("{:^100}", "=======================================================================\n");

        // 1. Factorial -> n!
        Factorial fact = new Factorial( n );
        fact.printResult();

        // 2. Fibonacci -> Fn(x)
        Fibonacci fib = new Fibonacci( n );
        fib.printResult();

        // 3. Count the digits in a number (n > 0)
        CountDigits count = new CountDigits(digits);
        count.printResult();

        // 4. Sum the digits in a number (n > 0)
        SumOfDigits sum = new SumOfDigits(digits);
        sum.printResult();

        // 5. Find the maximum number in a list
        FindMaxInList maxInList = new FindMaxInList( array, startIndex);
        maxInList.printResult();

        // 6. Calculate the sum of the number in a list
        SumOfList sumOfList = new SumOfList(array, startIndex);
        sumOfList.printResult();

        // 7. Calculate the product of the number in a list
        ProductOfList productOfList = new ProductOfList(array, startIndex);
        productOfList.printResult();

        // 8. Check if an array is sorted
        SortList sortList1 = new SortList(array, startIndex);  
        SortList sortList2 = new SortList(sortedArray, startIndex);
        sortList1.printResult();
        sortList2.printResult();

        // 9. Binary Search
        BinarySearch bsearch1 = new BinarySearch(sortedArray, searchingItem, startIndex);
        BinarySearch bsearch2 = new BinarySearch(sortedArray, 16);
        bsearch1.printResult();
        bsearch2.printResult();
        

        // 10. Calculate x^y
        Power power = new Power(x, y);
        power.printResult();

        // 11. Decimal to Binary Conversion
        DecimalToBinary decToBin = new DecimalToBinary(decimalNumber);
        decToBin.printResult();

        // 12. Greatest Common Divisor
        GreatestCommonDivisor gcd = new GreatestCommonDivisor(d1, d2);
        gcd.printResult();

        // 13. Sum of Even Numbers
        SumOfEvenNumbers sumEven = new SumOfEvenNumbers(forSumOfEvenNumbers);
        sumEven.printResult();

        // 14. Reverse a String
        ReverseString reverseStr = new ReverseString(reverseString);
        reverseStr.printResult();

        // 15. Generate Subsets
        Subsets subsetsStr1 = new Subsets(subsetString);
        Subsets subsetsStr2 = new Subsets(subsetString, subsetIndex);
        subsetsStr1.printResult();
        subsetsStr2.printResult();

        // 16. Permutation of a String        
        Permutation nPr = new Permutation(subsetString);
        nPr.printResult();
        
        
        System.out.println(String.format("\n\n%" + paddingFooter + "s%s\n", "", footerText));
    }
}