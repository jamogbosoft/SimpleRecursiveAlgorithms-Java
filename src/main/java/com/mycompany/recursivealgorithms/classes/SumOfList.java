
package com.mycompany.recursivealgorithms.classes;

import com.mycompany.recursivealgorithms.Abstraction.ListItem;
import com.mycompany.recursivealgorithms.Abstraction.IResult;
import java.util.Arrays;

// Sum of a List
public class SumOfList extends ListItem  implements IResult<Integer> {
    
    public SumOfList(int[] array, int index){
        super(array, index);
    }
    
    public SumOfList(int[] array){
        super(array, 0);
    }
    
    // Recursive Function
    private int sumOfList(int[] arr, int index) {
        if (index == arr.length) return 0;
        return (index == arr.length) ? 0 : arr[index] + sumOfList(arr, index + 1);
    }

    @Override
    public Integer getResult() {
        return sumOfList(Array, Index);
    }

    @Override
    public void printResult() {
        System.out.println("Sum of the list " + Arrays.toString(Array) 
                + " from index " + Index + " = " + getResult());
    }
}