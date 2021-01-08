package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		UnNum un = new UnNum();
		
		System.out.println(un.sum(1, 2, 3));
		System.out.println(un.sum(3, 3, 3));
		System.out.println(un.sum(1, 1, 2));

	}

}
