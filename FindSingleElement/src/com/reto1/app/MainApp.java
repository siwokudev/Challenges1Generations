package com.reto1.app;

import model.Reto1;

public class MainApp {

	public static void main(String[] args) {
		
		
		int array1[] = {1,1,2,3,3,4,4,8,8};
		System.out.println(Reto1.findSigleElement(array1));
		
		int array2[] = {3,3,7,7,10,11,11};
		System.out.println(Reto1.findSigleElement(array2));
		
		//case where there is no unique element
		int array3[] = {1,1,2,2,3,3,4,4,5,5};
		System.out.println(Reto1.findSigleElement(array3));
		
		//case where the unique element is at the end of the array
		int array4[] = {1,1,6};
		System.out.println(Reto1.findSigleElement(array4));
		
		//case where the unique element is at the beginning of the array
		int array5[] = {0,5,5};
		System.out.println(Reto1.findSigleElement(array5));
	}

}
