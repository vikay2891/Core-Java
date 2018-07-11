package com.interview;

import java.util.Arrays;

public class DuplicatesfromArray {

	public static void main(String[] args) {
		
		removeDuplicate(new int  [] {4,5,6,4,2,1,5,1});
		// TODO Auto-generated method stub

	}

	private static void removeDuplicate(int[] is) {
		
	
	int noOfElement= is.length;
	
	for (int i = 0; i < noOfElement; i++) {
		for (int j = i+1; j < noOfElement; j++) {
			if(is[i]==is[j]) {
				is[j]=is[noOfElement-1];
				noOfElement--;
				
			
			}
			
		}
		
	}
	 int[] array1 = Arrays.copyOf(is, noOfElement);
	 
	 for (int i = 0; i < array1.length; i++) {
		System.out.println(array1[i]);
	}
	}

}
