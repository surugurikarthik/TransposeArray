


import java.util.Scanner;

public class TransposeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
         int[][] array = new int[rows][cols];
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }
       int[][] transposedArray = transpose(array);
        System.out.println("Original 2D array:");
        printArray(array);
        System.out.println("Transposed 2D array:");
        printArray(transposedArray);

        sc.close();
    }
     public static int[][] transpose(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int[][] transposedArray = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedArray[j][i] = array[i][j];
            }
        }

        return transposedArray;
    }
     public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
