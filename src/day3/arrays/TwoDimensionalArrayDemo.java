package day3.arrays;

public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        // 1. 1D Array
        // 2. 2D Array (Matrix)
        // Arrays on arrays
        int[][] twoD = new int[3][4];
        // first one -> how many 1D arrays?
        // second one -> how many elements in each array

        int[][] array = {
                {2, 4, 5, 6},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };

        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array[i].length;j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // 4 -> 1D array, each should contain 5 items

        // 3. 3D Array (Cube-like structure)
    }
}
