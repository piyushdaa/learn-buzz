//add 2 matrics of 2x3

package learn-buzz.CodeWithHarry.Array.PS;

import java.util.Scanner;

public class PS_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[2][3];
        int[][] matrix2 = new int[2][3];
        int[][] result = new int[2][3];
        int i = 0;
        while (i < 4) {
            int j = 0;
            while (j < 3) {
                if (i < 2) {
                    System.out.printf("Enter number for Matrix 1 [%d][%d]: ", i + 1, j + 1);
                    matrix[i][j] = sc.nextInt();
                } else {
                    System.out.printf("Enter number for Matrix 2 [%d][%d]: ", i + 1 - 2, j + 1);
                    matrix2[i - 2][j] = sc.nextInt();
                }
                j++;
            }
            i++;
        }
        i = 0;
        while (i < 4) {
            int j = 0;
            while (j < 3) {
                if (i < 2) {
                    System.out.printf("%d ", matrix[i][j]);
                    if (i == 1 && j == 2) {
                        System.out.print("\n\n");
                    }
                } else {
                    System.out.printf("%d ", matrix2[i - 2][j]);
                }
                j++;
            }
            System.out.print("\n");
            i++;
        }
        System.out.print("\n");
        i = 0;
        while (i < 2) {
            int j = 0;
            while (j < 3) {
                result[i][j] = matrix[i][j] + matrix2[i][j];
                System.out.printf("%d ", result[i][j]);
                j++;
            }
            System.out.print("\n\n");
            i++;
        }
    }
}