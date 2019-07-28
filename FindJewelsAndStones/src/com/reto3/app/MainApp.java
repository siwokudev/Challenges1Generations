package com.reto3.app;

import model.reto3;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String J = "aA";
		String S = "aAAbbbb";
		
		System.out.println(reto3.FindJewelsAndStones(J, S));
		
		String J2 = "z";
		String S2 = "ZZ";
		
		System.out.println(reto3.FindJewelsAndStones(J2, S2));
	}

}
