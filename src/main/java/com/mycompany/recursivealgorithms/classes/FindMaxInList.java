
package com.mycompany.recursivealgorithms.classes;

import com.mycompany.recursivealgorithms.Abstraction.ListItem;
import com.mycompany.recursivealgorithms.Abstraction.IResult;
import java.util.Arrays;

// Find Maximum in a List
public class FindMaxInList extends ListItem implements IResult<Integer> {
    
    public FindMaxInList(int[] array, int index){
        super(array, index); // Calls the parent constructor
    }
    
    public FindMaxInList(int[] array){
        super(array, 0); // Calls the parent constructor
    }
    
    // Recursive Function
    private int findMaxInList(int[] arr, int index) {
        return (index == arr.length - 1) ? arr[index] : 
                Math.max(arr[index], findMaxInList(arr, index + 1));
    }
       
    @Override
    public Integer getResult(){
        return findMaxInList(Array, Index);
    }

    @Override
    public void printResult() {
         System.out.println("Max of numbers " + Arrays.toString(Array) 
                + " from index " + Index + " = " + getResult());
    }
}
