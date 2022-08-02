package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    //All good over here.
    public String[] seasonsArray() {
        String[] seasonsArray = new String[]{"Winter","Spring","Summer","Autumn"};
        return seasonsArray;
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    // This one is finished.
    public int[] generateNumbers(int length) {
        int[] theArray = new int[length];
        int insertedNumber = 1;
        for (int i = 0; i+1 <= length; i++) {
            theArray[i] = insertedNumber;
            insertedNumber++;
        }
        return theArray;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    // This one is done.
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i+1 <= arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */

    public int findIndexOfNumber(int[] arr, int number) {
        int indexPlaceToBeReturned = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == number) {
                indexPlaceToBeReturned = i;
                break;
            }else{
                indexPlaceToBeReturned = -1;
            }
        }

        return indexPlaceToBeReturned;
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
        //This is finished.
    public String[] reverseArray(String[] arr) {
        String[] newArray = new String[arr.length];
        int counter = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            newArray[counter] = arr[i];
            counter++;
        }
        return newArray;
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */

    public int[] getOnlyPositiveNumbers(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] > 0) {
                newArray[i] = arr[i];
            }
        }
        return newArray;

    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */

    public int[][] sortRaggedArray(int[][] arr) {
        int[][] newArray = new int[2][2];

        return newArray;

    }


}
