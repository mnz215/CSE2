/**
 * Murphy Zingsheim
 * April 23, 2015
 * Professor Brian Chen
 */

import java.util.Random;
import java.util.Scanner;

public class Multiply {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the width and height of two matricies: ");
		System.out.print("Width: ");
		int width = scan.nextInt();
		System.out.print("Height: ");
		int height = scan.nextInt();
		while (width != height || width != (int)width || height != (int)height || width < 1 || height < 1) {
			System.out.println("Invalid width and height. Please try again: ");
			
			System.out.print("Width: ");
			width = scan.nextInt();
			System.out.print("Height: ");
			height = scan.nextInt();
		}


		int[][] left = randomMatrix(width, height);
		int[][] right = randomMatrix(width, height);

		System.out.println("First matrix: ");
		printMatrix(left);

		System.out.println();
		
		System.out.println("Second matrix: ");
		printMatrix(right);

		System.out.println();

		System.out.println("Product of first and second matrix: ");
		int[][] finalMatrix = matrixMultiply(left, right);
		printMatrix(finalMatrix);
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] randomMatrix(int width, int height) {
		Random random = new Random();

		int[][] matrix = new int[width][height];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				int rand = random.nextInt(21) - 10;
				matrix[i][j] = rand;
			}
		}

		return matrix;
	}

	public static int[][] matrixMultiply(int[][] left, int[][] right) {
		if (left.length != right[0].length) {
			System.out.println("Error: The matricies are not the same size.");
			return null;
		}

		int[][] matrix = new int[left.length][right[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				int dotProduct = 0;
				for (int k = 0; k < matrix.length; k++) {
					dotProduct += left[i][k]*right[k][j];
				}
				matrix[i][j] = dotProduct;
			}
		}

		return matrix;
	}
}