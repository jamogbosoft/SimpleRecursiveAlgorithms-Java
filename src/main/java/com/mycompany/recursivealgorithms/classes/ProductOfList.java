
package com.mycompany.recursivealgorithms.classes;

import com.mycompany.recursivealgorithms.Abstraction.ListItem;
import com.mycompany.recursivealgorithms.Abstraction.IResult;
import java.util.Arrays;

// Product of a List
public class ProductOfList extends ListItem implements IResult<Integer>{
    
     public ProductOfList(int[] array, int index){
        super(array, index); // Calls the parent constructor
    }
     
    public ProductOfList(int[] array){
        super(array, 0); // Calls the parent constructor
    }
     
    // Recursive Function
    private int productOfList(int[] arr, int i) {
        return (i == arr.length) ? 1 : arr[i] * productOfList(arr, i + 1);
    }

    @Override
    public Integer getResult() {
        return productOfList(Array, Index);
    }

    @Override
    public void printResult() {
        System.out.println("Product of the list " + Arrays.toString(Array) 
                + " from index " + Index + " = " + getResult());
    }
}