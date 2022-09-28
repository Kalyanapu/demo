package com.Arrays;

public class MainTwoDimensional {

	public static void main(String[] args) {
		TwoDimensionalArray t = new TwoDimensionalArray(2, 2);
		System.out.println("inserting.....");
		t.insertionOfArray(0, 0, 10);
		t.insertionOfArray(0, 1, 20);
		t.insertionOfArray(1, 0, 30);
		t.insertionOfArray(1, 1, 40);
		System.out.println("searching......");
		t.searchingOfArray(50);
		System.out.println("deleting......");
		t.deleteArray(0, 0);
		t.deleteArray(0, 5);
		System.out.println("travesing");
		t.traversal();

	}

}
