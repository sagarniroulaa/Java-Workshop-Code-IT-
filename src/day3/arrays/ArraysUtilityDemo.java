package day3.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysUtilityDemo {
    // Arrays Utility Class
    // toString(array), return type is void, sout
    // deepToString(array)
    // sort(array)
    // copyOf(array, newLength);
    // equals(arr1, arr2)
    // fill(array, value)
    // binarySearch(array, key)

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr));

        int[][] twoD = {
                {2,3},
                {1,2},
        };
        System.out.println(Arrays.deepToString(twoD));
        
        int[] arrToSort = {5,3,8,1};
        Arrays.sort(arrToSort);
        System.out.println(Arrays.toString(arrToSort));

        int[] arrToCopy = {5,4,3};
        int[] copy = Arrays.copyOf(arrToCopy, 5);
        System.out.println(Arrays.toString(copy));

        int[] a = {1,2,3};
        int[] b = {1,2,5};
        boolean isEqual = Arrays.equals(a, b);
        System.out.println(isEqual);

        int[] arrToFill = new int[5];
        Arrays.fill(arrToFill, 7);
        System.out.println(Arrays.toString(arrToFill));

        int[] arrToSearch = {1, 3, 5, 7};
        int index = Arrays.binarySearch(arrToSearch, 5);
        System.out.println(index);
    }
}
