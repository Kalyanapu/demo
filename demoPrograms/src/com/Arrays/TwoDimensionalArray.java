package com.Arrays;

public class TwoDimensionalArray {
	int[][] arr;

	public TwoDimensionalArray(int row, int column) {

		arr = new int[row][column];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = Integer.MIN_VALUE;
			}

		}

	}

	public void insertionOfArray(int row, int col, int value) {

		try {
			if (arr[row][col] == Integer.MIN_VALUE) {
				arr[row][col] = value;
				System.out.println("values inserted");
				return;

			}
			System.out.println("value already exists");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid input");
		}

	}

	public void traversal() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

	public void searchingOfArray(int value) {

		try {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i][j] == value) {
						System.out.println("value found at :" + i + " " + j + "index");
						return;
					}

				}
				System.out.println("value not found");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid input");
		}

	}

	public void deleteArray(int rowIndex, int colIndex) {

		try {
			arr[rowIndex][colIndex] = Integer.MIN_VALUE;
			System.out.println("value deleted/replaced");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid input");
		}

	}

}
