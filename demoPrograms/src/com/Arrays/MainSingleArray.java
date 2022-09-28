package com.Arrays;

public class MainSingleArray {

	public static void main(String[] args) {
		SingleDimensionalArray s = new SingleDimensionalArray(5);
		System.out.println("inserting values");
		s.insertionOfArray(0, 10);
		s.insertionOfArray(1, 20);
		s.insertionOfArray(2, 30);
		s.insertionOfArray(3, 40);
		s.insertionOfArray(4, 50);
		System.out.println("searching..");
		s.searchingOfArray(10);
		System.out.println("deletion of Array");
		s.deleteArray(0);
		System.out.println("travesing..");
		s.traversal();
	}

}
