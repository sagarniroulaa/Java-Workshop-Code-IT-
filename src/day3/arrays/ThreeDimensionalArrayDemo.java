package day3.arrays;

public class ThreeDimensionalArrayDemo {

    public static void main(String[] args) {
        // Syntax:
        int[][][] threeD = new int[3][4][5];
        // first one -> layers (depth)
        // second one -> how many 1D arrays do we want?
        // third one -> no of items in each 1D array

        threeD[0][0][0] = 10; // first layer, first row, first column
        threeD[0][0][1] = 20; // first layer, first row, second column

        threeD[2][0][0] = 40; // third layer, first row, first column
    }
}
