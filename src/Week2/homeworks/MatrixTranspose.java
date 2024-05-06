package Week2.homeworks;

import java.util.Scanner;

public class MatrixTranspose {
    //creates matrix according to the user input
    public static int[][] createMatrix() {
        //create matrix based on the input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + (i+1) + ", " + (j+1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
    //finds the transpose of the matrix
    public static int[][] getTranspose(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] matrix2 = new int [columns][rows];

        for(int i=0;i<matrix2.length;i++){
            for(int j=0;j<matrix2[i].length;j++){
                matrix2[i][j]=matrix[j][i];
                System.out.printf(matrix2[i][j]+" ");
            }
            System.out.println();
        }
        return matrix2;
    }

    public static void main(String[] args) {
        int[][] matrix = createMatrix();
        //method call to find the transpose
        getTranspose(matrix);

    }
}
