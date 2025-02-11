
package com.mycompany.recursivealgorithms.classes;

import com.mycompany.recursivealgorithms.Abstraction.ListItem;
import com.mycompany.recursivealgorithms.Abstraction.IResult;
import java.util.Arrays;

// Binary Search
public class BinarySearch extends ListItem implements IResult<Integer> {
    final int Target, UpperIndex;
    
    public BinarySearch(int[] array, int target, int lowerIndex, int upperIndex){ 
        super(array, lowerIndex);
        Target = target;    
        UpperIndex = upperIndex;
    }
    
    public BinarySearch(int[] array, int target, int lowerIndex){ 
        super(array, lowerIndex);
        Target = target;    
        UpperIndex = array.length - 1;
    }
    
    public BinarySearch(int[] array, int target){ 
        super(array, 0);
        Target = target;    
         UpperIndex = array.length - 1;
    }
     
    // Recursive Function
    private int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) return -1; // Target not found
        int mid = (low + high) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) return binarySearch(arr, target, mid + 1, high);
        else return binarySearch(arr, target, low, mid - 1);
    }

    @Override
    public Integer getResult() {
       return binarySearch(Array, Target, Index, UpperIndex);
    }

    @Override
    public void printResult() {
         int result = getResult();
        String searchMessage = (result == -1) ? "Not Found" : "Found at index " + result;
        System.out.println("Binary Search: Searched for " + Target + " in " 
                + Arrays.toString(Array) + " from index " + Index + ": " + searchMessage );
    }
}
