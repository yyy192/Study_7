package com.bh.b2.token;

import java.util.StringTokenizer;

public class TokenMain {

	public static void main(String[] args) {
		
		String str = "seoul, 92, 80, 비";
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		while(st.hasMoreTokens()) {
			
			String s = st.nextToken();
			System.out.println(s);
		}

	}

}
