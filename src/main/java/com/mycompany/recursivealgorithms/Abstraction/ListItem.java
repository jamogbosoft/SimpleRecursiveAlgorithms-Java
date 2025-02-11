
package com.mycompany.recursivealgorithms.Abstraction;

// Abstract base class for a list or array
public abstract class ListItem {
    protected final int[] Array; // Array of numbers
    protected final int Index;  // Starting index

    // Constructor to initialize fields
    public ListItem(int[] array, int index) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }
        if (index < 0 || index >= array.length) {
            throw new IllegalArgumentException("Index out of bounds.");
        }
        Array = array;
        Index = index;
    }
    
    public int[] toList(){
        return Array;
    }
}
