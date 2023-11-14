package ad1;

import java.io.*;

class q16 {

    // Recursive Method to search key in the array
    static int linearsearch(int arr[], int size, int key)
    {
        if (size == 0) {
            return -1;
        }
        else if (arr[size - 1] == key) {

            // Return the index of found key.
            return size - 1;
        }
        return linearsearch(arr, size - 1, key);
    }

    // Driver method
    public static void main(String[] args)
    {
        int arr[] = { 5, 15, 6, 9, 4 };
        int key = 15;

        // Function call to find key
        int index = linearsearch(arr, arr.length, key);
        if (index != -1)
            System.out.println(
                "The element " + key + " is found at "
                + index + " index of the given array.");

        else
            System.out.println("The element " + key
                               + " is not found.");
    }
}