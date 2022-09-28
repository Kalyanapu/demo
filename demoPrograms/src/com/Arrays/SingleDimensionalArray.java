package com.Arrays;

public class SingleDimensionalArray {

	int[] arr;

	public SingleDimensionalArray(int size) {

		arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MAX_VALUE;

		}

	}

	public void insertionOfArray(int location, int value) {

		try {
			if (arr[location] == Integer.MIN_VALUE) {
				arr[location] = value;
				System.out.println("value inserted");
				return;
			}
			System.out.println("value exists");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid input");
		}

	}

	public void traversal() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public void searchingOfArray(int value) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				System.out.println("value found at index of:" + " " + i);
				return;
			}
		}
		System.out.println("value out of range");
	}

	public void deleteArray(int index) {

		arr[index] = Integer.MAX_VALUE;
		System.out.println("value deleted");
		return;
	}

}
