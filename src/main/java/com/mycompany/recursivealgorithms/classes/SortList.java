
package com.mycompany.recursivealgorithms.classes;

import com.mycompany.recursivealgorithms.Abstraction.ListItem;
import com.mycompany.recursivealgorithms.Abstraction.IResult;
import java.util.Arrays;

// Check if an Array is Sorted
public class SortList extends ListItem implements IResult<Boolean> {
    
    public SortList(int[] array, int index){
        super(array, index); // Calls the parent constructor
    }
    
    public SortList(int[] array){
        super(array, 0); // Calls the parent constructor
    }
    
    // Recursive Function
    private boolean isSorted(int[] arr, int index) {
        return (index == arr.length - 1) ? true : 
                arr[index] <= arr[index + 1] && isSorted(arr, index + 1);
    }

    @Override
    public Boolean getResult() {
        return isSorted(Array, Index);
    }

    @Override
    public void printResult() {
        String isSorted = getResult() ? "Yes" : "No";
        System.out.println("Is Sorted " + Arrays.toString(Array) 
                + " from index " + Index + "? " + isSorted);  
    }
}
