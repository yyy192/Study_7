package com.bh.b1.String;

public class StringMain4 {

	public static void main(String[] args) {
		String n1 = "bh";
		String n2 = "bh";
		String n3 = new String("bh");
		String n4 = new String("bh");
		
		System.out.println(n1 == n2); //true
		System.out.println(n3 == n4); //false
		System.out.println(n1 == n3); //false
		System.out.println("-------------------");
		//equals = 문자열 비교

		System.out.println(n1.equals(n2));
		System.out.println(n3.equals(n4));
		System.out.println(n1.equals(n3));
	}

}
