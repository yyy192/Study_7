package com.bh.b1.String;

public class StringMain7 {

	public static void main(String[] args) {
		int num = 10;
		
		String n = String.valueOf(num);
		System.out.println(n);
		
		String a = "baek";
		String b = "hyun";

		StringBuffer ab = new StringBuffer();
		ab.append(a);
		ab.append(b);
		ab.append(56);
		
		String str = ab.toString();
		
		System.out.println(ab); // ab.toString()
		System.out.println(str);

	}

}
