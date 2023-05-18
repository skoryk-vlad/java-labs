package edu.nmu.skoryk;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int MAX_SIZE = 20;
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int width, height, choice;

        do {
            System.out.println("Введіть ширину матриці (не більше " + MAX_SIZE + "):");
            width = SCANNER.nextInt();
        } while (width > 20 || width < 0);

        do {
            System.out.println("Введіть висоту матриці (не більше " + MAX_SIZE + "):");
            height = SCANNER.nextInt();
        } while (height > 20 || height < 0);

        int[][] matrix;

        do {
            System.out.println("Виберіть спосіб заповнення матриці:\n1 - Рандомно\n2 - З клавіатури");
            choice = SCANNER.nextInt();
        } while (choice > 2 || choice < 0);

        if (choice == 1) {
            matrix = generateRandomMatrix(width, height);
        } else {
            matrix = readMatrixFromKeyboard(width, height);
        }

        System.out.println("Матриця:");
        printMatrix(matrix);

        int min = findMin(matrix);
        int max = findMax(matrix);
        double average = calculateAverage(matrix);

        System.out.println("Мінімальний елемент: " + min);
        System.out.println("Максимальний елемент: " + max);
        System.out.println("Середнє арифметичне: " + average);
    }

    private static int[][] generateRandomMatrix(int width, int height) {
        Random random = new Random();
        int[][] matrix = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
            }
        }

        return matrix;
    }

    private static int[][] readMatrixFromKeyboard(int width, int height) {
        int[][] matrix = new int[height][width];

        System.out.println("Введіть елементи матриці:");

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("Елемент [" + i + "][" + j + "]:");
                matrix[i][j] = SCANNER.nextInt();
            }
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

    private static int findMin(int[][] matrix) {
        int min = matrix[0][0];

        for (int[] row : matrix) {
            for (int num : row) {
                if (num < min) {
                    min = num;
                }
            }
        }

        return min;
    }

    private static int findMax(int[][] matrix) {
        int max = matrix[0][0];

        for (int[] row : matrix) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }

        return max;
    }

    private static double calculateAverage(int[][] matrix) {
        int sum = 0;
        int count = 0;

        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
                count++;
            }
        }

        return (double) sum / count;
    }
}